package ar.edu.unq.tpTDD;

/*
 * De una carta se puede conocer el valor y el palo. Por ejemplo, 4C ahora se
representaría con una instancia de Carta. También debe ser posible saber
 si el valor de una carta es superior a otra, y
si poseen el mismo palo.

 */
public class Carta {

	private String valor;
	private String palo;
	
	public Carta(String valor,String palo) {
		this.palo = palo;
		this.valor = valor;
	}

	public boolean esSuperiorA(Carta otraC) {
		return this.obtenerValorNumerico() > otraC.obtenerValorNumerico();
	}

	private int obtenerValorNumerico() {
		switch (valor) {
		case "A":
			return 14;
		case "K":
			return 13;
		case "Q":
			return 12;
		case "J":
			return 11;

		default:
			return Integer.parseInt(valor);
		}
	}

	public boolean sonDelMismoPalo(Carta otraC) {
		return this.palo.equals(otraC.palo);
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
	
}
