package ar.edu.unq.claseStreams;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.claseStreams.Producto;
import ar.edu.unq.claseStreams.Restorante;

class RestoranteTest {

	Restorante resto;
	Producto p1,p2,p3,p4;
	@BeforeEach
	void setUp() throws Exception {
		 p1 = new Producto("Milanesa con fritas", 1500);
		 p2 = new Producto("Guiso de lentejas", 1800);
		 p3 = new Producto("Asado con ensalada", 2000);
		 p4 = new Producto("Tortilla de papas", 1400);
		
		resto = new Restorante();
		
		resto.addProducto(p1);
		resto.addProducto(p2);
		resto.addProducto(p3);
		resto.addProducto(p4);
	}

	@Test
	void testSumaDePreciosMasBaratos() {
	assertEquals(resto.sumaDePreciosMasBaratos(),3509);
	
	}

}
