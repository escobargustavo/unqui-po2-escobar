package tpCompositeTest;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpComposite.Archivo;
import tpComposite.Directorio;

class DirectorioTest {

	private Directorio directorio;

	private Directorio directorio2;
	private Archivo archivo;
	private Date dia;
	private Date diaCreacion;
	private Archivo archivo1;
	Date dia2;
	
	@BeforeEach
	void setUp() throws Exception {
		dia = new Date(2021, 5, 27);
		archivo = new Archivo();
		archivo.setNombre("hoja1");
		archivo.setTamanho(100);
		archivo.setFecha(dia);
		
		dia2 = new Date(2021, 5, 27);
		archivo1 = new Archivo();
		archivo1.setNombre("hoja2");
		archivo1.setTamanho(50);
		archivo1.setFecha(dia2);
		
		diaCreacion = new Date(2020, 5, 27);
		directorio = new Directorio("nodo0", diaCreacion);
		directorio2 = new Directorio("nodo1", dia);
		directorio2.addArchivo(archivo1);
		directorio.addArchivo(archivo);
		directorio.addArchivo(directorio2);
		
	}

	@Test
	void testTotalSize() {
		int total = directorio.totalSize();
		assertEquals(150,total);
		
	}
	@Test
	void testPrintStructure() {
		directorio.printStructure();
		
	}

}
