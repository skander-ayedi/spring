package com.example.universityappl.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Matiere {
    @Id
    @GeneratedValue
    private int id_matiere ;
    private String nom_mat;

   /* @JoinColumn(name = "id_seance", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Seance seance ;*/
}
