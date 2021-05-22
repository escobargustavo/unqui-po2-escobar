package tpSOLID.banco;

public class SolicitudCreditoPersonal extends Solicitud {

	
	
	public SolicitudCreditoPersonal(Cliente clienteSolicitante, float monto, int cantCuotas) {
		super(clienteSolicitante, monto, cantCuotas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void procesarSolicitud() {
		// Verificacion se solicitud para Credito Personal
		boolean conIngresoAnual = this.getClienteSolicitante().sueldoNetoAnual() > 15000;
		boolean conCuota =  (this.getClienteSolicitante().getSueldoNetoMensual() / 70 * 100)> this.valorCuota();
		this.setEstado(conCuota && conIngresoAnual);
	}

}
