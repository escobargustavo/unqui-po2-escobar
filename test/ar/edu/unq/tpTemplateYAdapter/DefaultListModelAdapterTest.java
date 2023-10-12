package ar.edu.unq.tpTemplateYAdapter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DefaultListModelAdapterTest {

	DefaultListModelAdapter dlmA;	
	ListaDePalabrasOrdenadas lpo;
	@BeforeEach
	void setUp() throws Exception {
		lpo = new ListaDePalabrasOrdenadas();
		lpo.agregarPalabra("zorro");
		lpo.agregarPalabra("casa");
		lpo.agregarPalabra("ave");
		lpo.agregarPalabra("perro");
		
		
		dlmA = new DefaultListModelAdapter();
	}

	@Test
	void testAdaptarA() {
		assertEquals(dlmA.adaptarA(lpo).getSize(),4);
	}

}
