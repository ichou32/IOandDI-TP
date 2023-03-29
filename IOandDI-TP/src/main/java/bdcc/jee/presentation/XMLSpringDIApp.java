package bdcc.jee.presentation;

import bdcc.jee.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLSpringDIApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("src/main/java/springIOC.xml");
        IMetier metier = (IMetier) context.getBean("bdcc.jee.metier");
        System.out.println(metier.calcul());
    }
}
