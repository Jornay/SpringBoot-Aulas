package poo2.exercicio1.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import poo2.exercicio1.entities.Book;

@Component
public class bookRepository {
    
    public List<Book> getBook(){
        
        Book b1 = new Book();
        b1.setId(1l);
        b1.setTitle("It is dog or not a dog?");
        b1.setDescription("Book about the life of a Jonas Dog that his family believed that he is not a dog");
        b1.setReleaseDate("2020-10-09");

        Book b2 = new Book();
        b2.setId(2l);
        b2.setTitle("The art of Programming");
        b2.setDescription("Program is a form of art or no? Aren't there infinite forms of systems architectures that put human creativity to the test?");
        b2.setReleaseDate("2021-14-02");

        List <Book> list =  new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b1);
        list.add(b2);

        return list;


    }
}
