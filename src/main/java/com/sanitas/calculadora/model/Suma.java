package com.sanitas.calculadora.model;

public class Suma implements IOperacion {

    @Override
    public double calcular(double a, double b) {

        return a + b;
    }
}
