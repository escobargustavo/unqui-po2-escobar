package tpSOLID.banco;

public class Propiedad {
	private String descripcion;
	private String direccion;
	private float valorFical;
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public float getValorFical() {
		return valorFical;
	}

	public void setValorFical(float valorFical) {
		this.valorFical = valorFical;
	}

	public Propiedad(String descripcion, String direccion, float valorFical) {
		super();
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFical = valorFical;
	}
	
}
