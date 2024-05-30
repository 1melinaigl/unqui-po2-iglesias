package ar.edu.unq.po2.tp10;

import java.time.LocalDate;

public class Archivo implements FileSystem {
	
	private String nombre;
	private int cantidadDeEspacio;
	private LocalDate fechaUltimaModificacion;
	
	
	
	public Archivo(String nombre, int cantidadDeEspacio, LocalDate fechaUltimaModificacion) {
		super();
		this.nombre = nombre;
		this.cantidadDeEspacio = cantidadDeEspacio;
		this.fechaUltimaModificacion = fechaUltimaModificacion;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getCantidadDeEspacio() {
		return cantidadDeEspacio;
	}



	public void setCantidadDeEspacio(int cantidadDeEspacio) {
		this.cantidadDeEspacio = cantidadDeEspacio;
	}



	public LocalDate getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}



	public void setFechaUltimaModificacion(LocalDate fechaUltimaModificacion) {
		this.fechaUltimaModificacion = fechaUltimaModificacion;
	}



	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return this.getCantidadDeEspacio();
	}



	@Override
	public void printStructure() {
		System.out.println(this.getNombre());
		
	}



	@Override
	public FileSystem lastModified() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public FileSystem oldestElement() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	}
	





