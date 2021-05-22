package tpSOLIDTest.bancoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpSOLID.banco.Cliente;
import tpSOLID.banco.SolicitudCreditoPersonal;

class SolicitudCreditoPersonalTest extends SolicitudTest{

	SolicitudCreditoPersonal solicitud;
	Cliente cliente;
	
	@BeforeEach
	void setUp() throws Exception {
		cliente = new Cliente("Pepe",21,"Av siempre viva 742", 50000);
		solicitud = new SolicitudCreditoPersonal(cliente, 15000, 12);
		
	}

	@Test
	void testProcesarSolicitud() {
		solicitud.procesarSolicitud();
		boolean estado = solicitud.isEstado();
		assertTrue(estado);
	}

}
