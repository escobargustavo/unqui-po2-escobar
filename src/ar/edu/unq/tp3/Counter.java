package ar.edu.unq.tp3;

import java.util.ArrayList;

/**
 * Cree un nuevo proyecto de Java en Eclipse. Cree una clase llamada Counter
 * dentro del paquete ar.edu.unq.po2.tp3 que, a partir de un ArrayList que
 * mantiene como variable privada, sea capaz de contar:
 * 
 * @author egust
 *
 */

public class Counter {

	private ArrayList<Integer> counter;

	public Counter() {
		this.setCounter(new ArrayList<Integer>());
	}

//	1. La cantidad de pares
	public int getEvenOcurrences() {
		int res = 0;

		for (int i = 0; i < this.getCounter().size(); i++) {
			if (this.getCounter().get(i) % 2 == 0) {
				res+=1;
			}
		}

		return res;
	}

//	2. La cantidad de impares

	public int getOddOcurrences() {
		int res = 0;

		for (int i = 0; i < this.getCounter().size(); i++) {
			if (this.getCounter().get(i) % 2 == 1) {
				res++;
			}
		}

		return res;
	}

//	3. La cantidad de múltiplos de un cierto número.
	public int cantMultiplosDe(int n) {
		int res = 0;

		for (int i = 0; i < this.getCounter().size(); i++) {
			if (this.getCounter().get(i) % n == 0) {
				res++;
			}
		}

		return res;
	}

	public void addNumber(int i) {
		// TODO Auto-generated method stub
		this.getCounter().add(i);

	}

	public ArrayList<Integer> getCounter() {
		return counter;
	}

	public void setCounter(ArrayList<Integer> counter) {
		this.counter = counter;
	}

}
