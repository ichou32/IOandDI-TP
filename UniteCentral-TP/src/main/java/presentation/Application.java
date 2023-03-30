package presentation;

import metier.UniteCentral;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
        UniteCentral uc = context.getBean(UniteCentral.class);
        uc.printData("hello");

    }
}
