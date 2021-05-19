package unqTest;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Point;
import model.giu.Rectangulo;
import model.stack.Altura;
import model.stack.Base;

class RectanguloTest {
	
	Point puntoOrigen;
	Point puntoLargo;
	Point puntoOrigenA;
	Point puntoAlto;
	Base base;
	Altura altura;
	Rectangulo rectangulo;
	
	@BeforeEach
	void setUp() throws Exception {
		puntoOrigen = new Point(0, 0);
		puntoLargo = new Point(3, 0);
		puntoOrigenA = new Point(0, 1);
		puntoAlto = new Point(3, 1);
		base = new Base();
		base.setOrigen(puntoOrigen);
		base.setLargo(puntoLargo);
		altura = new Altura();
		altura.setOrigen(puntoOrigenA);
		altura.setAltura(puntoAlto);
		rectangulo = new Rectangulo(base, altura);
	}

	@Test
	void testArea() {
		double area = rectangulo.area();
		assertEquals(9,area);
	}

	@Test
	void testperimetro() {
		double perimetro = rectangulo.perimetro();
		assertEquals(12,perimetro);
	}
}
