package teste.aula3.repositories;

import org.springframework.stereotype.Repository;

import teste.aula3.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClientRepository extends JpaRepository <Client, Long>{
    
    
}
