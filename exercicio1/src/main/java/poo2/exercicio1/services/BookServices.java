package poo2.exercicio1.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poo2.exercicio1.DTO.bookDTO;
import poo2.exercicio1.entities.Book;
import poo2.exercicio1.repositories.bookRepository;

@Service
public class BookServices {
    
    @Autowired
    private bookRepository repo;

    public List<bookDTO> getBook(){
        List <Book> list = repo.getBook();
        List <bookDTO> listDTO = new ArrayList<>();

        for(Book c: list){
            bookDTO dto = new bookDTO(c.getTitle() ,c.getDescription(), c.getReleaseDate());
            listDTO.add(dto);
        }
        
        return listDTO;
    }
}
