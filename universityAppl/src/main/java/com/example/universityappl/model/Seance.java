package com.example.universityappl.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Seance {
    @Id
    @GeneratedValue
    private int id_seance ;
    private String hd ;
    private String hf ;
    private Date date ;

   /* @OneToMany( mappedBy="seance",cascade = CascadeType.ALL, orphanRemoval=true)
    private Collection<User> users ;

    @OneToMany( mappedBy="seance",cascade = CascadeType.ALL, orphanRemoval=true)
    private Collection<Matiere> matieres ;
*/

}