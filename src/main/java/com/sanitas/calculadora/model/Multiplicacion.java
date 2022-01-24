package com.sanitas.calculadora.model;

public class Multiplicacion implements IOperacion {

    @Override
    public double calcular(double a, double b) {

        return a * b;
    }
}
