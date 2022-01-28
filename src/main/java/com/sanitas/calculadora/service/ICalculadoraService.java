package com.sanitas.calculadora.service;

public interface ICalculadoraService {

    /**
     * Calcula para los números la operación definida por el operador
     *
     * @param numero1
     * @param numero2
     * @param operador
     * @return Resultado de la operación (Depende del tipo de operación)
     */
    Double calcula(Double numero1, Double numero2, String operador);
}
