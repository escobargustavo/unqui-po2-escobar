package ar.edu.unq.tpTDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	PokerStatus ps;
	
	
	@BeforeEach
	void setUp() throws Exception {
		//SetUp
		ps = new PokerStatus();
	}

	@Test
	void testEsPoker() {
		String[] cartas = {"AP","AC","AD","AT","2P"};
		assertTrue(ps.esPoker(cartas ));
	}
	
	@Test
	void testEsColor() {
		String[] cartas = {"AP","2P","9P","JP","QP"};
		assertTrue(ps.esColor(cartas ));
	}
	
	@Test
	void testEsTrio() {
		String[] cartas = {"AP","AC","AT","JT","QT"};
		assertTrue(ps.esTrio(cartas ));
	}
	
	
//	@Test
//	void testVerificarPokerT() {
//		//exercise
//		String verificar = ps.verificar("AP","AC","AD","AT","2P");
//		//Verify
//		assertEquals(verificar,"Poquer");
//	}
//
//	@Test
//	void testVerificarNada() {
//		//exercise
//		String verificar = ps.verificar("7P","5D","AD","10T","2P");
//		//Verify
//		assertEquals(verificar,"Nada");
//	}
//	
//	@Test
//	void testVerificarColor() {
//		//exercise
//		String verificar =ps.verificar("AP","5P","7P","JP","2P");
//		//Verify
//		assertEquals(verificar,"Color");
//	}
}
