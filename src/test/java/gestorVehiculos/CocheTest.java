package gestorVehiculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CocheTest {

private Vehiculo c1;
	
	@Before
	public void before(){
		c1 = new Coche(1,"Mi desc", Categoria.A);
	}
	
	@Test
	public void testPrecio() {
		assertEquals(87, c1.calcularPrecio(12), 10e-5);
	}
	
	@Test
	public void testDescripcion(){
		assertEquals("Coche" + " Id:1 Descripción: Mi desc ", c1.toString());
	}

}
