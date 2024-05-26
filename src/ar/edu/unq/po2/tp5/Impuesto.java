package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	private double tasaDeServicio;

	public Impuesto() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Impuesto(double tasaDeServicio) {
		super();
		this.tasaDeServicio = tasaDeServicio;
	}



	public double getTasaDeServicio() {
		return tasaDeServicio;
	}



	public void setTasaDeServicio(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}



	@Override
	public double obtenerPrecio() {
		// TODO Auto-generated method stub
		return getTasaDeServicio();
	}

}
