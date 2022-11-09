package com.example.projeto.aulas.calculator.service;

import com.example.projeto.aulas.calculator.exception.UnsupportedMathOperationException;
import org.springframework.stereotype.Service;

import static com.example.projeto.aulas.calculator.utils.NumbersUtil.convertToDouble;
import static com.example.projeto.aulas.calculator.utils.NumbersUtil.isNumeric;

@Service
public class MathService {
    public Double soma(String n1, String n2) {

        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new UnsupportedMathOperationException("All params must be numeric");
        }

        return convertToDouble(n1) + convertToDouble(n2);
    }

    public Double sub(String n1, String n2) {
        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new UnsupportedMathOperationException("All params must be numeric");
        }

        return convertToDouble(n1) - convertToDouble(n2);
    }

    public Double mult(String n1, String n2) {
        if (!isNumeric(n1) || !isNumeric(n2)) {

            throw new UnsupportedMathOperationException("All params must be numeric");
        }
        return convertToDouble(n1) * convertToDouble(n2);
    }

    public Double divide(String n1, String n2) {
        if (!isNumeric(n1) || !isNumeric(n2)) {

            throw new UnsupportedMathOperationException("All params must be numeric");
        }

        return convertToDouble(n1) / convertToDouble(n2);
    }

    public Double avg(String n1, String n2) {
        if (!isNumeric(n1) || !isNumeric(n2)) {
            throw new UnsupportedMathOperationException("All params must be numeric");
        }

        return (convertToDouble(n1) + convertToDouble(n2)) / 2;
    }

    public Double rq(String n1) {
        if (!isNumeric(n1)) {
            throw new UnsupportedMathOperationException("All params must be numeric");
        }
        return Math.sqrt(convertToDouble(n1));
    }
}
