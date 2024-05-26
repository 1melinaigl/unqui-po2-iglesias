package ar.edu.unq.po2.tp9;

public class Pasante extends Empleado {

	private int horasTrabajadas;
	
	
	
	
	public Pasante(int horasTrabajadas) {
		super();
		this.horasTrabajadas = horasTrabajadas;
	}


	@Override
	double calcularSueldoBruto() {
		// TODO Auto-generated method stub
		return horasTrabajadas * 40;
	}

}
