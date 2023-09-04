package ar.edu.unq.tp3;

import java.util.ArrayList;

/**
 * 6. Multioperador Programe la clase Multioperador, que permite aplicar las
 * operaciones de suma, resta y multiplicación sobre ArrayLists de enteros. Es
 * decir, poder sumar todos los números que contiene, poder restar todos los
 * números que contiene y poder multiplicar a todos los números que contiene
 * entré si.
 * 
 * @author egust
 *
 */
public class Multioperador {

	private ArrayList<Integer> lisNum = new ArrayList<Integer>();
	
	public void addNum(int n) {
		this.lisNum.add(n);
	}
	public int suma() {
		int result = 0;

		for (int i = 0; i < lisNum.size(); i++) {
			result += lisNum.get(i);
		}
		return result;
	}

	public int resta() {
		
		int result;
		if (lisNum.size() == 0) {
			return 0;
		} else {
			result = lisNum.get(0);
			for (int i = 1; i < lisNum.size(); i++) {
				result -= lisNum.get(i);
			}
		}
		return result;
	}
	
	public int multiplicacion() {
		
		int result;
		if (lisNum.size() == 0) {
			return 0;
		} else {
			result = lisNum.get(0);
			for (int i = 1; i < lisNum.size(); i++) {
				result *= lisNum.get(i);
			}
		}
		return result;
	}
}
