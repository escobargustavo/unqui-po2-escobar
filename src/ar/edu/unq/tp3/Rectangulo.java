package ar.edu.unq.tp3;

/**
 * Utilizando el punto implementado anteriormente, defina el comportamiento de
 * un Rectángulo definido en un espacio de dos dimensiones, es decir, poseer una
 * ubicación en un espacio de coordenadas x e y. Los rectángulos deben tener el
 * siguiente comportamiento:
 * 
 * @author egust
 *
 */
public class Rectangulo {

	private Point punto1; // inferior izquierdo
	private Point punto2; // inferior derecho
	private Point punto3; // superior izquierdo
	private Point punto4; // superior derecho

	/**
	 * 1. Crearse en forma apropiada y asegurando su consistencia. se solicita el
	 * punto de origen (inferior izquierdo), el alto y el ancho para la creacion
	 * correcta del mismo
	 */
	public Rectangulo(Point origen, int ancho, int alto) {
		this.setPunto1(origen);
		this.setPunto2(new Point(origen.getX() + ancho, origen.getY()));
		this.setPunto3(new Point(origen.getY(), origen.getY() + alto));
		this.setPunto4(new Point(origen.getX() + ancho, origen.getY() + alto));

	}

	// 2. Obtener el área

	public int area() {
		int base = this.getPunto2().getX() - this.getPunto1().getX();

		int altura = this.getPunto3().getY() - this.getPunto1().getY();
		return base * altura;
	}
	
	// 3. Obtener el perímetro.
	public int perimetro() {
		int base = this.getPunto2().getX() - this.getPunto1().getX();
		int altura = this.getPunto3().getY() - this.getPunto1().getY();
		
		return (base + altura) * 2;
	}

	/*
	 *  4. Determinar si son horizontales o verticales.
	 *  el mismo se hara en dos funciones una para horizontal y otra para vertical
	 *  
	 *  ob. no se tiene en cuenta el caso que sea un cuadrado
	 */

	public boolean esHorizontal() {
		int base = this.getPunto2().getX() - this.getPunto1().getX();
		int altura = this.getPunto3().getY() - this.getPunto1().getY();
		
		return base >  altura;
	}
	
	public boolean esVertical() {
		int base = this.getPunto2().getX() - this.getPunto1().getX();
		int altura = this.getPunto3().getY() - this.getPunto1().getY();
		
		return base < altura ;
	}
	
	public Point getPunto1() {
		return punto1;
	}

	public void setPunto1(Point punto1) {
		this.punto1 = punto1;
	}

	public Point getPunto2() {
		return punto2;
	}

	public void setPunto2(Point punto2) {
		this.punto2 = punto2;
	}

	public Point getPunto3() {
		return punto3;
	}

	public void setPunto3(Point punto3) {
		this.punto3 = punto3;
	}

	public Point getPunto4() {
		return punto4;
	}

	public void setPunto4(Point punto4) {
		this.punto4 = punto4;
	}


}
