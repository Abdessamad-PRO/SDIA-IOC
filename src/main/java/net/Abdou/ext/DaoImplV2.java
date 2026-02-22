package net.Abdou.ext;

import net.Abdou.dao.IDao;

public class DaoImplV2 implements IDao {
    @java.lang.Override
    public double getData() {
        System.out.println("Version de Capteur");
        double t=12;
        return t;
    }
}
