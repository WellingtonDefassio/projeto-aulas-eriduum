package com.example.projeto.aulas.outher.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class ExecptionResponse implements Serializable {


    private Date timestamp;
    private String message;
    private String details;
    private Integer statusCode;


}
