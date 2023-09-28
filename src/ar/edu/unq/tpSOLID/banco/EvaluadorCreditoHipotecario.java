package ar.edu.unq.tpSOLID.banco;

public class EvaluadorCreditoHipotecario implements EvaluadorCredito{

	@Override
	public boolean esAceptable(SolicitudCredito solicitud) {
		if(solicitud instanceof SolicitudCreditoHipotecario) {
			return evaluar((SolicitudCreditoHipotecario) solicitud);
		}
		else {
			return false;
		}
	}

	private boolean evaluar(SolicitudCreditoHipotecario solicitud) {
		double montoSolicitado = solicitud.getMonto();
		double valorCuota = solicitud.valorCuota();
		System.out.println(valorCuota * 0.5);
		
		return ( montoSolicitado < solicitud.getGarantia().getValor() * 0.7 ) && valorCuota * 0.5 < solicitud.getCliente().getSueldoNetoM()  
				&& solicitud.getCliente().getEdad() + solicitud.getCantCuotas() < 65;
	}
}
