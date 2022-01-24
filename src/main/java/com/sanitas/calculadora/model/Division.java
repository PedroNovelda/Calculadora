package com.sanitas.calculadora.model;

public class Division implements IOperacion {

    @Override
    public double calcular(double a, double b) {

        double resultado = 0.0;

        try {
            resultado = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("EXCEPCION: Division por cero");
        }

        return resultado;
    }
}
