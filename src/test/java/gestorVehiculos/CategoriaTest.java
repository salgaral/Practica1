package gestorVehiculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class CategoriaTest {

	@Test
	public void testCategoriaPrecio() {
		assertEquals(10, Categoria.A.precio);
		assertEquals(15, Categoria.B.precio);
		assertEquals(20, Categoria.C.precio);
	}

}
