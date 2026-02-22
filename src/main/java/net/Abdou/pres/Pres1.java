package net.Abdou.pres;

import net.Abdou.dao.DaoImpl;
import net.Abdou.metier.MetierImpl;
import net.Abdou.net.Abdou.ext.DaoImplV2;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl(dao);
        //double c = metier.calcul();
        System.out.println("le resultat est:" + metier.calcul());
    }
}
