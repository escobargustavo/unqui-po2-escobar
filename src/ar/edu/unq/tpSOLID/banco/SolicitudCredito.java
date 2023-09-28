package ar.edu.unq.tpSOLID.banco;

public class SolicitudCredito {

	public class SolicitudCreditoPersonal {
	
	}

	private Cliente cliente;
	private double monto;
	private int cantCuotas;
	
	
	public SolicitudCredito(Cliente cliente, double monto, int cantCuotas) {
		this.cliente = cliente;
		this.monto = monto;
		this.cantCuotas = cantCuotas;
	}
	
	public double getMonto() {
		return this.monto;
	}
	public double valorCuota() {
		return monto / cantCuotas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getCantCuotas() {
		return this.cantCuotas;
	}
}
