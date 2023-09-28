package ar.edu.unq.tp5;

import java.util.ArrayList;

public class Caja implements Agencia{
	
	
	private String idCaja;
	private ArrayList<Producto> productos;
	private ArrayList<Factura> facturas;
	
	public void addFactura(Factura f) {
		this.facturas.add(f);
	}
	
	public void addProducto(Producto p) {
		this.productos.add(p);
	}
	
	public int cantProductos() {
		return productos.size();
	}
	
	public Caja(String id) {
		this.idCaja = id;
		this.productos = new ArrayList<>();
		this.facturas = new ArrayList<>();
	}
	
	
	public double calcularMontoAPagar() {
		double total = 0;
		for (Producto producto : productos) {
			if(!producto.isEmpresaTradicional()) {
				total += producto.getPrecio() - (producto.getPrecio() * 0.10);
				producto.decrementarStock();
			}
			else {
				total += producto.getPrecio();
				producto.decrementarStock();
			}
		}
		
		for (Factura factura : facturas) {
			total += factura.totalAPagar();
			registrarPago(factura);
		}
		return total;
		
	}

	@Override
	public void registrarPago(Factura factura) {
		System.out.println("Se registro el pago de la factura de: " + factura.getNombre());
	}
	
}
