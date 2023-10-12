package ar.edu.unq.tpTemplateYAdapter;

public class Permanente extends Empleado {

	private int cantHijos;
	private double sueldoBase;
	public Permanente(String nombre,int cantHijos) {
		super(nombre);
		this.cantHijos = cantHijos;
		this.sueldoBase = 3000;
		
	}

	@Override
	protected double calcularSueldo() {
		return this.sueldoBase + this.cantHijos * 150;
	}

}
