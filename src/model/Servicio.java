package model;

public class Servicio extends Factura implements IFacturar{

	private float costoPorUnidad;
	private int cantUnidades;
	
	@Override
	public void registrarPago(Factura factura) {
		// TODO Auto-generated method stub
		
	}

	public Servicio(float costoPorUnidad, int cantUnidades) {
		super();
		this.costoPorUnidad = costoPorUnidad;
		this.cantUnidades = cantUnidades;
	}

	public float getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public void setCostoPorUnidad(float costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	public int getCantUnidades() {
		return cantUnidades;
	}

	public void setCantUnidades(int cantUnidades) {
		this.cantUnidades = cantUnidades;
	}

	@Override
	public float calcularPrecio() {
		
		return this.costoPorUnidad * this.cantUnidades;
	}

}
