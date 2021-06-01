package tpTest_Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpTest.PokerStatus;

class PokerStatusTest {
	
	private PokerStatus mano;
	
	private String carta1;
	private String carta2;
	private String carta3;
	private String carta4;
	private String carta5;
	private String carta6;
	
	// setup
	@BeforeEach
	void setUp() throws Exception {
		mano = new PokerStatus();
		
		carta1 = "10D";
		carta2 = "10P";
		carta3 = "10T";
		carta4 = "10C";
		carta5 = "AT";
		carta6 = "2D";
	}
	
	@Test
	void testVerificar() {
		// exercise
		String poker = mano.verificar(carta1,carta2,carta3,carta4,carta5);
		String color = mano.verificar(carta1,carta1,carta1,carta1,carta1);
		String trio = mano.verificar(carta1,carta2,carta3,carta5,carta5);
		String nada = mano.verificar(carta1,carta1,carta5,carta5,carta6);
		
		// verify
		assertEquals("Poquer", poker);
		assertEquals("Color", color);
		assertEquals("Trio", trio);
		assertEquals("Nada", nada);
	}

	
	// Se verifica la condicion para que halla color
	@Test
	void testHayColor() {
		
		// exercise
		boolean color = mano.hayColor(carta1,carta1,carta1,carta1,carta1);
		// verify
		assertTrue(color);
	}
	

	// Se ferifica las condiciones para que halla poker
	@Test
	void testEsPoker() {
		// exercise
		boolean poker1 = mano.esPoker(carta1,carta2,carta3,carta4,carta5);
		boolean poker2 = mano.esPoker(carta5,carta2,carta3,carta4,carta1);
		boolean poker3 = mano.esPoker(carta1,carta5,carta3,carta4,carta2);
		boolean poker4 = mano.esPoker(carta1,carta2,carta5,carta3,carta4);
		boolean poker5 = mano.esPoker(carta1,carta2,carta3,carta5,carta4);
		
		//verify
		assertTrue(poker1);
		assertTrue(poker2);
		assertTrue(poker3);
		assertTrue(poker4);
		assertTrue(poker5);
	}

	// Se verifica las condiciones para que halla trio
	@Test
	void testHayTrio() {
		boolean trio1 = mano.hayTrio(carta1,carta2,carta3,carta5,carta5);
		boolean trio2 = mano.hayTrio(carta1,carta2,carta5,carta4,carta5);
		boolean trio3 = mano.hayTrio(carta1,carta5,carta3,carta4,carta5);
		boolean trio4 = mano.hayTrio(carta5,carta2,carta3,carta4,carta5);
		boolean trio5 = mano.hayTrio(carta1,carta2,carta5,carta5,carta4);
		boolean trio6 = mano.hayTrio(carta1,carta5,carta5,carta3,carta4);
		boolean trio7 = mano.hayTrio(carta5,carta2,carta5,carta3,carta2);
		boolean trio8 = mano.hayTrio(carta5,carta1,carta5,carta2,carta3);
		boolean trio9 = mano.hayTrio(carta5,carta5,carta1,carta2,carta3);
		boolean trio10 = mano.hayTrio(carta1,carta5,carta2,carta5,carta3);
		
		assertTrue(trio1);
		assertTrue(trio2);
		assertTrue(trio3);
		assertTrue(trio4);
		assertTrue(trio5);
		assertTrue(trio6);
		assertTrue(trio7);
		assertTrue(trio8);
		assertTrue(trio9);
		assertTrue(trio10);
	}
}
