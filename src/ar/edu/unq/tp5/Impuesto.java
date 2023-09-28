package ar.edu.unq.tp5;

public class Impuesto extends Factura {

	private double valor;
	
	
	
	public Impuesto(String nommbre, double valor) {
		super(nommbre);
		this.valor = valor;
	}



	@Override
	public double totalAPagar() {
		return valor;
	}

}
