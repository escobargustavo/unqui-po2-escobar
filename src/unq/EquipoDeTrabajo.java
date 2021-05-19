package unq;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String nombre;
	private ArrayList <Persona> equipo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Persona> getEquipo() {
		return equipo;
	}
	public void setEquipo(ArrayList<Persona> equipo) {
		this.equipo = equipo;
	}
	public EquipoDeTrabajo(String nombre, ArrayList<Persona> equipo) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;
	}
	
	public void addIntegrante(Persona persona) {
		this.equipo.add(persona);
	}
	public float promedioEdad() {
		int edades = 0;
		for(int i = 0; i < this.getEquipo().size(); i++) {
			edades = edades + this.getEquipo().get(i).getEdad();
		}
		float promedio = edades / this.getEquipo().size();
		System.out.println("El promedio de edad es:  " + promedio);
		return promedio;
	}
}
