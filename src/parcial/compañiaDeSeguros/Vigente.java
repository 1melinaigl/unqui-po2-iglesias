package parcial.compañiaDeSeguros;

public class Vigente extends Fase {

	public Vigente(Poliza poliza) {
		super(poliza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void agregarItem(Item unItem) {
		this.cancelar();
	}

	@Override
	public void cerrarInventario() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pagar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelar() {
		this.getPoliza().getGastosAdministrativos().clear();
		this.getPoliza().setFasePoliza(new Abierta(this.getPoliza()));

	}

	@Override
	protected void bonificar() {
		this.getPoliza().getGastosAdministrativos().clear();
		
	}

}
