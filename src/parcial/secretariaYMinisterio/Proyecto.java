package parcial.secretariaYMinisterio;

import java.time.LocalDate;
import java.util.List;

public class Proyecto extends Actividad {

	public Proyecto(String nombre, Empleado lider, LocalDate fechaDeInicio, int duracion, List<Empleado> empleados) {
		super(nombre, lider, fechaDeInicio, duracion, empleados);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double inversionTotal() {
		
		double sumaDeSueldoDeEmpleados = this.getEmpleados().stream().mapToDouble(e -> e.sueldoDiario()).sum() * duracion;
		double sueldoLiderTotal = lider.sueldoDiario() * duracion;
	    double plusLiderazgo = sueldoLiderTotal * 0.30;
	    double sueldoLiderConPlus = sueldoLiderTotal + plusLiderazgo;
	    return totalSueldosEmpleados + sueldoLiderConPlus;
		
    	
	}

}
