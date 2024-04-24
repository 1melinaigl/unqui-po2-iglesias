package ar.edu.unq.po2.tp4;


public abstract class Ingreso {
    private String mesDePercepcion;
    private String concepto;
    private double montoPercibido;

    public Ingreso(String mesDePercepcion, String concepto, double montoPercibido) {
        this.mesDePercepcion = mesDePercepcion;
        this.concepto = concepto;
        this.montoPercibido = montoPercibido;
    }

    public double getMontoPercibido() {
        return montoPercibido;
    }

    public abstract double getMontoImponible();


	public String getMesDePercepcion() {
		
		return mesDePercepcion;
	}
	
	public String getConcepto() {
		
		return concepto;
	}
}