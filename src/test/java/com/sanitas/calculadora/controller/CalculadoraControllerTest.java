package com.sanitas.calculadora.controller;

import com.sanitas.calculadora.service.CalculadoraService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CalculadoraController.class)
public class CalculadoraControllerTest {

    @MockBean
    CalculadoraService calculadoraService;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getResultadoOperacionSuma() throws Exception {

        Mockito.when(calculadoraService.calcula(2d, "+", 3d)).thenReturn(5d);

        MockHttpServletResponse response = mockMvc.perform(get("/api/calculadora")
                                            .param("numero1", "2")
                                            .param("operador", "+")
                                            .param("numero2", "3"))
                                            .andExpect(status().isOk())
                                            .andReturn().getResponse();

        Assertions.assertEquals(response.getStatus(), HttpStatus.OK.value());
        Assertions.assertEquals(response.getContentAsString(), new Double(5).toString());
    }
}
