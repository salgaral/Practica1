package gestorVehiculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GestorVehiculosTest {
	
	private GestorVehiculos g1;
	
	@Before
	public void before(){
		g1 = new GestorVehiculos();
		g1.darDeAlta(new Moto(5, "Honda"));
	}
	
	@Test
	public void testDarDeAlta() {
		assertEquals(1, g1.getSize());
	}
	
	@Test
	public void testListar(){
		assertEquals("Moto Id: 5  Descripcion: Honda", g1.toString());
	}
	
	@Test
	public void testPrecio(){
		assertEquals(77, g1.getPrecio(5, 11));
	}

}
