package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactureDAOimpl implements IfactureDAO{
    EntityManagerFactory emf=
            Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em=emf.createEntityManager();

    public FactureDAOimpl() {
    }
    @Override
    public Facture save(Facture f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();


        return null;
    }
}
