package br.facens.jpa.example01;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SelectAllBook {

    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

        EntityManager em = factory.createEntityManager();

        List <Book> list = em.createQuery("SELECT o FROM Book o", Book.class).getResultList();

        for(Book b : list){
            System.out.println(b);
        }
        

        Book book = em.createQuery("SELECT o FROM Book o WHERE o.id = 1", Book.class).getSingleResult();
        System.out.println(book);
    
        TypedQuery<Book> q = em.createQuery("SELECT o FROM Book o WHERE o.id = :id", Book.class);
        q.setParameter("id","1");
        book = q.getSingleResult();
        System.out.println(book);
    


        em.close();
        factory.close();
    }
}
