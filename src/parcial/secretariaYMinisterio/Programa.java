package parcial.secretariaYMinisterio;

import java.time.LocalDate;
import java.util.List;

public class Programa extends Actividad {
	private List<Actividad> actividades;
	private double costoGestion;

	public Programa(String nombre, Empleado lider, LocalDate fechaDeInicio, int duracion, List<Empleado> empleados, List<Actividad> actividades) {
		super(nombre, lider, fechaDeInicio, duracion, empleados);
		
		this.actividades = actividades;
	}

	public List<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}

	public double getCostoGestion() {
		return costoGestion;
	}

	public void setCostoGestion(double costoGestion) {
		this.costoGestion = costoGestion;
	}

	public LocalDate getFechaDeInicio() {
		return this.actividades.stream().min(null)
	}
	
	@Override
	public double inversionTotal() {
		
		return costoGestion + this.actividades.stream().mapToDouble(a -> a.inversionTotal()).sum();
	}

}
