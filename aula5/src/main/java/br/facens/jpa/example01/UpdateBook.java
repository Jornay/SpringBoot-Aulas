package br.facens.jpa.example01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateBook {

    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU_SAMPLES");

        EntityManager em = factory.createEntityManager();
        
        Book book = em.find(Book.class,2l);
   
        if(book != null){
            book.setAuthor("FernandaCruz32 2313");
        }
        else{
            System.out.println("Book not found");
        }
        
        em.getTransaction().begin();
        em.getTransaction().commit();

        em.close();
        factory.close();
    }
}
