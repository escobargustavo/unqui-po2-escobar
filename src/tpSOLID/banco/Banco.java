package tpSOLID.banco;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Cliente> clientes;
	private ArrayList<Solicitud> solicitudes;

	
	public Banco(ArrayList<Cliente> clientes, ArrayList<Solicitud> solicitudes) {
		this.clientes = clientes;
		this.solicitudes = solicitudes;
	}
	
	public void addCliente(Cliente newCliente) {
		this.clientes.add(newCliente);
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Solicitud> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(ArrayList<Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}

	public void addSolicitud(Solicitud solicitud) {
		this.solicitudes.add(solicitud);
	}
	
	public void procesarSolicitud() {
		for(int i = 0; i < this.solicitudes.size(); i++) {
			this.solicitudes.get(i).procesarSolicitud();
		}
	}
}
