package ar.edu.unq.impuesto;

import java.time.LocalDate;

public class Ingreso {

	
	private LocalDate mes;
	private String concepto;
	private double monto;
	private int cantidad;
	
	public Ingreso(LocalDate mes, String concepto, double monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}

	public Ingreso(LocalDate mes, String concepto, double monto, int cantidad) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
		this.cantidad = cantidad;
		
	}

	public double getMonto() {
		return monto;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
