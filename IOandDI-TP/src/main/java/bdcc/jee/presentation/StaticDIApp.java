package bdcc.jee.presentation;

import bdcc.jee.dao.IDaoImpl;
import bdcc.jee.metier.IMetierImpl;

public class StaticDIApp {
    public static void main(String[] args) {
        IDaoImpl iDao = new IDaoImpl();
        IMetierImpl iMetier = new IMetierImpl();
        iMetier.setDao(iDao);
        iDao.getDate();
        double age = iMetier.calcul();
        System.out.println("my age: "+age);
    }
}
