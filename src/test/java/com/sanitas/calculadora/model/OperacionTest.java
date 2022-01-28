package com.sanitas.calculadora.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperacionTest {

    /**
     * Test de la Operacion Suma
     */
    @Test
    public void operacionCalcularSuma() {

        Operacion operacion = new Operacion("suma");

        Assertions.assertEquals(operacion.calcular(1,2), new Double(3));
    }

    /**
     * Test de la Operacion Resta
     */
    @Test
    public void operacionCalcularResta() {

        Operacion operacion = new Operacion("resta");

        Assertions.assertEquals(operacion.calcular(6,5), new Double(1));
    }

    /**
     * Test de la Operacion Multiplicacion
     */
    @Test
    public void operacionCalcularMultiplicacion() {

        Operacion operacion = new Operacion("multiplicacion");

        Assertions.assertEquals(operacion.calcular(4,-2), new Double(-8));
    }

    /**
     * Test de la Operacion Division
     */
    @Test
    public void operacionCalcularDivision() {

        Operacion operacion = new Operacion("division");

        Assertions.assertEquals(operacion.calcular(9,3), new Double(3));
    }

    /**
     * Test de la Operacion Division por Cero
     */
    @Test
    public void operacionCalcularDivisionPorCero() {

        Operacion operacion = new Operacion("division");

        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> operacion.calcular(9, 0));
        Assertions.assertEquals("EXCEPCION: Division por cero", exception.getMessage());
    }
}
