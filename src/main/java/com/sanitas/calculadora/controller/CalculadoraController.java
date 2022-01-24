package com.sanitas.calculadora.controller;

import com.sanitas.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Gestiona el método GET /api/calculadora
 */
@RestController
@RequestMapping("/api")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping(value = "/calculadora")
    public ResponseEntity<Double> calculadora(@RequestParam(name = "numero1") Double numero1,
                                              @RequestParam(name = "operador") String operador,
                                              @RequestParam(name = "numero2") Double numero2) {

        Double resultado = calculadoraService.calcula(numero1, operador, numero2);

        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }
}
