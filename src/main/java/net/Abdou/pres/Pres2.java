package net.Abdou.pres;
import net.Abdou.dao.IDao;
import net.Abdou.metier.IMetier;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import java.io.*;
public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException,InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao d = (IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(d);
        System.out.println("résultat = " +metier.calcul());

    }
}
