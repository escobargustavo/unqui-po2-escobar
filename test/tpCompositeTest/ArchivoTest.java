package tpCompositeTest;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpComposite.Archivo;

class ArchivoTest {

	private Archivo archivo;
	private Archivo archivo1;
	Date dia;
	Date dia2;
	@BeforeEach
	void setUp() throws Exception {
		dia = new Date(2020, 5, 27);
		archivo = new Archivo();
		archivo.setNombre("Entiendo apenas");
		archivo.setTamanho(1000);
		archivo.setFecha(dia);
		
		dia2 = new Date(2021, 5, 27);
		archivo1 = new Archivo();
		archivo1.setNombre("Entiendo nada");
		archivo1.setTamanho(1000);
		archivo1.setFecha(dia2);
	}

	@Test
	void testTotalSize() {
		int total = archivo.totalSize();
		assertEquals(total,1000);
	}

	
	@Test
	void testPrintStructure() {
		archivo.printStructure();
	}
	
	

}
