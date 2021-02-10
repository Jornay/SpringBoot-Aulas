package teste.aula1.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import teste.aula1.entities.Client;

@Component
public class ClientRepository {
    
   
    public List<Client> getClient(){
        Client c1 = new Client();
        c1.setId(1l);
        c1.setName("Jorge");
        c1.setAddress("Algum lugar ai");

        Client c2 = new Client();
        c2.setId(2l);
        c2.setName("Henrique");
        c2.setAddress("Outro lugar");

        List <Client> list  = new ArrayList<>();
        list.add(c1);
        list.add(c2);


        return  list;
    }
}
