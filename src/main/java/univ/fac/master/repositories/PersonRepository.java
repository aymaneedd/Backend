package univ.fac.master.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import univ.fac.master.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
}
