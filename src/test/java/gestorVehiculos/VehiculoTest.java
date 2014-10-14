package gestorVehiculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehiculoTest {
	
	private Vehiculo v1;

	@Before
	public void before(){
		v1 = new Moto(7, "Yamaha Majesty");
	}
	
	@Test
	public void testId() {
		assertEquals(7, v1.getId());
	}
	
	@Test
	public void testDescripcion(){
		assertEquals("Yamaha Majesty", v1.getDescripcion());
	}

}
