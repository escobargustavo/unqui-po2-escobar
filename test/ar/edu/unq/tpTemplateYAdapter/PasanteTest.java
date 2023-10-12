package ar.edu.unq.tpTemplateYAdapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PasanteTest {
	
	

	Pasante empP;
	@BeforeEach
	void setUp() throws Exception {
		empP = new Pasante("Pepe",10);
	}

	@Test
	void testCalcularSueldo() {
		assertEquals(empP.calcularSueldo(),400);
	}

}
