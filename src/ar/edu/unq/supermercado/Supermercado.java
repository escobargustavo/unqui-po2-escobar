package ar.edu.unq.supermercado;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	
	private ArrayList<Producto> productos;
	
	
	/**
	 * Constructor del Supermercado
	 * @param nombre
	 * @param direccion
	 * al crear el "Supermercado" se inicializa la lista de productos
	 */
	public Supermercado(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.productos = new ArrayList<>();
	}

	public Integer getCantidadDeProductos() {
		return productos.size();
	}

	// metodo para agregar un Producto p a la lista de productos
	public void agregarProducto(Producto p) {
		productos.add(p);
		
	}

	// metodo que retorna el total de los precios de los productos
	public Double getPrecioTotal() {
		double total = 0;
		
		for (Producto producto : productos) {
			total += producto.getPrecio();
		}
		
		return total;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
}
