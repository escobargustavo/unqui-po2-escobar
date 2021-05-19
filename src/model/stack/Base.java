package model.stack;

import model.Point;

public class Base {
	private Point origen;
	private Point largo;
	
	public Point getOrigen() {
		return origen;
	}
	public void setOrigen(Point origen) {
		this.origen = origen;
	}

	public void setLargo(Point largo) {
		this.largo = largo;
	}
	
	public double distancia() {
		int x = this.getLargo().getX() - this.getOrigen().getX();
		int y = this.getLargo().getY() - this.getOrigen().getY();
		double distancia =  Math.sqrt((x*x) + (y*y));
		return distancia;
		
	}
	public Point getLargo() {
		return this.largo;
	}
}
