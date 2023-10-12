package ar.edu.unq.tpTDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PokerStatusConCartaTest {

	PokerStatusConCarta pscc;

	Carta cartaMock,cartaMock1,cartaMock2;

	@BeforeEach
	void setUp() throws Exception {
		cartaMock = mock(Carta.class);
		cartaMock1 = mock(Carta.class);
		cartaMock2 = mock(Carta.class);
		pscc = new PokerStatusConCarta();
	}

	@Test
	void testEsPoquer() {

		when(cartaMock.getValor())
			.thenReturn("2")
			.thenReturn("2")
			.thenReturn("2")
			.thenReturn("2")
			.thenReturn("5");
		Carta[] cartas = { cartaMock, cartaMock, cartaMock, cartaMock, cartaMock };
		assertTrue(pscc.esPoquer(cartas));
	}

	@Test
	void testEsTrio() {
		when(cartaMock.getValor())
			.thenReturn("2")
			.thenReturn("2")
			.thenReturn("2")
			.thenReturn("7")
			.thenReturn("5");
		Carta[] cartas = { cartaMock, cartaMock, cartaMock, cartaMock, cartaMock };
		assertTrue(pscc.esTrio(cartas));
	}

	@Test
	void testEsColor() {
		when(cartaMock.getPalo()).thenReturn("T");
		Carta[] cartas = { cartaMock, cartaMock, cartaMock, cartaMock, cartaMock };
		assertTrue(pscc.esColor(cartas));
	}

	@Test
	void testVerificarPoquer() {
		when(cartaMock.getValor())
			.thenReturn("2")
			.thenReturn("2")
			.thenReturn("2")
			.thenReturn("2")
			.thenReturn("5");
		// exercise
		String verificar = pscc.verificar(cartaMock, cartaMock, cartaMock, cartaMock, cartaMock);
		// verify
		assertEquals(verificar, "Poquer");
	}

	@Test
	void testVerificarColor() {
		// exercise
		//anidamiento de msjs al mock
		when(cartaMock.getValor())
			.thenReturn("2")
			.thenReturn("2")
			.thenReturn("4")
			.thenReturn("6")
			.thenReturn("A");

		when(cartaMock.getPalo()).thenReturn("T");
		
		String verificar = pscc.verificar(cartaMock, cartaMock, cartaMock, cartaMock, cartaMock);
		// verify
		assertEquals(verificar, "Color");
	}

	@Test
	void testVerificarTrio() {
		// exercise
		when(cartaMock.getValor()).thenReturn("4");
		when(cartaMock.getValor()).thenReturn("4");
		when(cartaMock.getValor()).thenReturn("4");
		when(cartaMock1.getValor()).thenReturn("Q");
		when(cartaMock2.getValor()).thenReturn("J");
		when(cartaMock.getPalo())
			.thenReturn("T")
			.thenReturn("C")
			.thenReturn("P");
		when(cartaMock1.getPalo())
			.thenReturn("C");
		when(cartaMock2.getPalo())
			.thenReturn("D");
		String verificar = pscc.verificar(cartaMock, cartaMock, cartaMock, cartaMock1, cartaMock2);
		// verify
		assertEquals(verificar, "Trio");
	}

	@Test
	void testVerificarNada() {
		// exercise
		when(cartaMock.getValor())
			.thenReturn("2")
			.thenReturn("2")
			.thenReturn("4")
			.thenReturn("6")
			.thenReturn("A");
		when(cartaMock.getPalo())
			.thenReturn("T")
			.thenReturn("C")
			.thenReturn("D")
			.thenReturn("T")
			.thenReturn("D");
		String verificar = pscc.verificar(cartaMock, cartaMock, cartaMock, cartaMock, cartaMock);
		// verify
		assertEquals(verificar, "Nada");
	}
}
