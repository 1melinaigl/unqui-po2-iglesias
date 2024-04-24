package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;


public class Trabajador {
	
	private List<Ingreso> ingresos;
	
	
	public Trabajador() {
		
		ingresos = new ArrayList<Ingreso>();
		
		
	}
	
	public double getTotalPercibido() {
		
		double totalPercibido = 0;
			for (Ingreso ingreso : ingresos){
				totalPercibido += ingreso.getMontoPercibido();	
		}		
		return totalPercibido;	
	}
	
	public double getMontoImponible() {
		double totalMontoImponible = 0;
			for (Ingreso ingreso : ingresos) {
				
				totalMontoImponible += ingreso.getMontoImponible();
			}
			
			return totalMontoImponible;
		
		
		
	}
}