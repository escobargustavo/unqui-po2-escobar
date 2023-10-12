package ar.edu.unq.enumerativosYstreams.secretariaDeportes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadSemanalTest {

	ActividadSemanal a1,a2;
	@BeforeEach
	void setUp() throws Exception {
		a1 = new ActividadSemanal(DiaDeLaSemana.LUNES,Deporte.BASKET,16,2);

		a2 = new ActividadSemanal(DiaDeLaSemana.JUEVES,Deporte.BASKET,16,2);
	}

	@Test
	void testCosto1() {
		assertEquals(a1.costo(),1400);
	}

	@Test
	void testCosto2() {
		assertEquals(a2.costo(),2400);
	}
}
