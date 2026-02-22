package net.Abdou.dao;

public class DaoImpl implements IDao {
    @java.lang.Override
    public double getData() {
        System.out.println("version de base de données");
        double t=34;
        return t;
    }
}
