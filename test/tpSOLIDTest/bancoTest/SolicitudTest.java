package tpSOLIDTest.bancoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpSOLID.banco.Solicitud;

class SolicitudTest {
	Solicitud solicitud;


	@BeforeEach
	void setUp() throws Exception {
		solicitud = new Solicitud(null, 48000, 12) {
			
			@Override
			public void procesarSolicitud() {
				// TODO Auto-generated method stub
				
			}
		};
	}

	@Test
	void testValorCuota() {
		float cuota = solicitud.valorCuota();
		assertEquals(4000,cuota);
	}

}
