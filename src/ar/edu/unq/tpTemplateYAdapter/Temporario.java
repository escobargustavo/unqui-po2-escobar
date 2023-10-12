package ar.edu.unq.tpTemplateYAdapter;

public class Temporario extends Empleado{

	private int cantHoras;
	private double sueldoBase;
	private int cantHijos;
	private boolean casado;
	public Temporario(String nombre, int cantHoras, int cantHijos, boolean casado) {
		super(nombre);
		this.cantHijos = cantHijos;
		this.cantHoras = cantHoras;
		this.sueldoBase = 1000;
		this.casado = casado;
		
	}

	@Override
	protected double calcularSueldo() {
		double res = this.sueldoBase + this.cantHoras * 5;
		if(this.cantHijos > 0 || this.casado) {
			return res + 100;
		}
		else {
			return res;
		}
		
	}

}
