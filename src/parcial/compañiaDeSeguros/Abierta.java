package parcial.compañiaDeSeguros;

public class Abierta extends Fase {
	

	public Abierta(Poliza poliza) {
		super(poliza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void agregarItem(Item unItem) {
		this.getPoliza().getInventario().add(unItem);

	}

	@Override
	public void cerrarInventario() {
		System.out.println("Carga del inventario finalizada");
		this.getPoliza().setFasePoliza(new Cerrada(this.getPoliza()));

	}

	@Override
	public void pagar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelar() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void bonificar() {
		
		this.getPoliza().getGastosAdministrativos().add(new GastoAdministrativo("Bonificación Administrativa", -500));
		
	}

}
