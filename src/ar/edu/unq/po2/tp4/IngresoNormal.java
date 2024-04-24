package ar.edu.unq.po2.tp4;

public class IngresoNormal extends Ingreso {

	public IngresoNormal(String mesDePercepcion, String concepto, double montoPercibido) {
		super(mesDePercepcion, concepto, montoPercibido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMontoImponible() {
		// TODO Auto-generated method stub
		return super.getMontoPercibido();
	}

}
