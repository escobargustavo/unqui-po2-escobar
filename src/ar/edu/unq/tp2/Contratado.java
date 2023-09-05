package ar.edu.unq.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Contratado extends Empleado{
	
	
	private int nroContrato;
	private String medioDePago;
	
	
	public Contratado(String nombre, String direccion, String estadoCivil, Date fechaNac, float sueldoBasico,
			int nroContrato, String medioPago) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.setNroContrato(nroContrato);
		this.setMedioDePago(medioPago);
	}
	
	//El sueldo bruto de este tipo de empleados es igual a su sueldo básico, pero su sueldo neto varía ya que tienen una 
	@Override
	public float sueldoBruto() {
		return this.getSueldoBasico();
	}
	
	@Override
	public float sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	//retención constante igual a $50 en concepto de “Gastos Administrativos Contractuales”
	@Override
	public float retenciones() {
		return 50;
	}
	
	@Override
	protected void liquidarSueldo() {
		ArrayList<Concepto> conceptos = new ArrayList<Concepto>();

		Concepto c1 = new Concepto("Sueldo Basico", this.getSueldoBasico());
		conceptos.add(c1);
		Concepto c2 = new Concepto("Gastos Administrativos Contractuales", 50);
	
		conceptos.add(c2);

		Recibo rec = new Recibo(this.getNombre(), this.getDireccion(), LocalDate.now(), this.sueldoBruto(),
				this.sueldoNeto(), conceptos);

		this.addRecibo(rec);
		
	}
	public int getNroContrato() {
		return nroContrato;
	}
	public void setNroContrato(int nroContrato) {
		this.nroContrato = nroContrato;
	}
	public String getMedioDePago() {
		return medioDePago;
	}
	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}
	
	

}
