package ar.edu.unq.po2.tp5;

public class FacturaDeServicio extends Factura {
	
	private double costoUnidadConsumida;
	private int cantidadDeUnidadConsumida;
	

	public FacturaDeServicio(double costoUnidadConsumida, int cantidadUnidadConsumida) {
		super();
		this.costoUnidadConsumida = costoUnidadConsumida;
		this.cantidadDeUnidadConsumida = cantidadUnidadConsumida;
		
	}

	@Override
	public double calcularMontoTotal() {
		
		return cantidadDeUnidadConsumida * costoUnidadConsumida;
	}

	public double getCostoUnidadConsumida() {
		return costoUnidadConsumida;
	}

	public void setCostoUnidadConsumida(double costoUnidadConsumida) {
		this.costoUnidadConsumida = costoUnidadConsumida;
	}

	public int getCantidadDeUnidadConsumida() {
		return cantidadDeUnidadConsumida;
	}

	public void setCantidadDeUnidadConsumida(int cantidadDeUnidadConsumida) {
		this.cantidadDeUnidadConsumida = cantidadDeUnidadConsumida;
	}

}
