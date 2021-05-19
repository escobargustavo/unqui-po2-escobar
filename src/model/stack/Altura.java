package model.stack;

import model.Point;

public class Altura {
	private Point origen;
	private Point altura;
	
	
	
	public Point getOrigen() {
		return origen;
	}
	public void setOrigen(Point origen) {
		this.origen = origen;
	}
	public Point getAltura() {
		return altura;
	}
	public void setAltura(Point altura) {
		this.altura = altura;
	}
	
	public double distancia() {
		int x = this.getAltura().getX() - this.getOrigen().getX();
		int y = this.getAltura().getY() - this.getOrigen().getY();
		double distancia =  Math.sqrt((x*x) + (y*y));
		return distancia;
		
	}
}
