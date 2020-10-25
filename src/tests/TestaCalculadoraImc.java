package tests;

import control.CalculadoraImc;
import junit.framework.TestCase;

public class TestaCalculadoraImc extends TestCase{
	
	public void testeIMC(){
		String retornoEsperado = "Obesidade grau II";
		String retornoFeito = new CalculadoraImc().calcularImc(100., 1.60, 37, "M");
		assertEquals(retornoEsperado, retornoFeito);
	}
}
