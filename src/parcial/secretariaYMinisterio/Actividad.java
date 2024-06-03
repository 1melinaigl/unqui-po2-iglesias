package parcial.secretariaYMinisterio;

import java.time.LocalDate;
import java.util.List;

public abstract class Actividad {
	protected String nombre;
	protected Empleado lider;
	protected LocalDate fechaDeInicio;
	protected int duracion;
	protected List<Empleado> empleados;
	
	
	public Actividad(String nombre, Empleado lider, LocalDate fechaDeInicio, int duracion, List<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.lider = lider;
		this.fechaDeInicio = fechaDeInicio;
		this.duracion = duracion;
		this.empleados = empleados;
	} 
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Empleado getLider() {
		return lider;
	}


	public void setLider(Empleado lider) {
		this.lider = lider;
	}


	public LocalDate getFechaDeInicio() {
		return fechaDeInicio;
	}


	public void setFechaDeInicio(LocalDate fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public List<Empleado> getEmpleados() {
		return empleados;
	}


	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public abstract double inversionTotal();
	
}
	
	
	
	


