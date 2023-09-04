package ar.edu.unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {

	Point a, b, c;
	
	
	@BeforeEach
	void setUp() throws Exception {
		a = new Point();
		b = new Point(1, 1);
		c = new Point(2, 2);
		
	}

	// Test de constructor con valores en 0
	@Test
	void testPointConCeros() {
		
		assertEquals(a.getX(), 0);
		assertEquals(a.getY(), 0);
	}

	// Test de constructor con valores por parametros
	@Test
	void testPoint() {

		assertEquals(b.getX(), 1);
		assertEquals(b.getY(), 1);
	}

	// Test de mover un punto a otra posicion
	@Test
	void testMoverPunto() {
		a.moverPunto(new Point(2, 3));
		assertEquals(a.getX(), 2);
		assertEquals(a.getY(), 3);
	}

	// Test de mover un punto a otra posicion
	@Test
	void testSumarPuntos() {
		Point d = b.sumarPuntos(c);
		assertEquals(d.getX(), 3);
		assertEquals(d.getY(), 3);
	}
}
