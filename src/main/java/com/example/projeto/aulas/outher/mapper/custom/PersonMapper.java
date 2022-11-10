package com.example.projeto.aulas.outher.mapper.custom;

import com.example.projeto.aulas.outher.data.dto.v2.PersonDTOV2;
import com.example.projeto.aulas.outher.model.Person;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonMapper {

    public PersonDTOV2 convertEntityToDTO(Person person) {

        return PersonDTOV2.builder().id(person.getId()).address(person.getAddress()).birthDay(new Date()).firstName(person.getFirstName()).lastName(person.getLastName()).build();


    }

    public Person convertDTOToEntity(PersonDTOV2 personDTOV2) {

        return Person.builder().id(personDTOV2.getId()).address(personDTOV2.getAddress()).firstName(personDTOV2.getFirstName()).lastName(personDTOV2.getLastName()).build();


    }

}
