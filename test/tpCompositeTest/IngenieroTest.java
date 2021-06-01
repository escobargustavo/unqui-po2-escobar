package tpCompositeTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import model.Point;
import tpComposite.Ingeniero;
import tpComposite.Laja;

	
class IngenieroTest {

	private Ingeniero ingeniero;
	private Laja laja1;
	private Point origen;
	private Mapa mapa;
	@BeforeEach
	void setUp() throws Exception {
		ingeniero = new Ingeniero();
		origen = new Point();
		ingeniero.setLugarEnMapa(origen);
		laja1 = new Laja();
		ingeniero.addLaja(laja1);
		ingeniero.addLaja(laja1);
		ingeniero.addLaja(laja1);
		ingeniero.addLaja(laja1);
		ingeniero.addLaja(laja1);
		ingeniero.addLaja(laja1);
		mapa = mock(Mapa.class);
		ingeniero.setMapa(mapa);
	}

	@Test
	void testAddLaja() {
		ingeniero.addLaja(laja1);
		int cantLajas = ingeniero.getLajas().size();
		assertEquals(7,cantLajas);
	}
	@Test
	void testRemuveLaja() {
		ingeniero.remuveLaja(laja1);
		int cantLajas = ingeniero.getLajas().size();
		assertEquals(5,cantLajas);
	}
	
	@Test
	void testCaminar1() {
		when(mapa.hayLaja()).thenReturn(false);
		int cantLajasInicio = ingeniero.getLajas().size();
		ingeniero.caminar(1, 1);
		int cantLajasFin = ingeniero.getLajas().size();
		assertEquals(cantLajasFin,cantLajasInicio-2);
	}
	
	@Test
	void testCaminar2() {
		when(mapa.hayLaja()).thenReturn(false);
		ingeniero.caminar(5, 1);
		int cantLajasFin = ingeniero.getLajas().size();
		assertEquals(cantLajasFin,0);
	}

	@Test
	void testCaminar3() {
		when(mapa.hayLaja()).thenReturn(true);
		ingeniero.caminar(5, 1);
		int cantLajasFin = ingeniero.getLajas().size();
		assertEquals(cantLajasFin,6);
	}

}
