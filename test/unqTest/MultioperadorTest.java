package unqTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.Multioperador;

class MultioperadorTest {

	private Multioperador muntioperador;
	
	@BeforeEach
	void setUp() throws Exception {
		muntioperador = new Multioperador();
		muntioperador.addNumber(1);
		muntioperador.addNumber(5);
		muntioperador.addNumber(4);
		muntioperador.addNumber(3);
		muntioperador.addNumber(2);
	}

	@Test
	void testSuma() {
		int resultado = muntioperador.suma();
		assertEquals(15,resultado);
		
	}
	@Test
	void testResta() {
		int resultado = muntioperador.resta();
		assertEquals(-13,resultado);
		
	}
	@Test
	void testMltiplocarPor() {
		int resultado = muntioperador.multiplicarPor();
		assertEquals(120,resultado);
		
	}
		
}
