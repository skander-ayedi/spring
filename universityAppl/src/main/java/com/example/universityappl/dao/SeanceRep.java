package com.example.universityappl.dao;

import com.example.universityappl.model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface SeanceRep extends JpaRepository<Seance, Integer> {
}
