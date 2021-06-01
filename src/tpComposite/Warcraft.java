package tpComposite;

import model.Point;

public abstract class Warcraft {

	private Point lugarEnMapa;

	public abstract void caminar(int distanciaX, int distanciaY);

	public Point getLugarEnMapa() {
		return lugarEnMapa;
	}

	public void setLugarEnMapa(Point lugarEnMapa) {
		this.lugarEnMapa = lugarEnMapa;
	}
}
