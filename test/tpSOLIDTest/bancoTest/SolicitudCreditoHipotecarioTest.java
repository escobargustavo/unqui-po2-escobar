package tpSOLIDTest.bancoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpSOLID.banco.Cliente;
import tpSOLID.banco.Propiedad;
import tpSOLID.banco.SolicitudCreditoHipotecario;

class SolicitudCreditoHipotecarioTest extends SolicitudTest {

	SolicitudCreditoHipotecario solicitud;
	Cliente cliente;
	Propiedad propiedad;
	
	@BeforeEach
	void setUp() throws Exception {
		propiedad = new Propiedad("","", 1500000);
		cliente = new Cliente("Jose", 20, "calle falsa 123", 30000);
		cliente.setGarantia(propiedad);
		solicitud = new SolicitudCreditoHipotecario(cliente, 50000, 24);
	}

	@Test
	void testProcesarSolicitud() {
		solicitud.procesarSolicitud();
		boolean estado = solicitud.isEstado();
		assertTrue(estado);
	}

}
