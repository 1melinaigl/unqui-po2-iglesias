package parcial.compañiaDeSeguros;

import java.util.List;

public class Poliza {
	private List<Item> inventario;
	private List<GastoAdministrativo> gastosAdministrativos;
	private Fase fasePoliza;
	
	
	
	public Poliza(List<Item> inventario, List<GastoAdministrativo> gastosAdministrativos) {
		super();
		this.inventario = inventario;
		this.gastosAdministrativos = gastosAdministrativos;
	}
	
	
	
	
	
	public Poliza(List<Item> inventario, List<GastoAdministrativo> gastosAdministrativos, Fase fasePoliza) {
		super();
		this.inventario = inventario;
		this.gastosAdministrativos = gastosAdministrativos;
		this.fasePoliza = fasePoliza;
	}





	public Fase getFasePoliza() {
		return fasePoliza;
	}





	public void setFasePoliza(Fase fasePoliza) {
		this.fasePoliza = fasePoliza;
	}





	public List<Item> getInventario() {
		return inventario;
	}

	public void setInventario(List<Item> inventario) {
		this.inventario = inventario;
	}


	public List<GastoAdministrativo> getGastosAdministrativos() {
		return gastosAdministrativos;
	}




	public void setGastosAdministrativos(List<GastoAdministrativo> gastosAdministrativos) {
		this.gastosAdministrativos = gastosAdministrativos;
	}




	public double montoAsegurado() {
		
	
		return getInventario().stream().mapToDouble(i -> i.valorItem())
				.sum();
	}
	
	public double precioMensual() { 
		
		double montoAsegurado = this.montoAsegurado() * 0.0075;
		double gastosAdministrativos = this.montoTotalPorGastoAdministartivo();
		return montoAsegurado + gastosAdministrativos;
		
	}

	public double montoTotalPorGastoAdministartivo() {
		
		return getGastosAdministrativos().stream().mapToDouble(g -> g.getMonto()).sum();
	}
	
	public void agregarItem(Item unItem) {
		
		getFasePoliza().agregarItem(unItem);
		
	}
	
	public void cerrarInventario() {
		getFasePoliza().cerrarInventario();

}
	
	public void pagar() {
		
		getFasePoliza().pagar();
	}
	
	public void cancelar() {
		
		getFasePoliza().cancelar();
	}
}