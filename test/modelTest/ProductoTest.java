package modelTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Producto;

class ProductoTest {
	
	Producto producto;
	
	@BeforeEach
	void setUp() throws Exception {
		producto = new Producto(100, true, 100);
	}

	@Test
	void testCalcularPrecio() {
		float precio = producto.calcularPrecio();
		assertEquals(90,precio);
	}

}
