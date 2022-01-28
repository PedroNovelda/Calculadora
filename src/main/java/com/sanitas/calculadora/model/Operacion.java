package com.sanitas.calculadora.model;

import io.corp.calculator.TracerImpl;

public class Operacion implements IOperacion {

    private IOperacion operacion;

    TracerImpl tracer = new TracerImpl();

    public Operacion(String operador) {

        this.setOperacion(operador);
    }

    public double calcular(double a, double b) {

        double resultado = operacion.calcular(a, b);

        tracer.trace("Operacion :: " + resultado);

        return resultado;
    }

    public void setOperacion(IOperacion operacion) {

        this.operacion = operacion;
    }

    public void setOperacion(String operador) {

        switch (operador)
        {
            case "suma":
                this.operacion = new Suma();
                break;

            case "resta":
                this.operacion = new Resta();
                break;

            case "multiplicacion":
                this.operacion = new Multiplicacion();
                break;

            case "division":
                this.operacion = new Division();
                break;

            default:
                throw new ArithmeticException("EXCEPCION: Tipo de operacion no permitida");
        }
    }
}
