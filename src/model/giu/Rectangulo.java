package model.giu;

import model.stack.Altura;
import model.stack.Base;

public class Rectangulo {
	private Base base;
	private Altura altura;
	
	
	public Rectangulo(Base base, Altura altura) {
		
		boolean condicion1 = base.getOrigen().getX() == altura.getOrigen().getX();
		boolean condicion2 = base.getLargo().getX() == altura.getAltura().getX();
		boolean condicion3 = altura.getOrigen().getY() == altura.getAltura().getY();
		if (condicion1 && condicion2 && condicion3) {
			this.base = base;
			this.altura = altura;
		}
		
	}


	public double area() {
		return this.base.distancia() * this.altura.distancia();
	}


	public double perimetro() {
		return  base.distancia() *2 + altura.distancia()*2;
	}
}
