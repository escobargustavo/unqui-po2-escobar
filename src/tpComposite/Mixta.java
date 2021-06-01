package tpComposite;

import java.util.ArrayList;

public class Mixta implements IPorcionDeTierra{
		/*1.¿Que impacto genera en su diseño el hecho de compartir instancias de parcelas entre composiciones?
		 *  Es decir, que la misma instancia se encuentre en más de una composición.
		 * 
		 * Fue dificil de comprender al principio, mas que nada al momento de tener que dividir en el caso base y el recursivo,
		 * una vez leido material bibliografico fue mas sensillo a la hora de realizarlo.
		 * 
		 * 
		 * 3. Describa las alternativas que puede utilizar para calcular la ganancia anual. Relacione las alternativas.
		 * Para el caso que sea una instacia de Pura solo hay que diferencial el tipo, ya sea una plantacion de Soja o una de trigo
		 * Mientras que para el caso de Mixta, hay que realizar este calculo para cada uno de sus componentes 
		 * 
		 * 
		 * 5.Sobre su implementación, indique los roles que desempeñan cada una de las clases diseñadas
		 *  en relación al patrón Composite.
		 *  
		 *  La interfaz IPorcionDeTierra seria el Component
		 *  La clase Pura seria el Leaf
		 *  Mientras que la clase Mixta seria el Composite
		 *  
		 * */
	
	private ArrayList<IPorcionDeTierra> porciones;
	
	public Mixta() {
		this.porciones = new ArrayList<IPorcionDeTierra>();
	}

	@Override
	public float gananciaAnual() {
		float ganancia = 0;
		for(int i =0; i < this.porciones.size();i++) {
			ganancia += this.porciones.get(i).gananciaAnual()/4;
		}
		return ganancia;
	}

	public ArrayList<IPorcionDeTierra> getPorciones() {
		return porciones;
	}

	public void setPorciones(ArrayList<IPorcionDeTierra> porciones) {
		this.porciones = porciones;
	}

	public void addPorcion(IPorcionDeTierra porcion) {
		this.porciones.add(porcion);
	}

	public void remuve(IPorcionDeTierra porcion) {
		this.porciones.remove(porcion);
		
	}


}
