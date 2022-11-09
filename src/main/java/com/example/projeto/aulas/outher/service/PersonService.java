package com.example.projeto.aulas.outher.service;


import com.example.projeto.aulas.outher.data.dto.v1.PersonDTO;
import com.example.projeto.aulas.outher.model.Person;
import com.example.projeto.aulas.outher.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@Service
public class PersonService {


    private Logger logger = Logger.getLogger(PersonService.class.getName());

    @Autowired
     private PersonRepository personRepository;



    public PersonDTO findById(Long id) {
        logger.info("Find one person");

        return personRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No records found for this ID"));
    }

    public List<PersonDTO> findAll() {
        logger.info("Find all person");

        return personRepository.findAll();
    }


    public PersonDTO create(Person person) {
        logger.info("Create one person!");
        return personRepository.save(person);
    }
    public PersonDTO update(Person person) {
        logger.info("Create one person!");
        personRepository.findById(person.getId()).orElseThrow(() -> new NoSuchElementException("No records found for this ID"));
        return person;
    }


    public void deleteById(Long id) {
        logger.info("Delete person");

        personRepository.deleteById(id);
    }
}
