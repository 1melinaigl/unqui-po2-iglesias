package ar.edu.unq.po2.tp11;

public class EstadoUnJugador extends EstadoMaquinaJuego {

	

	public EstadoUnJugador(MaquinaDeVideojuego maquinaDeVideojuego) {
		super(maquinaDeVideojuego);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void empezarJuego() {
		// TODO Auto-generated method stub

	}

	@Override
	public void terminarJuego() {
		this.getMaquinaDeVideojuego().setEstadoMaquina(new EstadoInicial(this.getMaquinaDeVideojuego()));

	}

}
