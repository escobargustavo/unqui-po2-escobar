package ar.edu.unq.claseStreams;

public class Producto implements Comparable<Producto>{
	public Producto(String nombre, int i) {
		this.nombre = nombre;
		this.precio = i;
	}
	private String nombre;
	private int precio;
	
	public int getPrecio() {
		return this.precio;
	}
	
	public double getPrecioConIva() {
		return this.precio * 1.21d;
	}

	@Override
	public int compareTo(Producto o) {
		// TODO Auto-generated method stub
		if(this.precio < o.getPrecio()) return -1;
		if(this.precio > o.getPrecio()) return 1;
		return 0;
	}
}
