package net.Abdou.pres;

import net.Abdou.metier.IMetier;
import net.Abdou.metier.MetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationcontext= new AnnotationConfigApplicationContext("net.Abdou");
        IMetier metier = applicationcontext.getBean(IMetier.class);
        System.out.println("resulat=" + metier.calcul());
    }
}
