package ar.edu.unq.po2.tp9;

public class Temporario extends Empleado {

    private int horasTrabajadas;
    private boolean tieneHijos;
    private boolean estaCasado;

  
    public Temporario(int horasTrabajadas, boolean tieneHijos, boolean estaCasado) {
        this.horasTrabajadas = horasTrabajadas;
        this.tieneHijos = tieneHijos;
        this.estaCasado = estaCasado;
    }

    @Override
    public double calcularSueldoBruto() {
        double pagoPorHora = horasTrabajadas * 5;
        double sueldoBasico = 1000;
        double extraPorHijosOCasamiento = extraPorCasamientoOHijos(tieneHijos, estaCasado);
        return sueldoBasico + pagoPorHora + extraPorHijosOCasamiento;
    }

    public double extraPorCasamientoOHijos(boolean tieneHijos, boolean estaCasado) {
        if (tieneHijos || estaCasado) {
            return 100;
        } else {
            return 0;
        }
    }
}


