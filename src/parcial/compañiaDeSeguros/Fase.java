package parcial.compañiaDeSeguros;

public abstract class Fase {
	
	private Poliza poliza;
	
	
	
	
	public Fase(Poliza poliza) {
		super();
		this.poliza = poliza;
	}
	

	public Poliza getPoliza() {
		return poliza;
	}


	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}


	public abstract void agregarItem(Item unItem);

	public abstract void cerrarInventario();

	public abstract void pagar();

	public abstract void cancelar();

	protected abstract void bonificar();

}
