package ar.edu.unq.tp2;




import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *clase abstracta que modela a un 
 *Empleado
 * @author egust
 *
 */
public abstract class Empleado {
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private Date fechaNac;
	private float sueldoBasico;
	private ArrayList<Recibo> recibos;
	
	
	// metodo que devuelve si el Empleado esta soltero
	public boolean isSoltero() {
		return this.getEstadoCivil().equalsIgnoreCase("soltero");
	}
	
	
	//metodo que devuele la edad del Empleado
	public int edad() {
		LocalDate hoy = LocalDate.now();
		
		return hoy.getYear() - this.getFechaNac().getYear();
	}
	
	//Metodos abstractos a definir por las sub-clases
	public abstract float sueldoBruto();
	public abstract float sueldoNeto();
	public abstract float retenciones();
	
	
	
	// Constructo y GETTER & SETTER
	public Empleado(String nombre, String direccion, String estadoCivil, Date fechaNac, float sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNac = fechaNac;
		this.sueldoBasico = sueldoBasico;
		//CADA VEZ QUE SE CREA UN EMPLEADO NUEVO SU LISTA DE RECIBOS SE INICIALIZA VACIA HASTA EL MOMENTO QUE 
		// LA EMPRESA CARGUE EL RECIBO CORRESPONDIENTE
		this.recibos = new ArrayList<Recibo>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public float getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}


	protected abstract void liquidarSueldo();
	
	public void addRecibo(Recibo r) {
		this.recibos.add(r);
	}
	
}
