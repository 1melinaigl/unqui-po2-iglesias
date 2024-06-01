package parcial.compañiaDeSeguros;

public class Item {
	
	private int cantidad;
	private double valorMonetario;
	
	
	public Item (int cantidad, double valorMonetario) {
		
		this.cantidad = cantidad;
		this.valorMonetario = valorMonetario;
		
	}

	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getValorMonetario() {
		return valorMonetario;
	}


	public void setValorMonetario(double valorMonetario) {
		this.valorMonetario = valorMonetario;
	}
	
	public double valorItem() {
		
		return cantidad * valorMonetario;
	}

}
