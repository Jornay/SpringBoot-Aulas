package com.facens.pooii.sistema.sistema.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.facens.pooii.sistema.sistema.dto.ClientDTO;
import com.facens.pooii.sistema.sistema.dto.ClientInsertDTO;
import com.facens.pooii.sistema.sistema.dto.ClientUpdateDTO;
import com.facens.pooii.sistema.sistema.entities.Client;
import com.facens.pooii.sistema.sistema.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ClientService {


    @Autowired
    private ClientRepository repo;

    public List<ClientDTO> getClients(){
        
        List <Client>     list   = repo.findAll();
        
        
        return toDTOList(list);
    }

    public ClientDTO getClientById(Long id){

        Optional<Client> op = repo.findById(id);

        Client cli  = op.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Client not found..."));

        return new ClientDTO(cli);
    }

    public ClientDTO insert(ClientInsertDTO dto){
        Client entity = new Client(dto);

        entity = repo.save(entity);

        return new ClientDTO(entity);
    }

    public void delete(Long id){
        try{    
            repo.deleteById(id);
        }
        catch(EmptyResultDataAccessException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Client not found...");
        }
    }
    
    public ClientDTO update(Long id, ClientUpdateDTO updateDto){
        try{
            Client entity = repo.getOne(id);
                        entity.setName(updateDto.getName());
                        entity = repo.save(entity);
                    
                        return new ClientDTO(entity);
        }  
        catch(EmptyResultDataAccessException e){  
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Client not found...");
            
        }
    }

    public List<ClientDTO> toDTOList(List<Client> list){
        List <ClientDTO> listDTO = new ArrayList<>();

        for(Client c: list){
            ClientDTO dto = new ClientDTO(c.getId(), c.getName());
            listDTO.add(dto);
        }

        return listDTO;

    }
    
}
