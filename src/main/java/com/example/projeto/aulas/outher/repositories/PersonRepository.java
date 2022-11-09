package com.example.projeto.aulas.outher.repositories;

import com.example.projeto.aulas.outher.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
