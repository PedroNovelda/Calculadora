package com.sanitas.calculadora.model;

import io.corp.calculator.TracerImpl;

public class Operacion implements IOperacion {

    private IOperacion operacion;

    TracerImpl tracer = new TracerImpl();

    public Operacion(String operacion) {

        this.setOperacion(operacion);
    }

    public double calcular(double a, double b) {

        double resultado = operacion.calcular(a, b);

        tracer.trace("Operacion :: " + resultado);

        return resultado;
    }

    public void setOperacion(IOperacion operacion) {

        this.operacion = operacion;
    }

    public void setOperacion(String operacion) {

        switch (operacion)
        {
            case "+":
                this.operacion = new Suma();
                break;

            case "-":
                this.operacion = new Resta();
                break;

            case "*":
                this.operacion = new Multiplicacion();
                break;

            case "/":
                this.operacion = new Division();
                break;

            default:
                System.out.println("EXCEPCION: Tipo de operacion no permitida");
                break;
        }
    }
}
