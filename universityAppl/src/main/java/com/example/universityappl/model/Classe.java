package com.example.universityappl.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Classe {

    @Id
    @GeneratedValue
    private int id_classe;
    private String filiere;
    private String niveau;

   /* @OneToMany(mappedBy = "classe", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<User> users;

    @JoinColumn(name = "id_departement", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Departement departement;

    @OneToMany(mappedBy = "classe", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Groupe> groupes;*/

}