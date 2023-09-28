package ar.edu.unq.tpSOLID.banco;

public class Propiedad {

	private String descripcion;
	private String direccion;
	private double valorFiscal;

	public Propiedad(String descripcion, String direccion, double valor) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valor;
	}
	public double getValor() {
		return this.valorFiscal;
	}
}
