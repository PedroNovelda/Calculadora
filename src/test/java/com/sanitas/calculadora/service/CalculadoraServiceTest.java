package com.sanitas.calculadora.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculadoraServiceTest {

    private static CalculadoraService calculadoraService;

    @BeforeAll
    public static void setup() {

        calculadoraService = new CalculadoraService();
    }

    /**
     * Test del Servicio con Suma
     */
    @Test
    public void calculadoraServiceCalculaSuma() {

        Assertions.assertEquals(3d, calculadoraService.calcula(1d, 2d, "suma"));
    }

    /**
     * Test del Servicio con Resta
     */
    @Test
    public void calculadoraServiceCalculaResta() {

        Assertions.assertEquals(2d, calculadoraService.calcula(5d, 3d, "resta"));
    }

    @Test
    public void calculadoraServiceCalculaDivisionPorCero() throws Exception {

        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> calculadoraService.calcula(5d, 0d, "division"));
        Assertions.assertEquals("EXCEPCION: Division por cero", exception.getMessage());
    }
}
