package TestCalculadora;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import Clases.Calculadora;
import Clases.CalculadoraService;

class TestCalcu {
	
	@DisplayName("Probando CalculadoraService con datos mock")
    @Test
    public void testSumar() {
      
       Calculadora CalculadoraM= mock(Calculadora.class);
       CalculadoraService CS=new CalculadoraService(CalculadoraM);
       when(CalculadoraM.sumar(6,7 )).thenReturn(13);
       int Total=CS.sumar(6,7);
       assertEquals(13,Total);
       
    }

    @Test
    public void testRestar() {
    	Calculadora CalculadoraM= mock(Calculadora.class);
        CalculadoraService CS=new CalculadoraService(CalculadoraM);
        when(CalculadoraM.restar(6,7 )).thenReturn(-1);
        int Total=CS.restar(6,7);
        assertEquals(-1,Total);
        
    }

}
