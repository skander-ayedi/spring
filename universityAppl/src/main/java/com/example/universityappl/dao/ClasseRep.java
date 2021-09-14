package com.example.universityappl.dao;

import com.example.universityappl.model.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClasseRep extends JpaRepository<Classe, Integer> {
}
