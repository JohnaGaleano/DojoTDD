package codebreaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class CodebreakerTest {

	Codebreaker c;
	
	@Test
	public void todosCoincidenPyN() {
		c = new Codebreaker();
		String actual = c.validator("7981", "7981");
		assertEquals("XXXX", actual);
	}
	
	@Test
	public void ningunoCoincide() {
		c = new Codebreaker();
		String actual = c.validator("7981", "5023");
		assertEquals("", actual);
	}
	
		
	@Test
	public void algunoCoincidePyN() {
		c = new Codebreaker();
		String actual = c.validator("7981", "7625");
		assertEquals("X", actual);
	}
	
	@Test
	public void algunoCoincideN() {
		c = new Codebreaker();
		String actual = c.validator("7981", "6074");
		assertEquals("_", actual);
	}
	
	@Test
	public void algunoCoincidePoN() {
		c = new Codebreaker();
		String actual = c.validator("7981", "6974");
		assertEquals("X_", actual);
	}
	
	@Test
	public void algunosCoincidePoN() {
		c = new Codebreaker();
		String actual = c.validator("7981", "8974");
		assertEquals("X__", actual);
	}
	
	@Test
	public void mitadCoincidePoN() {
		c = new Codebreaker();
		String actual = c.validator("7981", "8971");
		assertEquals("XX__", actual);
	}
	
	@Test
	public void algunoCoincidePOtrosN() {
		c = new Codebreaker();
		String actual = c.validator("7981", "8917");
		assertEquals("X___", actual);
	}
	
	@Test
	public void ningunoCoincideP() {
		c = new Codebreaker();
		String actual = c.validator("7981", "1897");
		assertEquals("____", actual);
	}
	
	@Test
	public void logitudMayor() {
		c = new Codebreaker();
		String actual = c.validator("7981", "89781");
		assertEquals("la longitud debe ser de 4 digitos", actual);
	}
	
	@Test
	public void logitudMenor() {
		c = new Codebreaker();
		String actual = c.validator("7981", "891");
		assertEquals("la longitud debe ser de 4 digitos", actual);
	}
	
	@Test
	public void caracteresInfiltrados() {
		c = new Codebreaker();
		String actual = c.validator("7981", "891%");
		assertEquals("solo se admiten caracteres numéricos", actual);
	}
	
	@Test
	public void caracteresRepetidos() {
		c = new Codebreaker();
		String actual = c.validator("7981", "7789");
		assertEquals("No se admiten caracteres repetidos", actual);
	}

}
