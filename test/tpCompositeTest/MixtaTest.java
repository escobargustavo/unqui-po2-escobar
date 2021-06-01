package tpCompositeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpComposite.Mixta;
import tpComposite.Pura;

class MixtaTest {

	private Mixta mixta1;
	private Mixta mixta2;
	private Pura pura;
	private Pura pura1;
	
	@BeforeEach
	void setUp() throws Exception {
		mixta1 = new Mixta();
		mixta2 = new Mixta();
		pura = new Pura();
		pura.setTipo("Soja");
		
		pura1 = new Pura();
		pura1.setTipo("Trigo");
		
		mixta1.addPorcion(pura);
		mixta1.addPorcion(pura);
		mixta1.addPorcion(pura1);
		mixta1.addPorcion(pura1);
		
		mixta2.addPorcion(mixta1);
		mixta2.addPorcion(pura1);
		mixta2.addPorcion(pura);
		mixta2.addPorcion(pura);
		
	}

	@Test
	void testAddPorcion() {
		mixta1.addPorcion(mixta1);
		int size = mixta1.getPorciones().size();
		assertEquals(5,size);
	}
	@Test
	void testGastoAnual0() {
		float ganancia = mixta1.gananciaAnual();
		assertEquals(400,ganancia);
	}
	
	void testGastoAnual1() {
		float ganancia = mixta2.gananciaAnual();
		assertEquals(1700,ganancia);
	}
	void testRemuve() {
		mixta2.remuve(mixta1);
		int resultado = mixta2.getPorciones().size();
		assertEquals(3,resultado);
	}
}
