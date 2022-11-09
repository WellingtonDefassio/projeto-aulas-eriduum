package com.example.projeto.aulas.outher.service;


import com.example.projeto.aulas.outher.data.dto.v1.PersonDTO;
import com.example.projeto.aulas.outher.mapper.DozerMapper;
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
        Person person = personRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No records found for this ID"));
        return DozerMapper.parseObject(person, PersonDTO.class);
    }

    public List<PersonDTO> findAll() {
        logger.info("Find all person");

        List<PersonDTO> personDTOS = DozerMapper.parseListObjects(personRepository.findAll(), PersonDTO.class);

        return personDTOS;
    }


    public PersonDTO create(Person person) {
        logger.info("Create one person!");
        return DozerMapper.parseObject(personRepository.save(person), PersonDTO.class);
    }
    public PersonDTO update(Person person) {
        logger.info("Create one person!");
        Person personRetorn = personRepository.findById(person.getId()).orElseThrow(() -> new NoSuchElementException("No records found for this ID"));
        return DozerMapper.parseObject(personRetorn, PersonDTO.class);
    }


    public void deleteById(Long id) {
        logger.info("Delete person");

        personRepository.deleteById(id);
    }
}
