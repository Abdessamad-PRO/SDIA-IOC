package net.Abdou.metier;

import net.Abdou.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    /**
     *
     * Constructeur avec paramètre
     */
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @java.lang.Override
    public double calcul() {
        double t = dao.getData();
        double res = t*12*Math.PI/2 * Math.cos(t);
        return t;
    }
}
