package tpCompositeTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpComposite.Hoja;
import tpComposite.IShapeShifter;
import tpComposite.Nodo;

class ShapeShifterTest {

	private Hoja a;
	private Hoja b;
	private IShapeShifter c;

	@BeforeEach
	void setUp() throws Exception {
		a = new Hoja();
		a.setValor(1);
		b = new Hoja();
		b.setValor(2);
		c = a.compose(b);
	}

	@Test
	void testCompose() {
		c = a.compose(b);
		assertEquals(2,c.values().size());
	}

	@Test
	void testDeepest1() {
		
		assertEquals(0,a.deepest());
	}
	@Test
	void testDeepest2() {
		assertEquals(1,c.deepest());
	}
	
	@Test
	void testValuesA() {
		System.out.println(a.values());
	}
	@Test
	void testValuesC() {
		System.out.println(c.values());
	}
}
