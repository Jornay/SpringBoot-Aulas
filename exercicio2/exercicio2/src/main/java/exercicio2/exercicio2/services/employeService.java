package exercicio2.exercicio2.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exercicio2.exercicio2.dto.EmployeDTO;
import exercicio2.exercicio2.entities.employeEntitie;
import exercicio2.exercicio2.repositories.EmployeRepository;

@Service
public class employeService {
    
    @Autowired
    private EmployeRepository repo;

    public List<EmployeDTO> getEmployes(){
        List <employeEntitie> list = repo.findAll();
        List <EmployeDTO>     listDTO =  new ArrayList<>();

        for(employeEntitie c: list){
            EmployeDTO dto = new EmployeDTO(c.getId(), c.getName(),c.getCargo());
            listDTO.add(dto);
        }

        return listDTO;
    }

}
