package ar.edu.unq.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {

	Caja c;
	Producto p1;
	Producto p2;
	Factura f1;
	Factura f2;

	@BeforeEach
	void setUp() throws Exception {
		c = new Caja("Caja1");
		// String nombre, double precio, boolean empresaTradicional, int stock
		p1 = new Producto("Leche", 120d, false, 10);
		c.addProducto(p1);
		p2 = new Producto("fideo", 100d, true, 9);
		c.addProducto(p2);
		f1 = new Servicio("gas", 100d, 5);
		f2 = new Impuesto("Rentas", 1000);
		c.addFactura(f1);
		c.addFactura(f2);

	}

	@Test
	void testAddProducto() {
		c.addProducto(p1);
		assertEquals(c.cantProductos(), 3);
	}

	@Test
	void testCalcularMontoAPagar() {
		double total = c.calcularMontoAPagar();
		assertEquals(total, 1708);
	}

}
