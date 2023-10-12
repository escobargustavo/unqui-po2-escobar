package ar.edu.unq.enumerativosYstreams.secretariaDeportes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecretariaDeDeportesTest {

	SecretariaDeDeportes sd;
	ActividadSemanal a1,a2,a3,a4,a5,a6,a7,a8,a9;

	@BeforeEach
	void setUp() throws Exception {
		a1 = new ActividadSemanal(DiaDeLaSemana.LUNES, Deporte.FUTBOL,19,2);
		a2 = new ActividadSemanal(DiaDeLaSemana.MARTES, Deporte.BASKET,14,3);
		a3 = new ActividadSemanal(DiaDeLaSemana.VIERNES, Deporte.JABALINA,12,5);
		a4 = new ActividadSemanal(DiaDeLaSemana.SABADO, Deporte.RUNNING,10,3);
		a5 = new ActividadSemanal(DiaDeLaSemana.DOMINGO, Deporte.TENNIS,12,5);
		a6 = new ActividadSemanal(DiaDeLaSemana.LUNES, Deporte.FUTBOL,16,2);
		a7 = new ActividadSemanal(DiaDeLaSemana.MARTES, Deporte.TENNIS,16,2);
		a8 = new ActividadSemanal(DiaDeLaSemana.LUNES, Deporte.JABALINA,16,2);
		a9 = new ActividadSemanal(DiaDeLaSemana.MIERCOLES, Deporte.FUTBOL,16,2);
		
		List<ActividadSemanal> lista = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9);
		
		sd = new SecretariaDeDeportes(lista);
		
	}

	@Test
	void testTodasFutbol() {
		int comparar = sd.todasFutbol().size();
		assertEquals(comparar,3);
	}

	@Test
	void testActividadesComplejidad() {
		int comparar = sd.actividadesComplejidad(2).size();
		assertEquals(comparar,4);
	}
	
	@Test
	void testCantTotalHoras() {
		int comparar = sd.cantTotalHoras();
		assertEquals(comparar,26);
	}
	
	@Test
	void testActividadMenorCosto() {
		ActividadSemanal ac = sd.ActividadMenorCosto(Deporte.FUTBOL);
		
		assertEquals(ac.costo(),1400);
	}

	@Test
	void testEncontrarActividadesMasEconomicas() {
		sd.printActividades();
		Map<Deporte, ActividadSemanal> map = sd.encontrarActividadesMasEconomicas();
		
		assertEquals(map.size(),5);
	}
	
//	@Test
//	void testAgregarActividad() {
//        sd.agregarActividad(a1);
//        assertEquals(sd.getCantActividades(),10);
//        
//    }
}
