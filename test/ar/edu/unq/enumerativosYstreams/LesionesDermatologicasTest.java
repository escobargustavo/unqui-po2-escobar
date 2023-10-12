package ar.edu.unq.enumerativosYstreams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LesionesDermatologicasTest {

	LesionesDermatologicas ldRojo;
	LesionesDermatologicas ldMiel;
	@BeforeEach
	void setUp() throws Exception {
		ldRojo = LesionesDermatologicas.ROJO;
		ldMiel = LesionesDermatologicas.MIEL;
	}

	@Test
	void testNext1() {
		assertEquals(ldRojo.next().getDescripcion(), "SANANDO");
		
	}
	@Test
	void testNext2() {
		assertEquals(ldMiel.next().getDescripcion(), "GRAVE");
		
	}
}
