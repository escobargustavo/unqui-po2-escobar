package ar.edu.unq.tpTDD.pokerConJugadas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import ar.edu.unq.tpTDD.Carta;

public class Poquer implements Jugada {

	private Carta[] cartas;
	
	public Poquer(Carta[] cartas) {
		if(!esPoquer(cartas)) { throw new IllegalAccessError("no es un Poquer");}
		this.cartas = cartas;
	}

	private boolean esPoquer(Carta[] cartas2) {
		return Arrays.stream(cartas).
				collect(Collectors.groupingBy(Carta :: getValor,Collectors.counting()))
				.values()
				.stream()
				.anyMatch(contador -> contador == 4)
				;
	}

	public Carta cartaDeJugada() {
		return Arrays.stream(this.cartas).reduce((carta1, carta2) -> carta1.esSuperiorA(carta2) ? carta1 :carta2)
				.orElse(null);
	}
	@Override
	public int comparar(Jugada unaJugada) {
		if(unaJugada instanceof Color || unaJugada instanceof Trio) return 1;
		if(unaJugada instanceof Poquer) {
			Jugada juagada = (Poquer) unaJugada;
		//	if(this.cartaDeJugada().esSuperiorA(juagada.cartaDeJugada()));
		}
		
		return 0;
	}

}
