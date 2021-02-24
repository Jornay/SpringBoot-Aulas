package teste.aula1.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teste.aula1.dto.ClientDTO;
import teste.aula1.entities.Client;
import teste.aula1.repositories.ClientRepository;

@Service
public class ClientService {


    @Autowired
    private ClientRepository repo;


    public List<ClientDTO> getClient(){
        

        List <Client> list = repo.findAll();
        List <ClientDTO> listDTO = new ArrayList<>();
        
        for(Client c : list){
            ClientDTO dto = new ClientDTO(c.getId(), c.getName());
            listDTO.add(dto);
        }

        return  listDTO;
    }
}
