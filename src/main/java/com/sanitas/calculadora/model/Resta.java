package com.sanitas.calculadora.model;

public class Resta implements IOperacion {

    @Override
    public double calcular(double a, double b) {

        return a - b;
    }
}
