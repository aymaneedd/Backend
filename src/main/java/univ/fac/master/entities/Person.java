package univ.fac.master.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data @AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    Long id;
    String name;
    int age;
}
