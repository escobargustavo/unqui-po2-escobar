package ar.edu.unq.tpTemplateYAdapter;

import java.awt.LayoutManager;
import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class Ventana extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ventana(DefaultListModel<String> listModel){
		this.setLayout((LayoutManager) new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		this.setBounds(new Rectangle(180,180));
		this.setVisible(true);
		JLabel label=new JLabel("Lista de palabras");
		label.setBounds(new Rectangle(40,40));
		this.add(label);
		
		JList<String> lista=new JList<String>(listModel);
		lista.setBounds(new Rectangle(110,160));
		this.add(lista);
	}

	public static void main(String[] args) {
		/*
		 * a continuacion se agregan las palabras a la ListaDePalabrasOrdenadas
		 * y se adapta para que la clase ventana la pueda recibir como parametro
		 * y asi poder operar con ella
		 */
		ListaDePalabrasOrdenadas lpo = new ListaDePalabrasOrdenadas();
		lpo.agregarPalabra("casa");
		lpo.agregarPalabra("arbol");
		lpo.agregarPalabra("perro");
		lpo.agregarPalabra("telefono");
		lpo.agregarPalabra("brazo");
		DefaultListModelAdapter dlmA = new DefaultListModelAdapter();
		new Ventana(dlmA.adaptarA(lpo));
		/*esta línea puede modificarse luego de resolver el ejercicio.*/
	}
}
