package tpSOLID.banco;

public class SolicitudCreditoHipotecario extends Solicitud {

	public SolicitudCreditoHipotecario(Cliente clienteSolicitante, float monto, int cantCuotas) {
		super(clienteSolicitante, monto, cantCuotas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void procesarSolicitud() {
		// Verificacion de solicitud Credito Hipotecario
		boolean condicionEdad = this.getClienteSolicitante().getEdad() + this.getCantCuotas() < 65;
		boolean condicionGarantia = this.getMonto() < this.getClienteSolicitante().getGarantia().getValorFical() / 70 * 100;
		boolean condicionCuota = this.valorCuota() < this.getClienteSolicitante().getSueldoNetoMensual() / 2;
		this.setEstado(condicionCuota && condicionEdad && condicionGarantia);
	}

}
