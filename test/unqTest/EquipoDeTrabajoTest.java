package unqTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.EquipoDeTrabajo;
import unq.Persona;

class EquipoDeTrabajoTest {
	private Persona persona1;
	private Persona persona2;
	private Persona persona3;
	private Persona persona4;
	private Persona persona5;
	private EquipoDeTrabajo equipo;
	private ArrayList<Persona> integrantes;
	
	@BeforeEach
	void setUp() throws Exception {
		persona1 = new Persona("Pepe", "Juarez", 21);
		persona2 = new Persona("Juan", "Benitez", 20);
		persona3 = new Persona("Matias", "", 21);
		persona4 = new Persona("", "", 24);
		persona5 = new Persona("", "", 23);
		integrantes = new ArrayList<Persona>();
		equipo = new EquipoDeTrabajo("PuedeFallar", integrantes);
		equipo.addIntegrante(persona1);
		equipo.addIntegrante(persona2);
		equipo.addIntegrante(persona3);
		equipo.addIntegrante(persona4);
		equipo.addIntegrante(persona5);
		
	}

	@Test
	void testPromedioEdad() {
		float promedio = equipo.promedioEdad();
		assertEquals(21,promedio);
	}

}
