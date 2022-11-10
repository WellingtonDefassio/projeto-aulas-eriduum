package com.example.projeto.aulas.outher.controller;

import com.example.projeto.aulas.outher.data.dto.v1.PersonDTO;
import com.example.projeto.aulas.outher.data.dto.v2.PersonDTOV2;
import com.example.projeto.aulas.outher.model.Person;
import com.example.projeto.aulas.outher.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v2/person")
public class PersonControllerV2 {

    @Autowired
    private PersonService personService;


    @GetMapping()
    public List<PersonDTO> findAll() {
        return personService.findAll();
    }

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonDTO findById(@PathVariable("id") Long id) {
        return personService.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public PersonDTOV2 createV2(@RequestBody PersonDTOV2 person) {
        return personService.createV2(person);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public PersonDTO update(@RequestBody Person person) {
        return personService.update(person);
    }

    @DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity delete(@PathVariable("id") Long id) {
        personService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
