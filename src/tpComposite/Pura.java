package tpComposite;

public class Pura implements IPorcionDeTierra {
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public float gananciaAnual() {
		float ganancia = 0;
		if(this.getTipo().equals("Soja")) {
			ganancia = 500;
		}
		if(this.getTipo().equals("Trigo")) {
			ganancia = 300;
		}
		
		return ganancia;
	}
	
}
