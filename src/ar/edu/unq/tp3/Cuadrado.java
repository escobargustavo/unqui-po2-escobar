package ar.edu.unq.tp3;

/**
 * Además, diseñe la clase Cuadrado (re)utilizando lo anterior (Rectangulo)
 * @author egust
 *
 */
public class Cuadrado {
	
	private Rectangulo cuadrado;
	
	/*
	 *Reutilizando lo realizado para Rectangulo solo se necesita el punto de origen donde se comezara
	 *a construir la figura y solo un valor para el lado, ya que los cuadrados tienen todos sus lados iguales 
	 */
	public Cuadrado(Point origen, int lado) {
		this.cuadrado = new Rectangulo(origen, lado,lado);
	}
	
	public int area() {
		return cuadrado.area();
	}
	
	public int perimetro() {
		return cuadrado.perimetro();
	}
}
