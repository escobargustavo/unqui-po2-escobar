package ar.edu.unq.tp5;

public class Servicio extends Factura{

	private double costoPorUnidad;
	private int cantUnidades;
	
	
	
	public Servicio(String nommbre, double costoPorUnidad, int cantUnidades) {
		super(nommbre);
		this.costoPorUnidad = costoPorUnidad;
		this.cantUnidades = cantUnidades;
	}



	@Override
	public double totalAPagar() {
		return costoPorUnidad * cantUnidades;
	}

}
