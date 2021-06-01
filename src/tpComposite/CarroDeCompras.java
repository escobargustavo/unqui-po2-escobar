package tpComposite;

import java.util.ArrayList;

public class CarroDeCompras {

	private ArrayList<Product> products;

	public ArrayList<Product> getElements() {
		return products;
	}

	public void setElements(ArrayList<Product> products) {
		this.products = products;
	}
	
	public float total() {
		float total = (float) this.getElements().stream().mapToDouble(e -> e.getPrice()).sum();
			return total;
	}
	
	public int totalRounded() {
		
			return (int) this.total();
	}
}
