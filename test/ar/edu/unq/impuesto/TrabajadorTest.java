package ar.edu.unq.impuesto;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.impuesto.Ingreso;
import ar.edu.unq.impuesto.Trabajador;

class TrabajadorTest {

	Trabajador t;
	Ingreso i1;
	Ingreso i2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		LocalDate hoy = LocalDate.now();
		i1 = new Ingreso(hoy,"Sueldo basico", 1000d);

		i2 = new Ingreso(hoy,"Horas Extras", 100d, 3);
		
		t = new Trabajador(new ArrayList<>());
		
		t.addIngreso(i1);
		t.addIngreso(i2);
				
	}

	@Test
	void testAddIngreso() {
		t.addIngreso(i1);
		assertEquals(t.getCantIngresos(),3);
	}

	@Test
	void testGetTotalPercibido() {
		assertEquals(t.getTotalPercibido(),1100);
	}
	
	@Test
	void testGetMontoImponible() {
		assertEquals(t.getMontoImponible(),1000);
	}
	
	@Test
	void testGetImpuestoAPagar() {
		assertEquals(t.getImpuestoAPagar(),200);
	}
}
