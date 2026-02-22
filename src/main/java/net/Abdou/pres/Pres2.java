package net.Abdou.pres;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        CDao.newInstance();

    }
}
