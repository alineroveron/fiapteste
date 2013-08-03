package br.com.fiap.loja;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoedaEstrangeiraTest {

	@Test
	public void testConverteDolarValorPositivo() {
		
		MoedaEstrangeira converter = new MoedaEstrangeira();
		int valorReal = converter.converteDolar(5);
		assertEquals("Calcular valor com $5 dólares", 10, valorReal);
		
	} 
	@Test
	public void testConverteDolarValorZerado() {
		
		MoedaEstrangeira converter = new MoedaEstrangeira();
		int valorReal = converter.converteDolar(0);
		assertEquals("Calcular valor para valores zerados", 0, valorReal);
		
	}
	@Test
	public void testConverteDolarValorNegativo() {
		
		MoedaEstrangeira converter = new MoedaEstrangeira();
		int valorReal = converter.converteDolar(-1);
		assertEquals("Calcular valor para valores negativos", 0, valorReal);
		
	}

}
