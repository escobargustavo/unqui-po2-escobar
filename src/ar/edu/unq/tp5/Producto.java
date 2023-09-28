package ar.edu.unq.tp5;

public class Producto {
	
	private String nombre;
	private double precio;
	private boolean empresaTradicional;
	private int stock;
	
	
	public Producto(String nombre, double precio, boolean empresaTradicional, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.empresaTradicional = empresaTradicional;
		this.stock = stock;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public boolean isEmpresaTradicional() {
		return empresaTradicional;
	}


	public void setEmpresaTradicional(boolean empresaTradicional) {
		this.empresaTradicional = empresaTradicional;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void decrementarStock() {
		if(this.getStock() > 0) {
			this.setStock(this.getStock() - 1);
		}else {
			this.setStock(0);
		}
	}

}
