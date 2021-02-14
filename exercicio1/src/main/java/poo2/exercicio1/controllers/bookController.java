package poo2.exercicio1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo2.exercicio1.DTO.bookDTO;
import poo2.exercicio1.services.BookServices;

@RestController
@RequestMapping("/book")
public class bookController {

    @Autowired
    private BookServices service;

    @GetMapping
    public ResponseEntity<List<bookDTO>> getBook(){
        List <bookDTO> list = service.getBook();
        return ResponseEntity.ok(list);
    }
}
