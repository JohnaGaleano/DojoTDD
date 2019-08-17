package ude.empresariales;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
		
	@Test
	public void sumar_1_1() {
		Calculadora c = new Calculadora();
		int resultado = c.add(1, 1);
		assertEquals(2,resultado);
	}
	
	@Test
	public void sumar_2_1() {
		Calculadora c = new Calculadora();
		int resultado = c.add(2, 1);
		assertEquals(3,resultado);
	}
}
