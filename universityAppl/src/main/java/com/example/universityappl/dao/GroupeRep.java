package com.example.universityappl.dao;
import com.example.universityappl.model.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GroupeRep extends JpaRepository <Groupe, Integer> {
}
