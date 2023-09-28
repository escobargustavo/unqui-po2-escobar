package ar.edu.unq.tpSOLID.banco;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EvaluadorCreditoPersonalTest {
	
	SolicitudCredito sc1;
	SolicitudCredito sc2;
	SolicitudCredito sc3;
	Cliente c1;
	Cliente c2;
	Cliente c3;
	EvaluadorCreditoPersonal evaluador;
	@BeforeEach
	void setUp() throws Exception {
		c1 = new Cliente("pepe","perez",21,1000);
		c2 = new Cliente("pedro","perez",26,1800);
		c3 = new Cliente("jose","perez",65,1700);
		sc1 = new SolicitudCreditoPersonal(c1, 100000, 12);
		sc2 = new SolicitudCreditoPersonal(c2, 10000, 24);
		sc3 = new SolicitudCreditoPersonal(c3, 100000, 12);
		evaluador = new EvaluadorCreditoPersonal();
	}

	@Test
	void testEsAceptable1() {
	
		assertFalse(evaluador.esAceptable(sc1));
	}
	@Test
	void testEsAceptable2() {
	
		assertTrue(evaluador.esAceptable(sc2));
	}
	@Test
	void testEsAceptable3() {
	
		assertFalse(evaluador.esAceptable(sc3));
	}


}
