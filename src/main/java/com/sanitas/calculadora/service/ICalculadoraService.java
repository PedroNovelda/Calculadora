package com.sanitas.calculadora.service;

public interface ICalculadoraService {

    /**
     * Calcula para los números la operación definida por el operador
     *
     * @param numero1
     * @param operador
     * @param numero2
     * @return Resultado de la operación (Depende del tipo de operación)
     */
    Double calcula(Double numero1, String operador, Double numero2);
}
