package ar.edu.unq.tpTemplateYAdapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	Empleado empT;
	Empleado empPas;
	Empleado empPer;
	@BeforeEach
	void setUp() throws Exception {
		empT = new Temporario("Pepe",10,0,false);
		empPer = new Permanente("Pepe",2);
		empPas = new Pasante("Pepe",10);
	}

	@Test
	void testSueldoPermanente() {
		assertEquals(empPer.sueldo(),2871);
	}
	@Test
	void testSueldoTemporal() {
		assertEquals(empT.sueldo(),913.5);
	}
	@Test
	void testSueldoPasante() {
		assertEquals(empPas.sueldo(),348);
	}
}
