package bdcc.jee.presentation;

import bdcc.jee.dao.IDao;
import bdcc.jee.metier.IMetier;

import java.io.File;
import java.lang.reflect.*;
import java.util.Scanner;

public class DynamicDIApp {
    public static void main(String[] args){
        try{
            // Dynamic instanciation
            Scanner scanner = new Scanner(new File("src/main/config.txt"));
            String daoClassName = scanner.next();
            String metierCassName = scanner.next();
            Class cdao = Class.forName(daoClassName);
            IDao dao = (IDao) cdao.getConstructor().newInstance();

            Class cmetier = Class.forName(metierCassName);
            IMetier metier = (IMetier) cmetier.getConstructor().newInstance();

            Method setDao = cmetier.getMethod("setDao", IDao.class);
            setDao.invoke(metier, dao);

            System.out.println("result = "+metier.calcul());
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
