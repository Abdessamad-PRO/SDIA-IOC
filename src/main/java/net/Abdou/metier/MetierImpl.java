package net.Abdou.metier;

import net.Abdou.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("metier")
@Service("metier")
public class MetierImpl implements IMetier {
    //@Autowired
    private IDao dao;

    /**
     *
     * Constructeur avec paramètre
     */
    public MetierImpl(@Qualifier("d") IDao dao) {
        this.dao = dao;
    }

    @java.lang.Override
    public double calcul() {
        double t = dao.getData();
        double res = t*12*Math.PI/2 * Math.cos(t);
        return res;
    }
}
