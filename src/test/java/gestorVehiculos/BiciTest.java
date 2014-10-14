package gestorVehiculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BiciTest {

private Vehiculo b1;
	
	@Before
	public void before(){
		b1 = new Bici(9,"Mi desc");
	}
	
	@Test
	public void testPrecio() {
		assertEquals(70, b1.calcularPrecio(9), 10e-5);
	}
	
	@Test
	public void testDescripcion(){
		assertEquals("Bici" + "Id:1 Descripción: Mi desc ", b1.toString());
	}

}
