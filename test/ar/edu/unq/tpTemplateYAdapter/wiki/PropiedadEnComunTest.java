package ar.edu.unq.tpTemplateYAdapter.wiki;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropiedadEnComunTest {

	PropiedadEnComun pec;
	WikipediaPage wpMock;
	@BeforeEach
	void setUp() throws Exception {
		pec = new PropiedadEnComun();
		wpMock = mock(WikipediaPage.class);
	}

	@Test
	void testEsSimilarT() {
		Map<String, WikipediaPage> map = new HashMap<String, WikipediaPage>();
		
		map.put("Bernal", wpMock);
		when(wpMock.getInfobox()).thenReturn(map);
		
		assertTrue(pec.esSimilar(wpMock, wpMock));
	}
	
	@Test
	void testEsSimilarF() {
		Map<String, WikipediaPage> map = new HashMap<String, WikipediaPage>();
		Map<String, WikipediaPage> map1 = new HashMap<String, WikipediaPage>();
		map.put("Bernal", wpMock);
		map1.put("Quilmes", wpMock);
		when(wpMock.getInfobox()).thenReturn(map)
								.thenReturn(map1);
		
		assertFalse(pec.esSimilar(wpMock, wpMock));
	}

}
