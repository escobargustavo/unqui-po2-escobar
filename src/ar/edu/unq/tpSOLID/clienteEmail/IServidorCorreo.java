package ar.edu.unq.tpSOLID.clienteEmail;

import java.util.List;

public interface IServidorCorreo extends IServidor {
	public List<Correo> recibirNuevos(String user, String pass);
	public void enviar(Correo correo);
}
