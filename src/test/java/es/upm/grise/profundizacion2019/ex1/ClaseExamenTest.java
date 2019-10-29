package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;
import org.junit.Test;

//Examen de Antonio González Sanz (090183)
public class ClaseExamenTest {
	ClaseExamen claseExamen = new ClaseExamen();

	@Test
	//Prueba el while (a>b)
	//Para a=3, b=2 --> Resultado esperado 0
	public void test_while() {
		assertEquals(0,claseExamen.metodoAProbar(3,2),0.0);
	}

	@Test
	//Prueba el if, en concreto la rama (a<=b)
	//Para a=2, b=3 --> Resultado esperado 0
	public void test_if_rama1() {
		assertEquals(0,claseExamen.metodoAProbar(2,3),0.0);
	}
}
