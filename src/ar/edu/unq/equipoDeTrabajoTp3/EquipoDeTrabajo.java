package ar.edu.unq.equipoDeTrabajoTp3;

import java.util.ArrayList;

/*
 * 2. Defina la clase EquipoDeTrabajo y modélela en Java. Un equipo tiene un nombre y un conjunto de
integrantes (que son instancias de Persona).

4. Instancie un EquipoDeTrabajo, instancie 5 Personas y agreguelas al mismo.
5. Pida al EquipoDeTrabajo el promedio de edad de sus integrantes e imprima el resultado devuelto.

 */
public class EquipoDeTrabajo {

	private String nombreEquipo;
	private ArrayList<Persona> personas;

	public void addIntegrante(Persona p) {
		this.personas.add(p);
	}

	public double promedioEdades() {
		double resultado = 0;

		if (!this.personas.isEmpty()) {
			for (int i = 0; i < personas.size(); i++) {
				resultado += personas.get(i).getEdad();
			}
			resultado = resultado / personas.size();
		}

		return resultado;
	}

	public EquipoDeTrabajo(String nombreEquipo, ArrayList<Persona> personas) {

		this.setNombreEquipo(nombreEquipo);
		this.setPersonas(personas);
	}

	public EquipoDeTrabajo(String nombreEquipo) {

		this.setNombreEquipo(nombreEquipo);
		this.personas = new ArrayList<Persona>();
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public Integer cantIntegrantes() {
		return personas.size();
	}

}
