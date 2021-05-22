package tpSOLID;

import java.util.List;
import java.util.ArrayList;



public class ServidorPop implements IServidor, IServidorCorreo {
	
	private ArrayList<ClienteEMail> clientes;
	public ArrayList<ClienteEMail> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<ClienteEMail> clientes) {
		this.clientes = clientes;
	}

	private boolean estado; // se consideta true conectado y false no conectado

	public List<Correo> recibirNuevos(String user, String pass) {
		List<Correo> retorno = new ArrayList<Correo>();
	  //Verificar autenticidad de usuario.
		//obtener emails Nuevos del usuario.
		//asignar a retorno la lista de los nuevos e-mails.
		for(int i =0; i<this.clientes.size();i++) {
			String nombre = this.clientes.get(i).getNombreUsuario();
			String passw = this.clientes.get(i).getPassusuario();
		 if(user.equals(nombre) && pass.equals(passw)) {
			 retorno = this.clientes.get(i).inbox;
		 }
		}
		return retorno;
	}

	public void conectar(String nombreUsuario, String passusuario) {
	   //Verifica que el usuario sea valido y establece la conexion.
		for(int i =0; i<this.clientes.size();i++) {
			String nombre = this.clientes.get(i).getNombreUsuario();
			String pass = this.clientes.get(i).getPassusuario();
		 this.setEstado(nombreUsuario.equals(nombre) && passusuario.equals(pass));
		}
	}

	public void enviar(Correo correo) {
      //realiza lo necesario para enviar el correo.	
		for(int i =0; i<this.clientes.size();i++) {
			if(correo.getDestinatario().equals(this.clientes.get(i).getNombreUsuario())) {
				this.clientes.get(i).inbox.add(correo);
				break;
			}
		}
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void addCliente(ClienteEMail cliente) {
		this.clientes.add(cliente);
		
	}




}

