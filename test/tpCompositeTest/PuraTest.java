package tpCompositeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpComposite.Pura;

class PuraTest {

	private Pura pura1;
	private Pura pura2;
	
	@BeforeEach
	void setUp() throws Exception {
		pura1 = new Pura();
		pura1.setTipo("Soja");
		
		pura2 = new Pura();
		pura2.setTipo("Trigo");
	}

	@Test
	void testGananciaAnual1() {

		float ganancia = pura1.gananciaAnual();
		assertEquals(ganancia, 500);
	}

	@Test
	void testGananciaAnual2() {

		float ganancia = pura2.gananciaAnual();
		assertEquals(ganancia, 300);
	}

}
