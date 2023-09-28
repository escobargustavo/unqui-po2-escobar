package ar.edu.unq.impuesto;

import java.util.ArrayList;

public class Trabajador {

	private ArrayList<Ingreso> ingresos;

	public void addIngreso(Ingreso i) {
		this.ingresos.add(i);
	}
	
	public int getCantIngresos() {
		return ingresos.size();
	}

	public Trabajador(ArrayList<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}

	public Trabajador() {
		this.ingresos = new ArrayList<>();
	}

	public void setIngresos(ArrayList<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}

	public double getTotalPercibido() {
		// retornar el monto total percibido por el trabajador
		double result = 0;

		if(this.ingresos.isEmpty()) {
			return result;
		}else {
			for (int i = 0; i < ingresos.size(); i++) {
				result += ingresos.get(i).getMonto();
			}
		}

		return result;
	}

	public double getMontoImponible() {
		// retornar el monto imponible al impuesto al trabajador
		double result = 0;

		if(this.ingresos.isEmpty()) {
			return 0;
		}else {
			for (Ingreso ingreso : ingresos) {

				if (!ingreso.getConcepto().equalsIgnoreCase("Horas extras")) {
					result += ingreso.getMonto();
				}
			}
		}

		return result;

	}

	public double getImpuestoAPagar() {
		// retornar el monto a pagar por el trabajador, calculado como el 2% del monto
		// imponible
		return this.getMontoImponible() * 0.2;
	}

}
