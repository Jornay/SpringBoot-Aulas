package exercicio2.exercicio2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exercicio2.exercicio2.dto.EmployeDTO;
import exercicio2.exercicio2.services.employeService;

@RestController
@RequestMapping("/employees")
public class EmployeController {
    
    @Autowired
    private employeService service;

    @GetMapping
    public ResponseEntity<List<EmployeDTO>> getEmploye(){
        List <EmployeDTO> list = service.getEmployes();
        return ResponseEntity.ok(list);
    }  

}
