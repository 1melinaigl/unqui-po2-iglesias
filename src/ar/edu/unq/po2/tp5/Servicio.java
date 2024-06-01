package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	private double costoPorUnidad;
	private double cantidadConsumida;
	

	public Servicio() {
		
	}
	public Servicio(double costoPorUnidad, double cantidadConsumida) {
		super();
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadConsumida = cantidadConsumida;
	}


	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}
	public void setCostoPorUnidad(double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}
	public double getCantidadConsumida() {
		return cantidadConsumida;
	}
	public void setCantidadConsumida(double cantidadConsumida) {
		this.cantidadConsumida = cantidadConsumida;
	}
	@Override
	public double obtenerPrecio() {
		return getCostoPorUnidad() * getCantidadConsumida();
	}
	@Override
	public void procesar() {
		// TODO Auto-generated method stub
		
	}


}
