package com.example.projeto.aulas.calculator.controller;

import com.example.projeto.aulas.calculator.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("math")
public class MathController {

    @Autowired
    MathService mathService;

    @GetMapping("sum/{n1}/{n2}")
    public Double sum(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) {

        return mathService.soma(n1, n2);
    }

    @GetMapping("sub/{n1}/{n2}")
    public Double sub(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) {
        return mathService.sub(n1, n2);
    }

    @GetMapping("mult/{n1}/{n2}")
    public Double mult(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) {

        return mathService.mult(n1, n2);
    }

    @GetMapping("divide/{n1}/{n2}")
    public Double divide(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) {

        return mathService.divide(n1, n2);
    }

    @GetMapping("avg/{n1}/{n2}")
    public Double avg(@PathVariable(value = "n1") String n1, @PathVariable(value = "n2") String n2) {

        return mathService.avg(n1, n2);
    }

    @GetMapping("rq/{n1}")
    public Double rq(@PathVariable(value = "n1") String n1) {

        return mathService.rq(n1);
    }


}
