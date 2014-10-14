package gestorVehiculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MotoTest {

private Vehiculo m1;
	
	@Before
	public void before(){
		m1 = new Moto(4, "Mi desc");
	}
	
	@Test
	public void testPrecio() {
		assertEquals(63, m1.calcularPrecio(9), 10e-5);
	}
	
	@Test
	public void testDescripcion(){
		assertEquals("Moto" + "Id: 4"+ " Descripción: Mi desc ", m1.toString());
	}

}
