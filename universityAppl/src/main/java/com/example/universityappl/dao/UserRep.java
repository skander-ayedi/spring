package com.example.universityappl.dao;
import com.example.universityappl.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRep extends JpaRepository <User, Integer> {
}
