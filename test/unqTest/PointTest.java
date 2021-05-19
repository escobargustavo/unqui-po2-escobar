package unqTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Point;

class PointTest {
	private Point point;
	private Point point2;
	
	@BeforeEach
	void setUp() throws Exception {
		point = new Point();
		point2 = new Point(1, 2);
	}

	@Test
	void testMoverPoint() {
		point.moverPoint(3);
		
		assertEquals(point.getX(),3);
		assertEquals(point.getY(),3);
		
	}
	@Test
	void testSumarPoint() {
		Point res = point.sumarPoint(point2);
		
		assertEquals(res.getX(),1);
		assertEquals(res.getY(),2);
		
	}
}
