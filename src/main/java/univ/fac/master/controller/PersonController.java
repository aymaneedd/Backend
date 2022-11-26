package univ.fac.master.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import univ.fac.master.entities.Person;
import univ.fac.master.service.PersonService;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonService ps;

    @GetMapping("personne")
    public List<Person> getAllPersons(){
        return ps.getAllPersons();
    }

    @PostMapping("personne")
    public Person addPerson(@RequestBody Person p) {
        return ps.addPerson(p);
    }

    @DeleteMapping("personne/{id}")
    public void deletePerson(@PathVariable Long id){
        ps.deletePerson(id);
    }

    @PutMapping("personne")
    public Person updatePerson(@RequestBody Person p){
        return ps.updatePerson(p);
    }
}
