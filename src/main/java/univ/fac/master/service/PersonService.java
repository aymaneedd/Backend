package univ.fac.master.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.fac.master.entities.Person;
import univ.fac.master.repositories.PersonRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonService {

    @Autowired
    PersonRepository pr;

    public List<Person> getAllPersons(){
        return pr.findAll();
    }

    public Person addPerson(Person p) {
        return pr.save(p);
    }

    public void deletePerson(Long id){
        pr.deleteById(id);
    }

    public Person updatePerson(Person p){
        return pr.save(p);
    }
}
