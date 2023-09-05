package ar.edu.unq.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Temporal extends Empleado {

	private Date fechaFinDesignacion;
	private int cantHsExtras;

	/**
	 * Por otro lado, el sueldo bruto del empleado de planta temporaria se compone
	 * de: Sueldo Básico Horas Extras: $40 por cada hora extra
	 */

	@Override
	public float sueldoBruto() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico() + (40 * this.getCantHsExtras());
	}

	@Override
	public float sueldoNeto() {
		// TODO Auto-generated method stub
		return this.sueldoBruto() - this.retenciones();
	}

	/**
	 * Las retenciones que se realizan a este empleado son: Obra Social: 10% de su
	 * sueldo bruto + $25 si supera los 50 años Aportes Jubilatorios: 10% de su
	 * sueldo bruto + $5 por cada hora extra.
	 * 
	 */
	@Override
	public float retenciones() {
		float result = (float) ((this.sueldoBruto() * 0.10) + this.sueldoBruto() * 0.10 + 5 * this.getCantHsExtras());

		if (this.edad() > 50) {
			result += 25;
		}
		return result;
	}

	public Temporal(String nombre, String direccion, String estadoCivil, Date fechaNac, float sueldoBasico, Date fecha,
			int horas) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.setCantHsExtras(horas);
		this.setFechaFinDesignacion(fecha);
	}

	public Date getFechaFinDesignacion() {
		return fechaFinDesignacion;
	}

	public void setFechaFinDesignacion(Date fechaFinDesignacion) {
		this.fechaFinDesignacion = fechaFinDesignacion;
	}

	public int getCantHsExtras() {
		return cantHsExtras;
	}

	public void setCantHsExtras(int cantHsExtras) {
		this.cantHsExtras = cantHsExtras;
	}

	@Override
	protected void liquidarSueldo() {
		ArrayList<Concepto> conceptos = new ArrayList<Concepto>();

		Concepto c1 = new Concepto("Sueldo Basico", this.getSueldoBasico());
		Concepto c2 = new Concepto("Horas extra " + this.getCantHsExtras(), 40 * this.getCantHsExtras());
		conceptos.add(c1);
		conceptos.add(c2);

		if (this.edad() > 50) {
			Concepto c3 = new Concepto("Supera los 50 años", 25);
			conceptos.add(c3);
		}

		Concepto c4 = new Concepto("Obra Social", (float) (this.sueldoBruto() * 0.10));
		Concepto c5 = new Concepto("Retencion por horas extras" + this.getCantHsExtras(), 5 * this.getCantHsExtras());
		Concepto c6 = new Concepto("Aporte Jubilatorios", (float) (this.sueldoBruto() * 0.10));

		conceptos.add(c4);
		conceptos.add(c5);
		conceptos.add(c6);

		Recibo rec = new Recibo(this.getNombre(), this.getDireccion(), LocalDate.now(), this.sueldoBruto(),
				this.sueldoNeto(), conceptos);

		this.addRecibo(rec);

	}

}
