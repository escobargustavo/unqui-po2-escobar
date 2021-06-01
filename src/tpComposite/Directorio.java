package tpComposite;


import java.sql.Date;
import java.util.ArrayList;

public class Directorio implements FileSystem{

	private String nombre;
	private ArrayList<FileSystem> directorios;
	private Date fecha;

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int totalSize() {
		int total = 0;
		for(int i = 0; i < this.getDirectorios().size();i++) {
			total += this.getDirectorios().get(i).totalSize();
		}
			
		return total;
	}

	public void addArchivo(FileSystem fileSystem) {
		this.directorios.add(fileSystem);
		
	}
	public Directorio(String nombreDirectorio, Date fechaCreacion) {
		this.nombre = nombreDirectorio;
		this.directorios = new ArrayList<FileSystem>();
		this.fecha = fechaCreacion;
	}


	public ArrayList<FileSystem> getDirectorios() {
		return directorios;
	}

	public void setDirectorios(ArrayList<FileSystem> directorios) {
		this.directorios = directorios;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fechaCreacion) {
		this.fecha = fechaCreacion;
	}

	/**
	* Imprime en consola el contenido indicando el nombre del elemento
	* * e indentandolo con tantos espacios como profundidad en la estructura.
	*/
	@Override
	public void printStructure() {
		
		
		System.out.print(this.getNombre()+" ");
		
		this.getDirectorios().forEach(FileSystem::printStructure);
	
		
		
	}

	@Override
	public FileSystem lastModified() {
		
		FileSystem retorno = null;
		
		return retorno;
	}

	@Override
	public Archivo oldestElement() {
		// TODO Auto-generated method stub
		return null;
	}




}
