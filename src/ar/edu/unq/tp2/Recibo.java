package ar.edu.unq.tp2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Recibo {
	private String nombreEmp;
	private String direcc;
	private LocalDate fechEmision;
	private float sueldoBruto;
	private float sueldoNeto;
	private ArrayList<Concepto> concepto;
	
	
	public String getNombreEmp() {
		return nombreEmp;
	}
	public void setNombreEmp(String nombreEmp) {
		this.nombreEmp = nombreEmp;
	}
	public String getDirecc() {
		return direcc;
	}
	public void setDirecc(String direcc) {
		this.direcc = direcc;
	}
	public LocalDate getFechEmision() {
		return fechEmision;
	}
	public void setFechEmision(LocalDate fechEmision) {
		this.fechEmision = fechEmision;
	}
	public float getSueldoBruto() {
		return sueldoBruto;
	}
	public void setSueldoBruto(float sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	public float getSueldoNeto() {
		return sueldoNeto;
	}
	public void setSueldoNeto(float sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}
	public ArrayList<Concepto> getConcepto() {
		return concepto;
	}
	public void setConcepto(ArrayList<Concepto> concepto) {
		this.concepto = concepto;
	}
	public Recibo(String nombreEmp, String direcc, LocalDate fechEmision, float sueldoBruto, float sueldoNeto,
			ArrayList<Concepto> concepto) {
		super();
		this.nombreEmp = nombreEmp;
		this.direcc = direcc;
		this.fechEmision = fechEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.concepto = concepto;
	}
	
	
	
	
}
