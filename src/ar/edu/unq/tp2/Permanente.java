package ar.edu.unq.tp2;

import java.util.Date;

public class Permanente extends Empleado {

	private int cantHijos;
	private int antiguedad;

//	sueldoBruto = Sueldo Básico
//	Salario Familiar, que se compone de:
//	Asignación por hijo: $150 por cada hijo.
//	Asignación por cónyuge: $100 si tiene cónyuge
// Antigüedad: $50 por cada año de antigüedad.
	@Override
	public float sueldoBruto() {
		
		float result = this.getSueldoBasico() + (150 * this.getCantHijos()) + (100 * this.getAntiguedad());
		if(!this.isSoltero()) {
			result +=100;
		}
		return result;
	}

	// metodo que calcula el sueldo neto
	@Override
	public float sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}

//	Las retenciones que se realizan a este empleado son:
//	Obra Social: 10% de su sueldo bruto + $20 por cada hijo. Aportes Jubilatorios: 15% de su sueldo bruto
	@Override
	public float retenciones() {
		return (float) ((this.sueldoBruto() * 0.10) + (20 * this.getCantHijos()) + (this.sueldoBruto() * 0.15)) ;
	}

	// Constructor y GETTER & SETTER
	public Permanente(String nombre, String direccion, String estadoCivil, Date fechaNac, float sueldoBasico, int hijos,
			int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.setAntiguedad(antiguedad);
		this.setCantHijos(hijos);
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

}
