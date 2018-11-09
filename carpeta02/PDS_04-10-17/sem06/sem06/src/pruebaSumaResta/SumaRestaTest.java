package pruebaSumaResta;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sumaresta.SumaResta;

public class SumaRestaTest {

	@Test
	public void testSumaCorrecta() {
		SumaResta sr = new SumaResta(450, 50, 1);
		String expResut = "La suma es: 500";
		String result = sr.obtenerResultado();
		assertEquals(expResut,result);
	}
	
	@Test
	public void testRestaCorrecta() {
		SumaResta sr = new SumaResta(450, 50, 2);
		String expResut = "La resta es: 400";
		String result = sr.obtenerResultado();
		assertEquals(expResut,result);
	}
	
	@Test
	public void testCampoAErrado() {
		SumaResta sr = new SumaResta(100, 50, 1);
		boolean expResut = false;
		boolean result = sr.validarA();
		assertEquals(expResut,result);
	}
}
