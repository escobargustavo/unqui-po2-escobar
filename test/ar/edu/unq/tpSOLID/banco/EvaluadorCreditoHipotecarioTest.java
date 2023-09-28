package ar.edu.unq.tpSOLID.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EvaluadorCreditoHipotecarioTest {

	SolicitudCredito sc1;
	SolicitudCredito sc2;

	Cliente c1;
	Cliente c2;
	Propiedad p1;
	Propiedad p2;
	EvaluadorCreditoHipotecario evaluador;
	@BeforeEach
	void setUp() throws Exception {
		c1 = new Cliente("pepe","perez",21,1800);
		c2 = new Cliente("pedro","perez",64,1800);

		p1 = new Propiedad("casa","av. siempre viva 123", 1000000d);
		p2 = new Propiedad("casa","av. siempre viva 13", 1000000d);
		
		sc1 = new SolicitudCreditoHipotecario(c1, 10000, 12,p1);
		sc2 = new SolicitudCreditoHipotecario(c2, 10000, 24,p2);

		evaluador = new EvaluadorCreditoHipotecario();
	}

	@Test
	void testEsAceptable1() {
	
		assertTrue(evaluador.esAceptable(sc1));
	}
	@Test
	void testEsAceptable2() {
	
		assertFalse(evaluador.esAceptable(sc2));
	}


}
