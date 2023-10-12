package ar.edu.unq.enumerativosYstreams;

public enum LesionesDermatologicas{

	ROJO("GRAVE",10), GRIS("SANANDO",7), AMARILLO("YA CASI",3), MIEL("CURADO",1);
	
	String descripcion;
	int nivel;
	
	LesionesDermatologicas(String descripcion, int nivel) {
		this.descripcion = descripcion;
		this.nivel = nivel;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public LesionesDermatologicas next() {
		int siguiente = (this.ordinal() + 1) % LesionesDermatologicas.values().length;
		return LesionesDermatologicas.values()[siguiente];
		
	}
	
	
}
