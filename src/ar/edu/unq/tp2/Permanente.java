package ar.edu.unq.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
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
		if (!this.isSoltero()) {
			result += 100;
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
		return (float) ((this.sueldoBruto() * 0.10) + (20 * this.getCantHijos()) + (this.sueldoBruto() * 0.15));
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

	@Override
	protected void liquidarSueldo() {
		
		ArrayList<Concepto> conceptos = new ArrayList<Concepto>();
		
		Concepto c1 = new Concepto("Sueldo Basico", this.getSueldoBasico());
		Concepto c2 = new Concepto("Asignacion por hijo " + this.getCantHijos(), 150 * this.getCantHijos());
		Concepto c3 = new Concepto("Antiguedad " + this.getAntiguedad(), 50 * this.getAntiguedad());
		conceptos.add(c1);
		conceptos.add(c2);
		conceptos.add(c3);
		if(!this.isSoltero()) {
			Concepto c4 = new Concepto("Asignacion por conyugue " , 100);
			conceptos.add(c4);
		}
		Concepto c5 = new Concepto("Sueldo Bruto", this.sueldoBruto());
		conceptos.add(c5);
		Concepto c6 = new Concepto("Obra Social" , (float) (this.sueldoBruto() * 0.10));
		Concepto c7 = new Concepto("Retencion por hijos " + this.getCantHijos() , 20 * this.getCantHijos());
		Concepto c8 = new Concepto("Aporte Jubilatorios" , (float) (this.sueldoBruto() * 0.15));
		
		conceptos.add(c6);
		conceptos.add(c7);
		conceptos.add(c8);
		
		
		Recibo rec = new Recibo(this.getNombre(), this.getDireccion(), LocalDate.now(), this.sueldoBruto(),
				this.sueldoNeto(), conceptos);
		
		this.addRecibo(rec);

	}

}
