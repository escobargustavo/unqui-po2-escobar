package ar.edu.unq.tpSOLID.banco;

public class SolicitudCreditoHipotecario extends SolicitudCredito {
	
	private Propiedad garantia;
	public SolicitudCreditoHipotecario(Cliente cliente, double monto, int cantCuotas, Propiedad garantia) {
		super(cliente, monto, cantCuotas);
		this.garantia = garantia;
	}

	public Propiedad getGarantia() {
		return this.garantia;
	}
	

	

}
