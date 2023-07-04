package com.codeclan.example.filesandfolders.repositories;

import com.codeclan.example.filesandfolders.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
