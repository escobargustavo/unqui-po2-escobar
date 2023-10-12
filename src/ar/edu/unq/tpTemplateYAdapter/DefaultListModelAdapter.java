package ar.edu.unq.tpTemplateYAdapter;



import javax.swing.DefaultListModel;

public class DefaultListModelAdapter {

	private ListaDePalabrasOrdenadas adaptar;


	public DefaultListModel<String> adaptarA(ListaDePalabrasOrdenadas adaptar) {
		DefaultListModel<String> adaptado = new DefaultListModel<String>();
		for (int i = 0; i < adaptar.cantidadDePalabras(); i++) {
			adaptado.add(i, adaptar.getPalabraDePosicion(i));
		}
		return adaptado;
	}
	
	
}
