package ar.edu.unq.tp3;

/**
 * Diseñe e implemente la clase Point (punto). La misma debe tener el siguiente comportamiento:
 * @author egust
 *
 */

public class Point {

	private int x;
	private int y;
	
	
	//1. Debe ser posible crearse indicando como referencia los valores x e y
	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	//2. También debe ser posible crear un punto directamente sin enviarles parámetros, en este caso el punto
	//debe crearse en las coordenadas (0,0).
	public Point() {
		this.setX(0);
		this.setY(0);
	}
	
	//3. Debe ser posible mover un punto a otra posición.
	// se asume que se recibe un punto a donde debe moverse
	public void moverPunto(Point posicion) {
		this.setX(posicion.getX());
		this.setY(posicion.getY());
	}
	
	
	//4. Sumarse con otro punto y como resultado obtener un nuevo punto con las valores de x e y sumados.
	public Point sumarPuntos(Point aSumar) {
		return new Point(this.getX() + aSumar.getX(), this.getY() + aSumar.getY());
		
	}
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	
}
