package tpTest;

import java.util.ArrayList;

public class PokerStatusMejorada {

	public boolean hayPoker(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		ArrayList<Carta> cartas = new ArrayList<Carta>() ;
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		long largo = 0;
		
		for(int i = 0; i < cartas.size(); i++) {
			Carta cartaI = cartas.get(i);
			largo = cartas.stream().filter(carta -> cartaI.tieneMismoValor(carta)).count();
			if(largo == 4) {
				return true;
			}
		}
		
		return false;
	}

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		String resultado = "Nada";
		if(hayPoker(carta1,carta2,carta3,carta4,carta5)) {
			return "Poker";
		}
		if(hayColor(carta1,carta2,carta3,carta4,carta5)) {
			return "Color";
		}
		if(hayTrio(carta1,carta2,carta3,carta4,carta5)) {
			return "Trio";
		}
		return resultado;
	}

	public boolean hayColor(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		ArrayList<Carta> cartas = new ArrayList<Carta>() ;
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		
		return cartas.stream().filter(carta -> carta.sonDelMismoPalo(carta1)).count() == 5;
		
	}

	public boolean hayTrio(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {

		ArrayList<Carta> cartas = new ArrayList<Carta>() ;
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		long largo = 0;
		
		for(int i = 0; i < cartas.size(); i++) {
			Carta cartaI = cartas.get(i);
			largo = cartas.stream().filter(carta -> cartaI.tieneMismoValor(carta)).count();
			if(largo == 3) {
				return true;
			}
		}
		
		return false; 
	}

}
