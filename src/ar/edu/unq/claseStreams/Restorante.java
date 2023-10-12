package ar.edu.unq.claseStreams;

import java.util.ArrayList;

public class Restorante {
	private ArrayList<Producto> productos = new ArrayList<>();
	
	public void addProducto(Producto p) {
		this.productos.add(p);
	}
	
	public double sumaDePreciosMasBaratos() {
		return productos.stream().filter(p -> p.getPrecioConIva() < 2000)
								 .mapToDouble(p -> p.getPrecioConIva())
								 .sum();
	}
}
