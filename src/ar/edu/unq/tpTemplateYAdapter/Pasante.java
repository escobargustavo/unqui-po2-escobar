package ar.edu.unq.tpTemplateYAdapter;

public class Pasante extends Empleado{
	private int cantHoras;

	public Pasante(String nombre, int cantHoras) {
		super(nombre);
		this.cantHoras = cantHoras;
	}

	@Override
	protected double calcularSueldo() {
		return this.cantHoras*40;
	}

}
