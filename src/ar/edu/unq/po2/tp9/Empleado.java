package ar.edu.unq.po2.tp9;

public abstract class Empleado {
	


	public final double sueldo() {
		
		double sueldoBruto = calcularSueldoBruto();
		return sueldoBruto - aplicarDescuento (sueldoBruto);
		}

	public double aplicarDescuento(double unSueldo) {
		
		
		return unSueldo * 0.13;
		
	}
	
	abstract double calcularSueldoBruto();
	
	
}