package tpSOLIDTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpSOLID.ClienteEMail;

import tpSOLID.ServidorPop;

class CorreoEMailTest {
	
	private ClienteEMail cliente;
	private ServidorPop server;
	private ArrayList<ClienteEMail> clientes;
	@BeforeEach
	void setUp() throws Exception {
		server = new ServidorPop();
		clientes = new  ArrayList<ClienteEMail>();
		server.setClientes(clientes);
		cliente = new ClienteEMail(server, "Pepe", "1234");
		server.addCliente(cliente);
		
	
	}

	@Test
	void testConectar() {
		cliente.conectar();
		boolean conecto = server.getEstado();
		assertTrue(conecto);
	}
	
	@Test
	void testContarBorrados() {
		int nro = cliente.contarBorrados();
		assertEquals(0,nro);
	}
}
