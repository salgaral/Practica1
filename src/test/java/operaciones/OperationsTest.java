package operaciones;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperationsTest {
	
	private Operations o1;
	private Operation o;

	@Before
	public void before(){
		o1 =  new Operations();
		o = new Multiplication(5,8);
		o1.add(o);
	}

	@Test
	public void testOperations() {
		assertEquals(40, o1.total());
	}
	
	@Test
	public void testReset(){
		Operation[] o2 = new Operation[10];
		o1.reset();
		assertArrayEquals(o2, o1.getOperators());
	}
	
	@Test
	public void testAdd(){
		Operation[] o3 = new Operation[10];
		o3[0] = o;
		assertArrayEquals(o3, o1.getOperators());
	}

}
