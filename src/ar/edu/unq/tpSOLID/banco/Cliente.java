package ar.edu.unq.tpSOLID.banco;

public class Cliente {

	private String nombre;
	private String apellido;
	private int edad;
	private double sueldoNetoM;
	
	public double sueldoNetoA() {
		return this.sueldoNetoM * 12;
	}
	
	public int getEdad() {
		return edad;
	}
	public double getSueldoNetoM() {
		return this.sueldoNetoM;
	}

	public Cliente(String nombre, String apellido, int edad, double sueldoNetoM) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sueldoNetoM = sueldoNetoM;
	}
	
	
}
