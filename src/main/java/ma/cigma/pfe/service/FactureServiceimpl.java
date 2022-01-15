package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.IfactureDAO;
import ma.cigma.pfe.models.Facture;

public class FactureServiceimpl implements IFactureService{

    IfactureDAO fDAO;

    public void setDao(IfactureDAO dao) {
        this.fDAO = dao;
    }
    @Override
    public Facture save(Facture f) {
        return null;
    }
}
