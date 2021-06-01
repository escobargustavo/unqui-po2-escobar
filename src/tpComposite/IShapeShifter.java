package tpComposite;

import java.util.List;

public interface IShapeShifter{
	
	public void imprimir();
	
	/*Este método recibe un IShapeShifter y 
	retorna un nuevo IShapeShifter que es el resultado de componer al receptor con 
	el que es enviado como parámetro*/
	public IShapeShifter compose(IShapeShifter iss);
	
	/*Retorna un numero que representa la profundidad máxima alcanzada en composiciones 
	que contiene. Continuando con las figuras de ejemplo, las siguienes expresiones deben ser validas.*/
	public int deepest();
	
	/*Achata un IShapeShifter. Si el IShapeShifter posee una prfundidad maxima >= 1, 
	entonces retorna un IShapeShifter de profundidad maxima 1 con todos los IShapeShifter de 
	profundidad 0 contenidos. En cualquier otro caso, retorna el mismo IShapeShifter. Siguiendo los ejemplos
	Importante: No es necesario establecer un orden particular de los IShapeShifter en los resultantes*/
	public IShapeShifter flat();
	
	/*Retorna una lista de enteros con los valores incluidos en el IShapeShifter. Siguiendo el ejemplo, 
	          a.values retorna una lista con el entero 1.
	          d.values retorna una lista con los enteros 3,1 y 2.
	Importante: No es necesario establecer un orden particular de los enteros en la lista.*/
	public List<Integer> values();

	
	
}
