package parcial.compañiaDeSeguros;

public class Cerrada extends Fase {

	public Cerrada(Poliza poliza) {
		super(poliza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void agregarItem(Item unItem) {
		this.getPoliza().getInventario().add(unItem);
		this.getPoliza().getGastosAdministrativos().add(new GastoAdministrativo("Recargo por extensión", unItem.valorItem() * 0.03));

	}

	@Override
	public void cerrarInventario() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pagar() {
		
		this.getPoliza().setFasePoliza(new Vigente(this.getPoliza()));

	}

	@Override
	public void cancelar() {
		// TODO Auto-generated method stub

	}

}
