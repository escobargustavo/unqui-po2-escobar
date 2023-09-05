package ar.edu.unq.tp2;

import java.util.ArrayList;

/**
 * Clase que modela una Empresa
 * @author egust
 *
 */
public class Empresa {

	private String nombre;
	private String CUIT;
	private ArrayList<Empleado> empleados;
	
	
	
	public Empresa(String nombre, String cUIT, ArrayList<Empleado> empleados) {
		this.nombre = nombre;
		CUIT = cUIT;
		this.empleados = empleados;
	}

	public float totalSueldosNeto() {
		float total = 0;
		
		for (Empleado empleado : empleados) {
			total += empleado.sueldoNeto();
		}
		
		return total;
	}
	
	public float totalSueldosBruto() {
		float total = 0;
		
		for (Empleado empleado : empleados) {
			total += empleado.sueldoBruto();
		}
		
		return total;
	}
	
	public float totalRetenciones() {
		float total = 0;
		
		for (Empleado empleado : empleados) {
			total += empleado.retenciones();
		}
		
		return total;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCUIT() {
		return CUIT;
	}

	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}
	
	
	public void liquidarSueldos() {
		
		for (Empleado empleado : empleados) {
			empleado.liquidarSueldo();
		}
	}
	
	
}
