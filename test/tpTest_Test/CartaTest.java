package tpTest_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpTest.Carta;

class CartaTest {
	private Carta carta1;
	private Carta carta2;
	
	
	//SetUp
	@BeforeEach
	void setUp() throws Exception {
		carta1 = new Carta();
		carta1.setPalo("C");
		carta1.setValorL("A");
		carta2 = new Carta();
		carta2.setPalo("T");
		carta2.setValorN(2);
	}

	// verificamos para el caso en el que son de distinto palo
	@Test
	void testSonDemMispoPalo1() {
		//	exercise
		boolean respuesta = carta1.sonDelMismoPalo(carta2);
		//verify
		assertFalse(respuesta);
	}

	// verificamos para el caso en que son del mismo palo
	@Test
	void testSonDemMispoPalo2() {
		//exercise
		boolean respuesta = carta1.sonDelMismoPalo(carta1);
		//verify
		assertTrue(respuesta);
	}
	
	// verificamos para el caso en que una carta es mayor a otra
	@Test
	void testMayorQue1() {
		//exercise
		boolean respuesta = carta1.mayorQue(carta2);
		//verify
		assertFalse(respuesta);
	}
	
	// verificamos para el caso en que una carta es menor a la pasada por parametro
	@Test
	void testMayorQue2() {
		//exercise
		boolean respuesta = carta2.mayorQue(carta1);
		//verify
		assertTrue(respuesta);
	}
	
	// verificamos para el caso en que las cartas tienen el mismo valor
	@Test
	void testMayorQue3() {
		//Exercise
		boolean respuesta = carta2.mayorQue(carta2);
		//verify
		assertFalse(respuesta);
	}
	
	//Verificamos si dor cartas son del mismo valor 
	@Test
	void testTieneMismoValor() {
		//exercise
		boolean respuesta = carta1.tieneMismoValor(carta1);
		//verify
		assertTrue(respuesta);
	}
	
	
}
