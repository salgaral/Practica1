package gestorVehiculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class CategoriaTest {

	@Test
	public void testCategoriaPrecio() {
		assertEquals(10, Categoria.A.precio, 10e-5);
		assertEquals(15, Categoria.B.precio, 10e-5);
		assertEquals(20, Categoria.C.precio, 10e-5);
	}

}
