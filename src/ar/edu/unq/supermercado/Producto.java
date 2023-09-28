package ar.edu.unq.supermercado;

public class Producto {
	
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;

	
	// constructor para producto con precios cuidados
	public Producto(String nombre, double precio, boolean esCuidado) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(esCuidado);
		
	}

	// constructor para producto sin precio cuidado
	public Producto(String nombre, double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(false);
		
	}


	public void aumentarPrecio(double d) {
		this.setPrecio(this.getPrecio() + d);
		
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

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	

}
