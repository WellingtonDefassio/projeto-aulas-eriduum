package com.example.projeto.aulas.outher.data.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"address", "firstName", "lastName", "gender"})
public class PersonDTO {

    @JsonProperty("name")
    private String firstName;

    private String lastName;

    private String address;

    private String gender;


}
