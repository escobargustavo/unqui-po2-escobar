package tpCompositeTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpComposite.CarroDeCompras;
import tpComposite.Product;
import tpComposite.SpecialProduct;



class CarroDeComprasTest {

	private Product producto1;
	private SpecialProduct producto2;
	private CarroDeCompras carrito;
	private ArrayList<Product> productos;
	@BeforeEach
	void setUp() throws Exception {
		productos = new ArrayList<Product>();
		producto1 = new Product();
		producto1.setPrice(10);
		producto1.setName("Fideo");
		producto2 = new SpecialProduct();
		
		producto2.setPrice(9);
		producto2.setName("Fideo");
		
		productos.add(producto1);
		productos.add(producto1);
		productos.add(producto1);
		productos.add(producto2);
		carrito = new CarroDeCompras();
		carrito.setElements(productos);
		
	}

	@Test
	void testTotal() {
		float total = carrito.total();
		assertEquals(39.0,total);
	}

	@Test
	void testTotalRounded() {
		float total = carrito.total();
		assertEquals(39,total);
	}

}
