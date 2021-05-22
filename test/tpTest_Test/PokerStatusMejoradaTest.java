package tpTest_Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpTest.Carta;
import tpTest.PokerStatusMejorada;

class PokerStatusMejoradaTest {

	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private Carta carta6;
	
	private PokerStatusMejorada mano;
	
	@BeforeEach
	void setUp() throws Exception {
		mano = new PokerStatusMejorada();
		carta1 = new Carta();
		carta1.setPalo("D");
		carta1.setValorN(3);
		
		carta2 = new Carta();
		carta2.setPalo("P");
		carta2.setValorN(3);
		
		carta3 = new Carta();
		carta3.setPalo("T");
		carta3.setValorN(3);
		
		carta4 = new Carta();
		carta4.setPalo("C");
		carta4.setValorN(3);
		
		carta5 = new Carta();
		carta5.setPalo("D");
		carta5.setValorN(9);
		
		carta6 = new Carta();
		carta6.setPalo("T");
		carta6.setValorN(8);
	}

	@Test
	public void testVerificar() {
		String poker = mano.verificar(carta1,carta2,carta3,carta4,carta5);
		String color = mano.verificar(carta1,carta1,carta1,carta1,carta1);
		String nada = mano.verificar(carta3,carta1,carta5,carta6,carta4);
		assertEquals("Poker",poker);
		assertEquals("Color",color);
		assertEquals("Nada",nada);
	}
	
	@Test
	public void testHayColor() {
		boolean color = mano.hayColor(carta1,carta1,carta1,carta1,carta1);
		assertTrue(color);
	}
	
	@Test
	public void testHayTrio() {
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
	
	@Test
	void testHayPoker() {
		boolean poker1 = mano.hayPoker(carta1,carta2,carta3,carta4,carta5);
		boolean poker2 = mano.hayPoker(carta5,carta2,carta3,carta4,carta1);
		boolean poker3 = mano.hayPoker(carta1,carta5,carta3,carta4,carta2);
		boolean poker4 = mano.hayPoker(carta1,carta2,carta5,carta3,carta4);
		boolean poker5 = mano.hayPoker(carta1,carta2,carta3,carta5,carta4);
		
		assertTrue(poker1);
		assertTrue(poker2);
		assertTrue(poker3);
		assertTrue(poker4);
		assertTrue(poker5);
	}

}
