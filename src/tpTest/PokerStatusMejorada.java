package tpTest;

import java.util.ArrayList;

public class PokerStatusMejorada {

	public boolean hayPoker(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		int c1 = carta1.valorEnNumero();
		int c2 = carta2.valorEnNumero();
		int c3 = carta3.valorEnNumero();
		int c4 = carta4.valorEnNumero();
		int c5 = carta5.valorEnNumero();
		ArrayList<Integer> cartas = new ArrayList<Integer>() ;
		cartas.add(c1);
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		cartas.add(c5);
		long largo = 0;
		
		for(int i = 0; i < cartas.size(); i++) {
			int valor = cartas.get(i);
			largo = cartas.stream().filter(carta ->carta == valor ).count();
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
		return resultado;
	}

	public boolean hayColor(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		ArrayList<String> cartas = new ArrayList<String>() ;
		cartas.add(carta1.getPalo());
		cartas.add(carta2.getPalo());
		cartas.add(carta3.getPalo());
		cartas.add(carta4.getPalo());
		cartas.add(carta5.getPalo());
		
		boolean result = cartas.stream().filter(palo -> palo.equalsIgnoreCase(carta1.getPalo())).count() == 5;
		return result;
	}

	public boolean hayTrio(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		int c1 = carta1.valorEnNumero();
		int c2 = carta2.valorEnNumero();
		int c3 = carta3.valorEnNumero();
		int c4 = carta4.valorEnNumero();
		int c5 = carta5.valorEnNumero();
		ArrayList<Integer> cartas = new ArrayList<Integer>() ;
		cartas.add(c1);
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		cartas.add(c5);
		long largo = 0;
		
		for(int i = 0; i < cartas.size(); i++) {
			int valor = cartas.get(i);
			largo = cartas.stream().filter(carta ->carta == valor ).count();
			if(largo == 3) {
				return true;
			}
		}
		
		return false;
	}

}
