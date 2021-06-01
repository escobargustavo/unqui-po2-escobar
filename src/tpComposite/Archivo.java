package tpComposite;

import java.util.Date;

public class Archivo implements FileSystem{
	
	private String nombre;
	private int tamanho;
	private Date fecha;
	
	
	@Override
	public int totalSize() {
		
		return this.getTamanho();
	}
	@Override
	public void printStructure() {
		System.out.println(this.getNombre());
	}
	
	@Override
	public Archivo lastModified() {
		// TODO Auto-generated method stub
		return this;
	}
	
	@Override
	public Archivo oldestElement() {
		// TODO Auto-generated method stub
		return this;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date ultimaModificacion) {
		this.fecha = ultimaModificacion;
	}

	


}
