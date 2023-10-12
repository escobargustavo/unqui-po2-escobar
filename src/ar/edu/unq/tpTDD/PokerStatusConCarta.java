package ar.edu.unq.tpTDD;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PokerStatusConCarta {

	public boolean esPoquer(Carta[] cartas) {
		// TODO Auto-generated method stub
		return Arrays.stream(cartas).
				collect(Collectors.groupingBy(Carta :: getValor,Collectors.counting()))
				.values()
				.stream()
				.anyMatch(contador -> contador == 4)
				;
	}

	public boolean esTrio(Carta[] cartas) {
		return Arrays.stream(cartas).
				collect(Collectors.groupingBy(Carta :: getValor,Collectors.counting()))
				.values()
				.stream()
				.anyMatch(contador -> contador == 3)
				;
	}

	public boolean esColor(Carta[] cartas) {
		return Arrays.stream(cartas).
				collect(Collectors.groupingBy(Carta :: getPalo,Collectors.counting()))
				.values()
				.stream()
				.anyMatch(contador -> contador == 5)
				;
	}

	public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		Carta[] cartas = {c1,c2,c3,c4,c5};
		if(this.esPoquer(cartas)) return "Poquer";
		if(this.esColor(cartas)) return "Color";
		if(this.esTrio(cartas)) return "Trio";
		return "Nada";
	}

}
