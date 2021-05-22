package model;

import java.util.ArrayList;

public class Caja{

	private float totalAPagar;
	private ArrayList<Producto> productos;
	private ArrayList<Factura> facturas;


	public void facturtar() {
		float total = 0;
		for(int i = 0; i < this.getProductos().size(); i++) {
			total = total + this.getProductos().get(i).calcularPrecio();
			this.getProductos().get(i).setStock(this.getProductos().get(i).getStock() - 1);
		}
		for(int i = 0; i < this.getFacturas().size(); i++) {
			total = total + this.getFacturas().get(i).calcularPrecio();
			this.getFacturas().get(i).registrarPago(this.getFacturas().get(i)); // Aca se registra el pago del servico y/o impuesto
		}
		this.setTotalAPagar(total);
	}
	public float getTotalAPagar() {
		return totalAPagar;
	}

	public void setTotalAPagar(float totalAPagar) {
		this.totalAPagar = totalAPagar;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}

}
