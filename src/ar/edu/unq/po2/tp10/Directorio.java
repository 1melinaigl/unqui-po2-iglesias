package ar.edu.unq.po2.tp10;

import java.time.LocalDate;
import java.util.List;

public class Directorio implements FileSystem {
	
	private String nombre;
	private LocalDate fechaCreacion;
	private List<FileSystem> archivos; // lo que seria contenidos
	
	
	

	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public List<FileSystem> getArchivos() {
		return archivos;
	}
	public void setArchivos(List<FileSystem> archivos) {
		this.archivos = archivos;
	}
	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		
		return this.archivos.stream().mapToInt(a -> a.totalSize()).sum();
	}
	@Override
	public void printStructure() {
		System.out.println(this.getNombre());
		
	}
	@Override
	public FileSystem lastModified() {
		
	@Override
	public FileSystem oldestElement() {
		
		
	}
	
	

}


