package ar.edu.unq.supermercado;

public class ProductoPrimeraNecesidad extends Producto{

	//precondicion: se asume que el valor de descuento nunca es cero
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esCuidado,int descuento) {
		super(nombre, (precio - (precio * descuento /100)), esCuidado);
	}

	
	

}
