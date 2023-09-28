package ar.edu.unq.tp5;

public abstract class Factura {
	
	private String nombre;
	
	

	public Factura(String nommbre) {
		super();
		this.nombre = nommbre;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nommbre) {
		this.nombre = nommbre;
	}



	public abstract double totalAPagar();
}
