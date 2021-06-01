package tpComposite;

import java.util.ArrayList;
import java.util.List;

public class Hoja implements IShapeShifter{

	Integer valor;
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public IShapeShifter compose(IShapeShifter iss) {
		Nodo nodo = new Nodo();
		List<IShapeShifter> lss = new ArrayList<>();
		lss.add(this);
		lss.add(iss);
		nodo.ramas = lss;
		return nodo;
	}

	@Override
	public int deepest() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public List<Integer> values() {
		List<Integer> resultado = new ArrayList<Integer>();
		resultado.add(this.valor);
		return resultado;	
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.print("Hoja " +this.valor + " ");
	}


}
