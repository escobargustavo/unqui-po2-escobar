package tpSOLID.banco;

public abstract class Solicitud implements ISolicitud{
	
	private Cliente clienteSolicitante;
	private float monto;
	private int cantCuotas;
	private boolean estado;
	
	
	
	public Solicitud(Cliente clienteSolicitante, float monto, int cantCuotas) {
		this.clienteSolicitante = clienteSolicitante;
		this.monto = monto;
		this.cantCuotas = cantCuotas;
	}
	
	public Cliente getClienteSolicitante() {
		return clienteSolicitante;
	}
	public void setClienteSolicitante(Cliente clienteSolicitante) {
		this.clienteSolicitante = clienteSolicitante;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	public int getCantCuotas() {
		return cantCuotas;
	}
	public void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public float valorCuota() {
		return this.monto / this.cantCuotas;
	}
}
