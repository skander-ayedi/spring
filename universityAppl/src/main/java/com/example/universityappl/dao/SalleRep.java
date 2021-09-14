package com.example.universityappl.dao;

import com.example.universityappl.model.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface SalleRep extends JpaRepository<Salle, Integer> {
}
