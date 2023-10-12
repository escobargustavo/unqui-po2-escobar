package ar.edu.unq.tpTemplateYAdapter.wiki;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkEnComunTest {

	WikipediaPage wpMock;
	LinkEnComun linkEnComun;
	@BeforeEach
	void setUp() throws Exception {
		wpMock = mock(WikipediaPage.class);
		linkEnComun = new LinkEnComun();
	}

	@Test
	void testEsSimilarT() {
		List<WikipediaPage> l = new ArrayList<>();
		l.add(wpMock);
		when(wpMock.getLinks())
			.thenReturn(l)
			.thenReturn(l);
		assertTrue(linkEnComun.esSimilar(wpMock,wpMock));
	}
	@Test
	void testEsSimilarF() {
		List<WikipediaPage> l = new ArrayList<>();
		List<WikipediaPage> m = new ArrayList<>();
		l.add(wpMock);
		when(wpMock.getLinks())
			.thenReturn(l)
			.thenReturn(m);
		assertFalse(linkEnComun.esSimilar(wpMock,wpMock));
	}

}
