package model;

import java.time.LocalDate;
import java.util.Date;

public class Persona {

	String nombre;
	Date fechaNac;
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Date getFechaNac() {
		return fechaNac;
	}


	public Persona(String nombre, Date fechaNac) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}


	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}


	public int edad() {
		LocalDate hoy = LocalDate.now();
		int edad = hoy.getYear() - this.getFechaNac().getYear();
		return edad;
	}


	public boolean menorQue(Persona persona) {
		
		return this.edad() < persona.edad();
	}

}
