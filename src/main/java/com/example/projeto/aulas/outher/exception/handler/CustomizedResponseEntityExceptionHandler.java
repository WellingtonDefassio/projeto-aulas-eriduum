package com.example.projeto.aulas.calculator.exception.handler;

import com.example.projeto.aulas.calculator.exception.ExecptionResponse;
import com.example.projeto.aulas.calculator.exception.UnsupportedMathOperationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExecptionResponse> handleAllExceptions(Exception ex, WebRequest request) {

        ExecptionResponse execptionResponse = new ExecptionResponse(
                new Date(), ex.getMessage(), request.getDescription(false), HttpStatus.INTERNAL_SERVER_ERROR.value());

        return new ResponseEntity<>(execptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(UnsupportedMathOperationException.class)
    public final ResponseEntity<ExecptionResponse> handleBadRequestExceptions(Exception ex, WebRequest request) {

        ExecptionResponse execptionResponse = new ExecptionResponse(
                new Date(), ex.getMessage(), request.getDescription(false), HttpStatus.BAD_REQUEST.value());

        return new ResponseEntity<>(execptionResponse, HttpStatus.BAD_REQUEST);

    }


}
