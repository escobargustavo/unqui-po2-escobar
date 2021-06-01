package tpCompositeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaballeroTest {

	private Caballero caballero;
	
	@BeforeEach
	void setUp() throws Exception {
		caballero = new Caballero();
	}

	@Test
	void testCaminar() {
		caballero.caminar(3, 2);
		
	}

}
