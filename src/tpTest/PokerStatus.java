package tpTest;



import java.util.ArrayList;


public class PokerStatus {



	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		String resultado = "Nada";
		if(esPoker(carta1, carta2, carta3, carta4, carta5)) {
			return "Poquer";
		}
		if(hayColor(carta1, carta2, carta3, carta4, carta5)) {
			return "Color";
			
		}
		if(hayTrio(carta1, carta2, carta3, carta4, carta5)) {
			return "Trio";
			
		}
		return resultado;
	}

	
	public boolean hayColor(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		String color1 = carta1.substring(carta1.length() - 1);
		String color2 = carta2.substring(carta2.length() - 1);
		String color3 = carta3.substring(carta3.length() - 1);
		String color4 = carta4.substring(carta4.length() - 1);
		String color5 = carta5.substring(carta5.length() - 1);
		ArrayList<String>  cartas = new ArrayList<String> ();
        cartas.add(color1);
        cartas.add(color2);
        cartas.add(color3);
        cartas.add(color4);
        cartas.add(color5);
		
		return cartas.stream().filter(color  -> color.equals(color1)).count() == 5;
	}
	public boolean esPoker(String carta1, String carta2, String carta3, String carta4, String carta5) {
	 	//Nos quedamos con el valor de las cartas
		String c1 = carta1.replaceFirst(".$","");
        String c2 = carta2.replaceFirst(".$","");
        String c3 = carta3.replaceFirst(".$","");
        String c4 = carta4.replaceFirst(".$","");
        String c5 = carta5.replaceFirst(".$","");
        
        ArrayList<String>  cartas = new ArrayList<String> ();
        cartas.add(c1);
        cartas.add(c2);
        cartas.add(c3);
        cartas.add(c4);
        cartas.add(c5);
        long longi =  0;
        
        for(int i=0 ; i< cartas.size(); i++) {
        	String valor = cartas.get(i);
            longi = cartas.stream().filter(carta -> carta.equals(valor)).count();
            if(longi == 4) {
            	break;
            }
        }
        return longi == 4;
	}


	public boolean hayTrio(String carta1, String carta2, String carta3, String carta4, String carta5) {
	 	//Nos quedamos con el valor de las cartas
		String c1 = carta1.replaceFirst(".$","");
        String c2 = carta2.replaceFirst(".$","");
        String c3 = carta3.replaceFirst(".$","");
        String c4 = carta4.replaceFirst(".$","");
        String c5 = carta5.replaceFirst(".$","");
        
        ArrayList<String>  cartas = new ArrayList<String> ();
        cartas.add(c1);
        cartas.add(c2);
        cartas.add(c3);
        cartas.add(c4);
        cartas.add(c5);
        long longi =  0;
        
        for(int i=0 ; i< cartas.size(); i++) {
        	String valor = cartas.get(i);
            longi = cartas.stream().filter(carta -> carta.equals(valor)).count();
            if(longi == 3) {
            	break;
            }
        }
        return longi == 3;
	}
}
