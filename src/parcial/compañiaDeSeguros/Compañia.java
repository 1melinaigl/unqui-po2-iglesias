package parcial.compañiaDeSeguros;

import java.util.List;

public class Compañia {
	private List<Poliza> polizas;

	public Compañia(List<Poliza> polizas) {
		super();
		this.polizas = polizas;
	}
	
	
	
	

}

/*  Si utiliza patrones de diseño indique cuáles y también indique los participantes
 (roles) de esos patrones en su solución según el libro de Gamma et al.
 
 Se utiliza el STATE en las fases. Donde el context es la poliza, state la fase y abierta, cerrada y vigente son los concreteState
 
  Tambien se utilizo el state en el momento de la bonificacion ya que al aplicar descuento actuaba dde una manera diferente dependiendo la fase de la poliza.
  
  
  
  */ 

