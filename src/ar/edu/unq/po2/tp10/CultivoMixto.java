package ar.edu.unq.po2.tp10;

import java.util.ArrayList;

public class CultivoMixto implements Cultivo {
	
	private ArrayList<Cultivo> cultivos;
	
	
	public CultivoMixto() {
		
		
	}
	
	public CultivoMixto(ArrayList<Cultivo> cultivos) {
		super();
		this.cultivos = cultivos;
	}




	public ArrayList<Cultivo> getCultivos() {
		return cultivos;
	}




	public void setCultivos(ArrayList<Cultivo> cultivos) {
		this.cultivos = cultivos;
	}

 public void addCultivo(Cultivo unCultivo) {
	 
	 
	 this.getCultivos().add(unCultivo);
 }


	public double gananciaAnual() {
		
		return cultivos.stream()
				.mapToDouble(c -> c.gananciaAnual()).sum();
		
	}
	

}
