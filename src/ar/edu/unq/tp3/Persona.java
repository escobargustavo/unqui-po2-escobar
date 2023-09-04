package ar.edu.unq.tp3;

import java.time.LocalDate;

/**
 * Implemente la clase Persona en Java. Una persona tiene un nombre y una fecha
 * de nacimiento, por lo que debe ser posible pedirle su nombre, fecha de
 * nacimiento y edad. En base a esto
 * 
 * @author egust
 *
 */
public class Persona {

	private String nombre;
	private LocalDate fchaNac;

	// metodo que responde la edad de la persona
	public int edad() {
		LocalDate hoy = LocalDate.now();
		int edad = hoy.getYear() - this.getFchaNac().getYear();
		return edad;
	}

	/**
	 * 1. Responder: Si un objeto cualquiera que le pide la edad a una Persona:
	 * �Conoce c�mo �sta calcula u obtiene tal valor? �C�mo se llama el mecanismo de
	 * abstracci�n que permite esto? Rta: el objeto que pide la edad no tiene que
	 * saber como se realiza el calculo, el mecanismo se llama ENCAPSULAMIENTO
	 */
	/*
	 * 2. Agregue a la clase Persona definida anteriormente el m�todo
	 * menorQue(Persona persona) que recibe como par�metro a otra persona y retorna
	 * true en caso de que el receptor sea menor en edad que el par�metro, o false
	 * en caso contrario.
	 */

	public boolean menorQue(Persona p) {
		return this.edad() < p.edad();
	}

	/*
	 * * 3. Agregue a la clase Persona un m�todo (de clase) de creaci�n, respetando
	 * la siguiente firma: Persona(String nombre, Date fechaNacimiento) que recibe
	 * como par�metros el nombre y la fecha de nacimiento de la persona a crear,
	 * crea una nueva instancia de Persona y la retorna inicializada con los valores
	 * recibidos como par�metro.
	 */
	public Persona(String nombre, LocalDate fchaNac) {
		this.setFchaNac(fchaNac);
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFchaNac() {
		return fchaNac;
	}

	public void setFchaNac(LocalDate fchaNac) {
		this.fchaNac = fchaNac;
	}

}
