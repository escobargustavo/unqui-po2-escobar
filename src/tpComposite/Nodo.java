package tpComposite;

import java.util.ArrayList;
import java.util.List;




public class Nodo implements IShapeShifter{

	List<IShapeShifter> ramas;
	
	@Override
	public IShapeShifter compose(IShapeShifter iss) {
		List<IShapeShifter> ret = new ArrayList<>();
		ret.add(this);
		ret.add(iss);
		Nodo n = new Nodo();
		n.ramas = ret;
		return n;
	}

	@Override
	public int deepest() {
		
		Integer result = 0;
		for(int i = 0;i<this.ramas.size();i++) {
			result = Math.max(result,this.ramas.get(i).deepest());
		}
		return  1 + result ;
	}

	@Override
	public IShapeShifter flat() {
		List<IShapeShifter> ret = new ArrayList<>();
		for(int i = 0;i<this.ramas.size();i++) {
			ret.add(0, this.ramas.get(i).flat());
		}
		
		Nodo n = new Nodo();
		n.ramas = ret;
		return n;
	}

	@Override
	public List<Integer> values() {
		List<Integer> ret = new ArrayList<>();
		for(int i = 0;i<this.ramas.size();i++) {
			ret.addAll(this.ramas.get(i).values());
		}

		return ret;
	}

	public Nodo() {
		this.ramas = new ArrayList<IShapeShifter> ();
	}

	
	@Override
	public void imprimir() {
		for(int i = 0;i<this.ramas.size();i++) {
			System.out.print("nodo " + i + ", ");
			this.ramas.get(i).imprimir();
			
		}
	}

	

}
