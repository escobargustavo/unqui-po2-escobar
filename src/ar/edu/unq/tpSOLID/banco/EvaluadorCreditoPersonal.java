package ar.edu.unq.tpSOLID.banco;

public class EvaluadorCreditoPersonal implements EvaluadorCredito{

	@Override
	public boolean esAceptable(SolicitudCredito solicitud) {
		if(solicitud instanceof SolicitudCreditoPersonal) {
			return evaluar((SolicitudCreditoPersonal) solicitud);
		}
		else {
			return false;
		}
	}

	private boolean evaluar(SolicitudCreditoPersonal solicitud) {
		double montoAnual = solicitud.getCliente().sueldoNetoA();
		double valorCuota = solicitud.valorCuota();
		return (montoAnual > 15000) && solicitud.getCliente().getSueldoNetoM() > valorCuota * 0.7;
	}
	

	
}
