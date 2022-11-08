package com.example.projeto.aulas.calculator;

import com.example.projeto.aulas.calculator.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("math")
public class MathController {

    @GetMapping("sum/{n1}/{n2}")
    public Double sum(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) {

        if (!isNumeric(n1) || !isNumeric(n2)) {
            System.out.println(n1);
            System.out.println(n2);
            throw new UnsupportedMathOperationException("All params must be numeric");
        }

        return convertToDouble(n1) + convertToDouble(n2);
    }

    @GetMapping("sub/{n1}/{n2}")
    public Double sub(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) {

        if (!isNumeric(n1) || !isNumeric(n2)) {
            System.out.println(n1);
            System.out.println(n2);
            throw new UnsupportedMathOperationException("All params must be numeric");
        }

        return convertToDouble(n1) - convertToDouble(n2);
    }

    @GetMapping("mult/{n1}/{n2}")
    public Double mult(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) {

        if (!isNumeric(n1) || !isNumeric(n2)) {
            System.out.println(n1);
            System.out.println(n2);
            throw new UnsupportedMathOperationException("All params must be numeric");
        }

        return convertToDouble(n1) * convertToDouble(n2);
    }

    @GetMapping("divide/{n1}/{n2}")
    public Double divide(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) {

        if (!isNumeric(n1) || !isNumeric(n2)) {
            System.out.println(n1);
            System.out.println(n2);
            throw new UnsupportedMathOperationException("All params must be numeric");
        }

        return convertToDouble(n1) / convertToDouble(n2);
    }

    @GetMapping("avg/{n1}/{n2}")
    public Double avg(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) {

        if (!isNumeric(n1) || !isNumeric(n2)) {
            System.out.println(n1);
            System.out.println(n2);
            throw new UnsupportedMathOperationException("All params must be numeric");
        }

        return (convertToDouble(n1) + convertToDouble(n2)) / 2;
    }

    @GetMapping("rq/{n1}")
    public Double rq(@PathVariable(value = "n1") String n1) {

        if (!isNumeric(n1)) {
            System.out.println(n1);
            throw new UnsupportedMathOperationException("All params must be numeric");
        }

        return Math.sqrt(convertToDouble(n1));
    }









    private Double convertToDouble(String srtNumber) {
        if(srtNumber == null) return 0D;
        String number = srtNumber.replaceAll(",", ".");
        if(isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

    private boolean isNumeric(String srtNumber) {
        if(srtNumber == null) return false;
        String number = srtNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }


}
