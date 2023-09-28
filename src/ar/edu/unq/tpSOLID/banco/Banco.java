package ar.edu.unq.tpSOLID.banco;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Cliente> clientes= new ArrayList<Cliente>();
	private ArrayList<SolicitudCredito> solicitudes = new ArrayList<SolicitudCredito>();
	private EvaluadorCredito evaluador;
	
	
	public Banco(EvaluadorCredito evaluador ) {
		this.evaluador = evaluador;
	}
	
	public void addSolicitud(SolicitudCredito s) {
		this.solicitudes.add(s);
	}
	public void addCliente(Cliente c) {
		this.clientes.add(c);
	}
	

	public void evaluarSolicitudes() {
		
		for (SolicitudCredito solicitud : solicitudes) {
			if(evaluador.esAceptable(solicitud)) {
				System.out.println("Solicitud aceptada");
			}
			else {
				System.out.println("Solicitud no aceptada");
			}
		}
	}
}
