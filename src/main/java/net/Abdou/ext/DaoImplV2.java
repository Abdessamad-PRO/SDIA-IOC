package net.Abdou.ext;

import net.Abdou.dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("d2")
public class DaoImplV2 implements IDao {
    @java.lang.Override
    public double getData() {
        System.out.println("Version de Capteur");
        double t=12;
        return t;
    }
}
