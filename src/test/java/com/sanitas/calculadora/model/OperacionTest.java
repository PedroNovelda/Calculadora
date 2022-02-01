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

        Assertions.assertEquals(3d, operacion.calcular(1,2));
    }

    /**
     * Test de la Operacion Resta
     */
    @Test
    public void operacionCalcularResta() {

        Operacion operacion = new Operacion("resta");

        Assertions.assertEquals(1d, operacion.calcular(6,5));
    }

    /**
     * Test de la Operacion Multiplicacion
     */
    @Test
    public void operacionCalcularMultiplicacion() {

        Operacion operacion = new Operacion("multiplicacion");

        Assertions.assertEquals(-8d, operacion.calcular(4,-2));
    }

    /**
     * Test de la Operacion Division
     */
    @Test
    public void operacionCalcularDivision() {

        Operacion operacion = new Operacion("division");

        Assertions.assertEquals(3d, operacion.calcular(9,3));
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
