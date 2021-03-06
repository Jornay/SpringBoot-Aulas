package br.facens.jpa.example01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertBook {

    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

        EntityManager em = factory.createEntityManager();

        Book b1 = new Book();
        //b1.setId(5l);
        b1.setAuthor("Glauco Todesco");
        b1.setPrice(10.22);
        b1.setTitle("The Art of Java Programming");


        em.persist(b1);
        
        em.getTransaction().begin();
        em.getTransaction().commit();

        em.close();
        factory.close();
    }
}
