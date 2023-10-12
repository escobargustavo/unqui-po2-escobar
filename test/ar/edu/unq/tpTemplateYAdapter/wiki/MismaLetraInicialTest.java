package ar.edu.unq.tpTemplateYAdapter.wiki;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
class MismaLetraInicialTest {

	MismaLetraInicial mismaLetra;
	WikipediaPage wpMock;
	@BeforeEach
	void setUp() throws Exception {
		wpMock = mock(WikipediaPage.class);
		mismaLetra = new MismaLetraInicial();
	}

	@Test
	void testEsSimilarT() {
		when(wpMock.getTitle()).thenReturn("Bernal")
							.thenReturn("Buenos Aires");
		assertTrue(mismaLetra.esSimilar(wpMock,wpMock));
	}

	@Test
	void testEsSimilarF() {
		when(wpMock.getTitle()).thenReturn("Bernal")
							.thenReturn("Quilmes");
		assertFalse(mismaLetra.esSimilar(wpMock,wpMock));
	}
}
