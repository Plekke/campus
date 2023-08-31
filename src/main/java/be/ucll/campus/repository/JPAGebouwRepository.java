package be.ucll.campus.repository;

import be.ucll.campus.entity.Gebouw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class JPAGebouwRepository implements GebouwRepository{

    @Autowired
    private final EntityManager em;

    public JPAGebouwRepository(EntityManager em){this.em = em;}
    @Override
    public List<Gebouw> getAllGebouwen() {return em.createQuery("select g from Gebouw g").getResultList();}

    @Override
    public void addGebouw(Gebouw gebouw) {
        em.getTransaction().begin();
        em.persist(gebouw);
        em.getTransaction().commit();
    }

    @Override
    public Gebouw getGebouw(Integer id) {return null;}

    @Override
    public void updateGebouw(Integer id, Gebouw gebouw) {
        em.getTransaction().begin();
        em.merge(gebouw);
        em.getTransaction().commit();
    }

    @Override
    public void deleteGebouw(int id) {}
}
