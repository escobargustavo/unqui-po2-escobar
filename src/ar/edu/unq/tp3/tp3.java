package ar.edu.unq.tp3;

import java.util.ArrayList;

public class tp3 {

	public static void main(String[] args) {

	}

	/**
	 * Dise�e e implemente una funci�n Java que reciba un arreglo de n�meros enteros
	 * y devuelva el n�mero que tiene la mayor cantidad de d�gitos pares. No puede
	 * utilizar String!!. Por lo cual, debe razonar c�mo desarmar el n�mero
	 * utilizando los operadores de los n�meros enteros (div y mod).
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
	 * Realice una funci�n que reciba dos valores X e Y, y devuelva el n�mero m�s
	 * alto entre 0 y 1000, que sea m�ltiplo simult�neamente de X e Y. Si no existe,
	 * devolver -1. Por ejemplo si se ingresa 3 y 9, la funci�n debe devolver 999.
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
