package ar.edu.unq.equipoDeTrabajoTp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {

	
	EquipoDeTrabajo eq;
	Persona p1,p2,p3,p4,p5;
	
	@BeforeEach
	void setUp() throws Exception {
		p1 = new Persona("Pedro", "Perez", 20);
		p2 = new Persona("Pablo", "Aguirre", 23);
		p3 = new Persona("Agustin", "Perez", 18);
		p4 = new Persona("Santiago", "Gomez", 21);
		p5 = new Persona("Matias", "Garcia", 23);
		
		ArrayList<Persona> integrantes = new ArrayList<Persona>();
		integrantes.add(p1);
		integrantes.add(p2);
		integrantes.add(p3);
		integrantes.add(p4);
		integrantes.add(p5);
		
		eq = new EquipoDeTrabajo("EquipoMaravilla", integrantes);
	}

	@Test
	void testPromedioEdades() {
		double prom = eq.promedioEdades();
		System.out.print("El promedio de edades del equipo: " + eq.getNombreEquipo() +
				" es de: " + prom);
		assertEquals(prom, 21);
	}

	@Test
	void testAddIntegrante() {
		eq.addIntegrante(p1);
		assertEquals(eq.cantIntegrantes(), 6);
	}
}
