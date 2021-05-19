package unq;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> counter;

	
	public Counter() {
		this.counter = new ArrayList<Integer>();
	}

	public void addNumber(Integer unNumero) {
		this.counter.add(unNumero);
		
	}

	public ArrayList<Integer> getCounter() {
		return counter;
	}

	public void setCounter(ArrayList<Integer> counter) {
		this.counter = counter;
	}

	public int getEvenOcurrences() {
		int cantidad = 0;
		for(int i = 0; i < this.getCounter().size(); i++) {
			if (this.getCounter().get(i) %2 == 0) {
				cantidad = cantidad + 1;
			}
		}
		return cantidad;
	}

	public int getOddOcurrences() {
		int cantidad = 0;
		for(int i = 0; i < this.getCounter().size(); i++) {
			if (this.getCounter().get(i) %2 != 0) {
				cantidad = cantidad + 1;
			}
		}
		return cantidad;
	}

	public int cantidadMultiplosDe(int unNumero) {
		int multiplos = 0;
		for(int i = 0; i < this.getCounter().size(); i++) {
			if (this.getCounter().get(i) % unNumero == 0) {
				multiplos = multiplos + 1;
			}
		}
		return multiplos;
	}
	
	
}
