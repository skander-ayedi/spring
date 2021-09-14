package com.example.universityappl.dao;
import com.example.universityappl.model.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DepartementRep extends JpaRepository <Departement, Integer> {
}
