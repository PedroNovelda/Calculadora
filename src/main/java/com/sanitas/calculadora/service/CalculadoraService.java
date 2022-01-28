package com.sanitas.calculadora.service;

import com.sanitas.calculadora.model.Operacion;
import io.corp.calculator.TracerImpl;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService implements ICalculadoraService {

    TracerImpl tracer = new TracerImpl();

    public Double calcula(Double numero1, String operador, Double numero2) {

        Operacion operacion = new Operacion(operador);

        double resultado = operacion.calcular(numero1, numero2);

        tracer.trace("CalculadoraService :: " + resultado);

        return resultado;
    }
}
