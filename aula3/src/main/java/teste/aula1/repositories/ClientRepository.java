package teste.aula1.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import teste.aula1.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository <Client, Long>{
    
    
}
