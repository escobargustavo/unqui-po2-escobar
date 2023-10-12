package ar.edu.unq.tpTemplateYAdapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PermanteTest {

	Permanente empPer1;
	Permanente empPer2;

	@BeforeEach
	void setUp() throws Exception {
		empPer1 = new Permanente("Pepe",2);
		empPer2 = new Permanente("Pepe",0);
	}

	@Test
	void testCalcularSueldoEmpPer1() {
		assertEquals(empPer1.calcularSueldo(),3300);
	}
	@Test
	void testCalcularSueldoEmpPer2() {
		assertEquals(empPer2.calcularSueldo(),3000);
	}
}
