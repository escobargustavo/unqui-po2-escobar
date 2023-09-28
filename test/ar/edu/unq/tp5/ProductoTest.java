package ar.edu.unq.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	Producto p;
	@BeforeEach
	void setUp() throws Exception {
		p = new Producto("fideo", 100d,false,10);
	}

	@Test
	void testDecrementarStock() {
		p.decrementarStock();

		assertEquals(p.getStock(),9);
	}

}
