package ar.edu.unq.tpTDD;

import java.util.HashMap;

public class PokerStatus {

	public String verificar(String c1, String c2, String c3, String c4, String c5) {

		String[] cartas = { c1, c2, c3, c4, c5 };

		if (esPoker(cartas)) {return "Poquer";}
		if(esColor(cartas)) {return "Color";}
		if (esTrio(cartas)) {return "Trio";}
		
		return "Nada";
	}

	public boolean esColor(String[] cartas) {
		char referencia = cartas[0].charAt(cartas[0].length()-1);
		for (String carta : cartas) {
			if(carta.charAt(carta.length()-1) != referencia) {
				return false;
			}
		}
		return true;
	}

	public boolean esPoker(String[] cartas) {
		HashMap<String, Integer> valorCartaCant = new HashMap<String, Integer>();
		for (String carta : cartas) {

			String valor = carta.substring(0, carta.length() - 1);
			valorCartaCant.put(valor, valorCartaCant.getOrDefault(valor, 0) + 1);
		}
		return valorCartaCant.values().stream().anyMatch(vc -> vc == 4);
	}
	
	public boolean esTrio(String[] cartas) {
		HashMap<String, Integer> valorCartaCant = new HashMap<String, Integer>();
		for (String carta : cartas) {

			String valor = carta.substring(0, carta.length() - 1);
			valorCartaCant.put(valor, valorCartaCant.getOrDefault(valor, 0) + 1);
		}
		return valorCartaCant.values().stream().anyMatch(vc -> vc == 3);
	}
}
