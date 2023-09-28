package ar.edu.unq.tpSOLID.clienteEmail;

public interface IServidorWeb extends IServidor{

	public float tazaDeTransferencia();

	public void resetear();
	
	public void realizarBackUp();

}
