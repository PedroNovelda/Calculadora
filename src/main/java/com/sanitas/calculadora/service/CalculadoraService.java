package com.sanitas.calculadora.service;

import com.sanitas.calculadora.model.Operacion;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService implements ICalculadoraService {

    public Double calcula(Double numero1, String operador, Double numero2) {

        Operacion operacion = new Operacion(operador);

        return operacion.calcular(numero1, numero2);
    }
}
