package ar.edu.unq.po2.tp5;

public class FacturaDeImpuesto extends Factura {
	
	private float tasaFija;

	public FacturaDeImpuesto(float tasaFija) {
		super();
		this.tasaFija = tasaFija;
		
		
	}

	@Override
	public double calcularMontoTotal() {
		
		return tasaFija;
	}

	public float getTasaFija() {
		return tasaFija;
	}

	public void setTasaFija(float tasaFija) {
		this.tasaFija = tasaFija;
	}

}
