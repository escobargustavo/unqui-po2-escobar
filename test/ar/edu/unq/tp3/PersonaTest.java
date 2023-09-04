package ar.edu.unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {

	Persona p1;
	Persona p2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		LocalDate fecha1 = LocalDate.of(1992, 1, 2);
		LocalDate fecha2 = LocalDate.of(2009, 1, 2);
		
		p1 = new Persona("Gustavo",fecha1);
		p2 = new Persona("Lourdes", fecha2);
	}

	
	@Test
	void testEdad() {
		int edad = p1.edad();
		assertEquals(edad, 31);
	}
	
	@Test
	void testMenorQue() {
		assertTrue(p2.menorQue(p1));
	}

}
