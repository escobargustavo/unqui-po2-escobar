package modelTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Caja;
import model.Factura;
import model.Impuesto;
import model.Producto;
import model.Servicio;

class CajaTest {

	private Caja caja;
	private Producto producto;
	private Factura servicio;
	private Factura impuesto;
	private ArrayList<Producto> productos;
	private ArrayList<Factura> facturas;
	@BeforeEach
	void setUp() throws Exception {
		producto = new Producto(10, false, 100);
		servicio = new Servicio(20, 5);
		impuesto = new Impuesto(100);
		facturas = new ArrayList<Factura>();
		productos = new ArrayList<Producto>();
		caja = new Caja();
		
		productos.add(producto);
		facturas.add(impuesto);
		facturas.add(servicio);
		caja.setFacturas(facturas);
		caja.setProductos(productos);
	}

	@Test
	void test() {
		caja.facturtar();
		assertEquals(210,caja.getTotalAPagar());
	}

}
