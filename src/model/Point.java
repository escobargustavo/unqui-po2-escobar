package model;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Point() {
		this.setX(0);
		this.setY(0);
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

	public void moverPoint(int i) {
		this.setX(getX()+i);
		this.setY(getY()+i);
	}

	public Point sumarPoint(Point point) {
		Point resultado = new Point();
		resultado.setX(this.getX() + point.getX());
		resultado.setY(this.getY() + point.getY());
		return resultado;
	}
	
	
	
}
