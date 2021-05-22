package model;

public class Impuesto extends Factura implements IFacturar{

	private float tasaServicio;
	@Override
	public void registrarPago(Factura factura) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calcularPrecio() {
		return this.getTasaServicio();
	}

	public Impuesto(float tasaServicio) {
		super();
		this.tasaServicio = tasaServicio;
	}

	public float getTasaServicio() {
		return tasaServicio;
	}

	public void setTasaServicio(float tasaServicio) {
		this.tasaServicio = tasaServicio;
	}
	

}
