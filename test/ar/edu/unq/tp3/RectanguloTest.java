package ar.edu.unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTest {

	Rectangulo r;
	
	@BeforeEach
	void setUp() throws Exception {
		r = new Rectangulo(new Point(), 3, 10);
		
	}

	@Test
	void testAreaR() {
		int area = r.area();
		assertEquals(area, 30);
	}

	@Test
	void testPerimetroR() {
		int pmtro = r.perimetro();
		assertEquals(pmtro, 26);
	}

	@Test
	void testEsHorizontal() {
		
		assertFalse(r.esHorizontal());;
	}
	
	@Test
	void testVertical() {
		
		assertTrue(r.esVertical());;
	}
}
	

