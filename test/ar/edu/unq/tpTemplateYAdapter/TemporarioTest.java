package ar.edu.unq.tpTemplateYAdapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemporarioTest {

	Temporario empT1;
	Temporario empT2;
	Temporario empT3;
	private Temporario empT12;
	@BeforeEach
	void setUp() throws Exception {
		empT1 = new Temporario("Pepe",10,0,false);
		empT2 = new Temporario("Pepe",10,2,false);
		empT3 = new Temporario("Pepe",10,1,true);
	}

	@Test
	void testCalcularSueldoEmpT1() {
		assertEquals(empT1.calcularSueldo(),1050);
	}
	@Test
	void testCalcularSueldoEmpT2() {
		assertEquals(empT2.calcularSueldo(),1150);
	}
	@Test
	void testCalcularSueldoEmpT3() {
		assertEquals(empT3.calcularSueldo(),1150);
	}
}
