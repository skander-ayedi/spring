package com.example.universityappl.dao;
import com.example.universityappl.model.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MatiereRep extends JpaRepository<Matiere, Integer> {
}
