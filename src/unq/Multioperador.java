package unq;

import java.util.ArrayList;

public class Multioperador {
	private ArrayList<Integer> multioperador;
	
	
	public Multioperador() {
		this.multioperador = new ArrayList<Integer>();
	}


	public void addNumber(Integer aNumber) {
		this.multioperador.add(aNumber);
	}


	public int suma() {
		int resultado = 0;
		for(int i = 0; i < this.multioperador.size(); i++) {
			resultado = resultado + this.multioperador.get(i); 
		}
		return resultado;
	}


	public int resta() {
		int resultado = this.multioperador.get(0);
		for(int i = 0; i < this.multioperador.size() -1; i++) {
			resultado = resultado - this.multioperador.get(i+1); 
		}
		return resultado;
	}


	public int multiplicarPor() {
		int resultado = 1;
		for(int i = 0; i < this.multioperador.size() ; i++) {
			resultado = resultado * this.multioperador.get(i); 
		}
		return resultado;
	}
}
