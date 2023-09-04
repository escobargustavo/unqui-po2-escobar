package ar.edu.unq.tp3;

import java.util.ArrayList;

public class tp3 {

	public static void main(String[] args) {

	}

	/**
	 * Diseñe e implemente una función Java que reciba un arreglo de números enteros
	 * y devuelva el número que tiene la mayor cantidad de dígitos pares. No puede
	 * utilizar String!!. Por lo cual, debe razonar cómo desarmar el número
	 * utilizando los operadores de los números enteros (div y mod).
	 * 
	 * ob: se queda con el ultimo primer numero con mayor cantidad de digitos pares
	 */

	public static int mayorCantDigitosPares(ArrayList<Integer> list) {
		int result = 0;
		int contador = 0;
		for (int i = 0; i < list.size(); i++) {
			if (contador < cantDigitosPares(list.get(i))) {
				result = list.get(i);
				contador = cantDigitosPares(list.get(i));
			}
		}

		return result;
	}

	public static int cantDigitosPares(int n) {
		int result = 0;
		int digito = 0;
		while (n != 0) {
			digito = n / 10;
			if (digito % 2 == 0) {
				result++;
			}
			n /= 10;
		}
		return result;

	}

	/**
	 * Realice una función que reciba dos valores X e Y, y devuelva el número más
	 * alto entre 0 y 1000, que sea múltiplo simultáneamente de X e Y. Si no existe,
	 * devolver -1. Por ejemplo si se ingresa 3 y 9, la función debe devolver 999.
	 */
	
	public static int maximoComunMultiloDe(int x, int y) {
	
		for (int i = 1000; i >=  0; i--) {
			if(i % x == 0 && i % y == 0){
				return i;
			}
		}
		return -1;
		
	}
}
