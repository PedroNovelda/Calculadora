package com.sanitas.calculadora.model;

public class Operacion implements IOperacion {

    private IOperacion operacion;

    public double calcular(double a, double b) {

        return operacion.calcular(a, b);
    }

    public void setOperacion(IOperacion operacion) {

        this.operacion = operacion;
    }
}
