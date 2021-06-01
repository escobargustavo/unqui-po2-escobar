package tpComposite;

import java.util.ArrayList;

import tpCompositeTest.Mapa;


public class Ingeniero extends Warcraft{


	private ArrayList<Laja> lajas;
	private Mapa mapa;
	
	@Override
	public void caminar(int distanciaX, int distanciaY) {
		
		for(int i = 0; i< distanciaX; i++) {
				this.getLugarEnMapa().setX(this.getLugarEnMapa().getX() + 1);
					if(!mapa.hayLaja()) {
							if(!this.lajas.isEmpty()) {
									this.lajas.remove(0);
							}
					}
		}
		
		for(int i = 0; i< distanciaY; i++) {
			this.getLugarEnMapa().setY(this.getLugarEnMapa().getY() + 1);
			if(!mapa.hayLaja()) {
					if(!this.lajas.isEmpty()) {
						this.lajas.remove(0);
					}
			}
		}
		
	}


	public Mapa getMapa() {
		return mapa;
	}


	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}


	public Ingeniero() {
		this.lajas = new ArrayList<Laja>();
	}

	public void addLaja(Laja laja) {
		this.lajas.add(laja);
		
	}

	public ArrayList<Laja> getLajas() {
		
		return this.lajas;
	}

	public void remuveLaja(Laja laja) {
		this.lajas.remove(laja);
	}


}
