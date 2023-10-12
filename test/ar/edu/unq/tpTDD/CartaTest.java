package ar.edu.unq.tpTDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {

	Carta c1;
	Carta c2;
	@BeforeEach
	void setUp() throws Exception {
		c1 = new Carta("4","P");
		c2 = new Carta("J","P");
	}

	@Test
	void testEsSuperiorAT() {
		assertTrue(c2.esSuperiorA(c1));
	}

	@Test
	void testSonDelMismoPalo() {
		assertTrue(c2.sonDelMismoPalo(c1));
	}
}
