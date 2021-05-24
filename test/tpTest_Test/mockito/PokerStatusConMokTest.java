 package tpTest_Test.mockito;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpTest.Carta;
import tpTest.PokerStatusMejorada;

class PokerStatusConMokTest {

	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	PokerStatusMejorada mano;
	
	@BeforeEach
	void setUp() throws Exception {
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
		
		mano = new PokerStatusMejorada();
	}

	@Test
	public void testVerificarColor() {

		when(carta1.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta2.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta3.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta4.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta5.sonDelMismoPalo(carta1)).thenReturn(true);

		String color = mano.verificar(carta1, carta2, carta3, carta4, carta5);
		assertEquals("Color",color);
	}

	@Test
	public void testVerificarPoker() {
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta1.tieneMismoValor(carta2)).thenReturn(true);
		when(carta1.tieneMismoValor(carta3)).thenReturn(true);
		when(carta1.tieneMismoValor(carta4)).thenReturn(true);
		when(carta1.tieneMismoValor(carta5)).thenReturn(false);
		
		String poker = mano.verificar(carta1, carta2, carta3, carta4, carta5);
		assertEquals("Poker",poker);
	}
	
	@Test
	public void testHayColor1() {

		
		when(carta1.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta2.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta3.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta4.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta5.sonDelMismoPalo(carta1)).thenReturn(true);
		
		 assertTrue(mano.hayColor(carta1, carta2, carta3, carta4, carta5));
	}

	@Test
	public void testHayColor2() {

		
		when(carta1.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta2.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta3.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta4.sonDelMismoPalo(carta1)).thenReturn(false);
		when(carta5.sonDelMismoPalo(carta1)).thenReturn(true);
		
		
		 assertFalse(mano.hayColor(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	public void testHayPoker1() {
		
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta1.tieneMismoValor(carta2)).thenReturn(true);
		when(carta1.tieneMismoValor(carta3)).thenReturn(true);
		when(carta1.tieneMismoValor(carta4)).thenReturn(true);
		when(carta1.tieneMismoValor(carta5)).thenReturn(false);

		 assertTrue(mano.hayPoker(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	public void testHayPoker2() {

		
		when(carta2.tieneMismoValor(carta1)).thenReturn(false);
		when(carta2.tieneMismoValor(carta2)).thenReturn(true);
		when(carta2.tieneMismoValor(carta3)).thenReturn(true);
		when(carta2.tieneMismoValor(carta4)).thenReturn(true);
		when(carta2.tieneMismoValor(carta5)).thenReturn(true);

		 assertTrue(mano.hayPoker(carta1, carta2, carta3, carta4, carta5));
	}
	@Test
	public void testHayPoker3() {

		
		when(carta3.tieneMismoValor(carta1)).thenReturn(false);
		when(carta3.tieneMismoValor(carta2)).thenReturn(true);
		when(carta3.tieneMismoValor(carta3)).thenReturn(true);
		when(carta3.tieneMismoValor(carta4)).thenReturn(true);
		when(carta3.tieneMismoValor(carta5)).thenReturn(true);

		 assertTrue(mano.hayPoker(carta1, carta2, carta3, carta4, carta5));
	}
	@Test
	public void testHayPoker4() {

		
		when(carta4.tieneMismoValor(carta1)).thenReturn(false);
		when(carta4.tieneMismoValor(carta2)).thenReturn(true);
		when(carta4.tieneMismoValor(carta3)).thenReturn(true);
		when(carta4.tieneMismoValor(carta4)).thenReturn(true);
		when(carta4.tieneMismoValor(carta5)).thenReturn(true);

		 assertTrue(mano.hayPoker(carta1, carta2, carta3, carta4, carta5));
	}

	@Test
	public void testHayPoker5() {

		
		when(carta5.tieneMismoValor(carta1)).thenReturn(false);
		when(carta5.tieneMismoValor(carta2)).thenReturn(true);
		when(carta5.tieneMismoValor(carta3)).thenReturn(true);
		when(carta5.tieneMismoValor(carta4)).thenReturn(true);
		when(carta5.tieneMismoValor(carta5)).thenReturn(true);

		 assertTrue(mano.hayPoker(carta1, carta2, carta3, carta4, carta5));
	}


	@Test
	public void testHayTrio1() {
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta2.tieneMismoValor(carta1)).thenReturn(true);
		when(carta3.tieneMismoValor(carta1)).thenReturn(true);
		when(carta4.tieneMismoValor(carta1)).thenReturn(false);
		when(carta5.tieneMismoValor(carta1)).thenReturn(false);
		
		assertTrue(mano.hayTrio(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	@Test
	public void testHayTrio2() {
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta2.tieneMismoValor(carta1)).thenReturn(true);
		when(carta3.tieneMismoValor(carta1)).thenReturn(false);
		when(carta4.tieneMismoValor(carta1)).thenReturn(true);
		when(carta5.tieneMismoValor(carta1)).thenReturn(false);
		
		assertTrue(mano.hayTrio(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	@Test
	public void testHayTrio3() {
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta2.tieneMismoValor(carta1)).thenReturn(false);
		when(carta3.tieneMismoValor(carta1)).thenReturn(true);
		when(carta4.tieneMismoValor(carta1)).thenReturn(true);
		when(carta5.tieneMismoValor(carta1)).thenReturn(false);
		
		assertTrue(mano.hayTrio(carta1, carta2, carta3, carta4, carta5));
		
	}
	@Test
	public void testHayTrio4() {
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta2.tieneMismoValor(carta1)).thenReturn(false);
		when(carta3.tieneMismoValor(carta1)).thenReturn(true);
		when(carta4.tieneMismoValor(carta1)).thenReturn(false);
		when(carta5.tieneMismoValor(carta1)).thenReturn(true);
		
		assertTrue(mano.hayTrio(carta1, carta2, carta3, carta4, carta5));
		
	}
	@Test
	public void testHayTrio5() {
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta2.tieneMismoValor(carta1)).thenReturn(false);
		when(carta3.tieneMismoValor(carta1)).thenReturn(false);
		when(carta4.tieneMismoValor(carta1)).thenReturn(true);
		when(carta5.tieneMismoValor(carta1)).thenReturn(true);
		
		assertTrue(mano.hayTrio(carta1, carta2, carta3, carta4, carta5));
		
	}
}
