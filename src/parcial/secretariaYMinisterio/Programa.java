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

	@Override
	public double inversionTotal() {
		
		return costoGestion + this.actividades.stream().mapToDouble(a -> a.inversionTotal()).sum();
	}

}
