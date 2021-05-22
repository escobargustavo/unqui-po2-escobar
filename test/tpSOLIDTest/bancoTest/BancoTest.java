package tpSOLIDTest.bancoTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpSOLID.banco.Banco;
import tpSOLID.banco.Cliente;
import tpSOLID.banco.Propiedad;
import tpSOLID.banco.Solicitud;
import tpSOLID.banco.SolicitudCreditoHipotecario;
import tpSOLID.banco.SolicitudCreditoPersonal;

class BancoTest {
	
	private Cliente cliente1;
	private Cliente cliente2;
	private Solicitud solicitudCP;
	private Solicitud solicitudCH;
	private Propiedad propiedad;
	private Banco banco;
	private ArrayList<Cliente> clientes;
	private ArrayList<Solicitud> solicitudes;
	
	@BeforeEach
	void setUp() throws Exception {
		clientes = new ArrayList<Cliente>();
		solicitudes = new ArrayList<Solicitud>();
		
		cliente1 = new Cliente("Jose", 21, "", 5000);
		cliente2 = new Cliente("Pepe", 55, "", 9000);
		propiedad = new Propiedad("", "", 1000000);
		cliente2.setGarantia(propiedad);
		
		solicitudCP = new SolicitudCreditoPersonal(cliente1, 20000, 12);
		solicitudCH = new SolicitudCreditoHipotecario(cliente2, 50000, 24);
		
		banco = new Banco(clientes, solicitudes);
		banco.addCliente(cliente1);
		banco.addCliente(cliente2);
		banco.addSolicitud(solicitudCP);
		banco.addSolicitud(solicitudCH);
		
		
	}

	@Test
	void testProcesarSolicitud() {
		banco.procesarSolicitud();
		boolean estadoCP = banco.getSolicitudes().get(0).isEstado();
		boolean estadoCH = banco.getSolicitudes().get(1).isEstado();
		
		assertTrue(estadoCP);
		assertFalse(estadoCH);
		
	}

}
