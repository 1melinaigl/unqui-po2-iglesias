package ar.edu.unq.po2.tp9;

public class Planta extends Empleado {
	
	private int cantidadDeHijos; 
	

	public Planta(int cantidadDeHijos) {
		super();
		this.cantidadDeHijos = cantidadDeHijos;
	}


	@Override
	double calcularSueldoBruto() {
		double sueldoBasico = 3000;
		double extraPorHijos = cantidadDeHijos * 150;
		return sueldoBasico + extraPorHijos;
	}

}
