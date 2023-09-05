package ar.edu.unq.tp2;

public class Concepto {

	private String nombreC;
	private float monto;
	
	
	public String getNombreC() {
		return nombreC;
	}
	
	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}
	
	public float getMonto() {
		return monto;
	}
	
	public void setMonto(float monto) {
		this.monto = monto;
	}
	
	public Concepto(String nombreC, float monto) {
		this.nombreC = nombreC;
		this.monto = monto;
	}
	
	
}
