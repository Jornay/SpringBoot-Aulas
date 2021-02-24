package teste.aula1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import teste.aula1.dto.ClientDTO;
import teste.aula1.services.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {
    
    @Autowired
    private ClientService service;
   
    @GetMapping
    public ResponseEntity<List<ClientDTO>> getClient() {
        List <ClientDTO> list = service.getClient();


        return  ResponseEntity.ok(list);
    }

}
