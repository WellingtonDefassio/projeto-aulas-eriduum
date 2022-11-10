package com.example.projeto.aulas.outher.data.dto.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDTOV2 {


    private Long id;
    private String firstName;

    private String lastName;

    private String address;

    private String gender;

    private Date birthDay;


}
