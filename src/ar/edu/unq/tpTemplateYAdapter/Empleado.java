package ar.edu.unq.tpTemplateYAdapter;

public abstract class Empleado {

	private String nombre;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public final double sueldo() {
		double sueldo = this.calcularSueldo(); 
		return sueldo - sueldo * 0.13;
	}

	protected abstract double calcularSueldo();

}
