package ma.cigma.pfe.controller;

import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.service.FactureServiceimpl;
import ma.cigma.pfe.service.IFactureService;

public class FactureController {
    IFactureService service;
    FactureController(){

    }
    public void setFactureService(FactureServiceimpl fs) {
        this.service = fs;
    }
    public Facture save(Facture f)
    {
        f.toString();
     //   service.save(f);
        return  null;
    }
}
