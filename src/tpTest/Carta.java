package tpTest;

public class Carta {
	private int valorN;
	private String valorL;
	private String palo;
	
	public int valorEnNumero() {
		int resultado = 0;
		if(this.getValorL() == null) {
			resultado = this.getValorN();
		}
		else {
			String valor = this.getValorL();
			
			switch (valor) 
	        {
	            case "A" :  resultado = 1;
	                     break;
	            case "J":  resultado = 11;
	                     break;
	            case "Q" : resultado = 12;
	                     break;
	            case "K" :  resultado = 13;
	                     break;	        }
		}
		
		return resultado;
	}
	
	public int getValorN() {
		return valorN;
	}
	public void setValorN(int valorN) {
		this.valorN = valorN;
	}
	public String getValorL() {
		return valorL;
	}
	public void setValorL(String valorL) {
		this.valorL = valorL;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	

}
