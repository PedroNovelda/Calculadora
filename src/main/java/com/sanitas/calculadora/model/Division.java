package com.sanitas.calculadora.model;

public class Division implements IOperacion {

    @Override
    public double calcular(double a, double b) {

        double resultado = 0.0;

        try {

            if (b == 0) {
                throw new ArithmeticException();
            }

            else {
                resultado = a / b;
            }
        }

        catch (ArithmeticException e) {
            throw new ArithmeticException("EXCEPCION: Division por cero");
        }

        return resultado;
    }
}
