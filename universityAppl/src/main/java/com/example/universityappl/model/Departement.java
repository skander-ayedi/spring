package com.example.universityappl.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.security.SecureRandom;
import java.util.Collection;

@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Departement {
    @Id
    @GeneratedValue
    private int id_departement ;
    private String nom ;


    /*@OneToMany(mappedBy = "departement", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Classe> classes;

    @ManyToMany
    Collection<User> users;*/

}