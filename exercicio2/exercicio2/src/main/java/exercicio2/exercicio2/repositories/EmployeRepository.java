package exercicio2.exercicio2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import exercicio2.exercicio2.entities.employeEntitie;

@Repository
public interface EmployeRepository extends JpaRepository <employeEntitie, Long>{
    
}
