package model;
 
public class Producto implements IFacturar{
	private float precio;
	private boolean esDeCooperativa;
	private int stock;
	
	
	
	public Producto(float precio, boolean esDeCooperativa, int stock) {
		this.precio = precio;
		this.esDeCooperativa = esDeCooperativa;
		this.stock = stock;
	}
	
	public boolean getEsDeCooperativa() {
		return esDeCooperativa;
	}
	public void setEsDeCooperativa(boolean esDeCooperativa) {
		this.esDeCooperativa = esDeCooperativa;
	}
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	

	public float calcularPrecio() {
		if(this.getEsDeCooperativa()) {
			return this.getPrecio() - this.getPrecio() * 10 / 100;
			
		}
		else {

			return this.getPrecio();
		}
	}
	
	
}
