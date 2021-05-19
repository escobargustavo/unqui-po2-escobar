package modelTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Persona;

class PersonaTest {
	
	Persona persona;
	Date fechaNac;
	Persona persona2;
	Date fecha2;
	@BeforeEach
	void setUp() throws Exception {
		fechaNac = new Date(1992, 1, 2);
		persona = new Persona("Pepe",fechaNac);
		
		fecha2 = new Date(1997,6,16);
		persona2 = new Persona ("Juan", fecha2);
	}

	@Test
	void testEdad() {
		int edad = persona.edad();
		assertEquals(29,edad);
	}

	@Test
	void testMenorQue() {
		boolean menor = persona.menorQue(persona2);
		assertFalse(menor);
	}
}
