package com.sanitas.calculadora.model;

public class Operacion implements IOperacion {

    private IOperacion operacion;

    public Operacion(String operacion) {

        this.setOperacion(operacion);
    }

    public double calcular(double a, double b) {

        return operacion.calcular(a, b);
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
