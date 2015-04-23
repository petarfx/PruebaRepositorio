package ar.edu.tallerweb.figuras;

import org.junit.Assert;
import org.junit.Test;

public class CuadradoTest {
	@Test //todo metodo que este anotado como @test, debe ser public, void no recibir parametros
	public void testAreaIgualCero(){
		Cuadrado a = new Cuadrado(1);
		//obj.lado = 0;
		
		Assert.assertTrue(a.calculaArea() == 0);
		
	}
}
