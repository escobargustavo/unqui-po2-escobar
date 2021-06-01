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
	
	// setup
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
	public void testVerificar() {
		
		// exercise para Trio
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta1.tieneMismoValor(carta2)).thenReturn(true);
		when(carta1.tieneMismoValor(carta3)).thenReturn(false);
		when(carta1.tieneMismoValor(carta4)).thenReturn(true);
		when(carta1.tieneMismoValor(carta5)).thenReturn(false);
		
		String trio = mano.verificar(carta1, carta2, carta3, carta4, carta5);
		// verify para Trio
		assertEquals("Trio",trio);
		
		//exerxise para Color
		when(carta1.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta2.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta3.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta4.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta5.sonDelMismoPalo(carta1)).thenReturn(true);
		
		String color = mano.verificar(carta1, carta2, carta3, carta4, carta5);
		// verify para Color
		assertEquals("Color",color);
		
		// exercise para Poker
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta1.tieneMismoValor(carta2)).thenReturn(true);
		when(carta1.tieneMismoValor(carta3)).thenReturn(true);
		when(carta1.tieneMismoValor(carta4)).thenReturn(true);
		when(carta1.tieneMismoValor(carta5)).thenReturn(false);
		
		String poker = mano.verificar(carta1, carta2, carta3, carta4, carta5);
		// verify para poker
		assertEquals("Poker",poker);

	}
	
	// Se verifica la condicion de Color

	@Test
	public void testHayColor1() {

		// exercise
		// Utilizamos los mensajes de mock para hacegurarnos que la condicion del color se cumpla
		when(carta1.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta2.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta3.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta4.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta5.sonDelMismoPalo(carta1)).thenReturn(true);
		// verify
		 assertTrue(mano.hayColor(carta1, carta2, carta3, carta4, carta5));
	}

	@Test
	public void testHayColor2() {

		// exercise
		// Utilizamos los mensajes de mock para hacegurarnos que la condicion del color no se cumpla
		when(carta1.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta2.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta3.sonDelMismoPalo(carta1)).thenReturn(true);
		when(carta4.sonDelMismoPalo(carta1)).thenReturn(false);
		when(carta5.sonDelMismoPalo(carta1)).thenReturn(true);
		
		//verify
		 assertFalse(mano.hayColor(carta1, carta2, carta3, carta4, carta5));
	}
	
	
	// A continuacion de verifican las condiciones para que halla poker utilizando los mesajes de mock
	// para plantear cada escenario necesario
	@Test
	public void testHayPoker1() {
		// exercise
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta1.tieneMismoValor(carta2)).thenReturn(true);
		when(carta1.tieneMismoValor(carta3)).thenReturn(true);
		when(carta1.tieneMismoValor(carta4)).thenReturn(true);
		when(carta1.tieneMismoValor(carta5)).thenReturn(false);
		// verify
		 assertTrue(mano.hayPoker(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	public void testHayPoker2() {

		//exercise
		when(carta2.tieneMismoValor(carta1)).thenReturn(false);
		when(carta2.tieneMismoValor(carta2)).thenReturn(true);
		when(carta2.tieneMismoValor(carta3)).thenReturn(true);
		when(carta2.tieneMismoValor(carta4)).thenReturn(true);
		when(carta2.tieneMismoValor(carta5)).thenReturn(true);
		
		//verify
		 assertTrue(mano.hayPoker(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	public void testHayPoker3() {
		//exercise
		when(carta3.tieneMismoValor(carta1)).thenReturn(false);
		when(carta3.tieneMismoValor(carta2)).thenReturn(true);
		when(carta3.tieneMismoValor(carta3)).thenReturn(true);
		when(carta3.tieneMismoValor(carta4)).thenReturn(true);
		when(carta3.tieneMismoValor(carta5)).thenReturn(true);
		
		//verify
		 assertTrue(mano.hayPoker(carta1, carta2, carta3, carta4, carta5));
	}
	@Test
	public void testHayPoker4() {

		//exercise
		when(carta4.tieneMismoValor(carta1)).thenReturn(false);
		when(carta4.tieneMismoValor(carta2)).thenReturn(true);
		when(carta4.tieneMismoValor(carta3)).thenReturn(true);
		when(carta4.tieneMismoValor(carta4)).thenReturn(true);
		when(carta4.tieneMismoValor(carta5)).thenReturn(true);
		
		//verify 
		 assertTrue(mano.hayPoker(carta1, carta2, carta3, carta4, carta5));
	}

	@Test
	public void testHayPoker5() {
		//exercise
		when(carta5.tieneMismoValor(carta1)).thenReturn(false);
		when(carta5.tieneMismoValor(carta2)).thenReturn(true);
		when(carta5.tieneMismoValor(carta3)).thenReturn(true);
		when(carta5.tieneMismoValor(carta4)).thenReturn(true);
		when(carta5.tieneMismoValor(carta5)).thenReturn(true);
		//verify
		 assertTrue(mano.hayPoker(carta1, carta2, carta3, carta4, carta5));
	}

	
	// A continuacion de verifican las condiciones para que halla Trio utilizando los mesajes de mock
	// para plantear cada escenario necesario

	@Test
	public void testHayTrio1() {
		//exercise
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta1.tieneMismoValor(carta2)).thenReturn(true);
		when(carta1.tieneMismoValor(carta3)).thenReturn(true);
		when(carta1.tieneMismoValor(carta4)).thenReturn(false);
		when(carta1.tieneMismoValor(carta5)).thenReturn(false);
		//verify
		assertTrue(mano.hayTrio(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	@Test
	public void testHayTrio2() {
		//exercise
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta1.tieneMismoValor(carta2)).thenReturn(true);
		when(carta1.tieneMismoValor(carta3)).thenReturn(false);
		when(carta1.tieneMismoValor(carta4)).thenReturn(true);
		when(carta1.tieneMismoValor(carta5)).thenReturn(false);
		
		//verify
		assertTrue(mano.hayTrio(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	@Test
	public void testHayTrio3() {
		//exersice
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta1.tieneMismoValor(carta2)).thenReturn(false);
		when(carta1.tieneMismoValor(carta3)).thenReturn(true);
		when(carta1.tieneMismoValor(carta4)).thenReturn(true);
		when(carta1.tieneMismoValor(carta5)).thenReturn(false);
		
		//verify
		assertTrue(mano.hayTrio(carta1, carta2, carta3, carta4, carta5));
		
	}
	@Test
	public void testHayTrio4() {
		//exercise
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta1.tieneMismoValor(carta2)).thenReturn(false);
		when(carta1.tieneMismoValor(carta3)).thenReturn(true);
		when(carta1.tieneMismoValor(carta4)).thenReturn(false);
		when(carta1.tieneMismoValor(carta5)).thenReturn(true);
	
		//verify
		assertTrue(mano.hayTrio(carta1, carta2, carta3, carta4, carta5));
		
	}
	@Test
	public void testHayTrio5() {
		//exercise
		when(carta1.tieneMismoValor(carta1)).thenReturn(true);
		when(carta1.tieneMismoValor(carta2)).thenReturn(false);
		when(carta1.tieneMismoValor(carta3)).thenReturn(false);
		when(carta1.tieneMismoValor(carta4)).thenReturn(true);
		when(carta1.tieneMismoValor(carta5)).thenReturn(true);
		
		//verify
		assertTrue(mano.hayTrio(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	
}
