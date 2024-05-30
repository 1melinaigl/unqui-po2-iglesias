package ar.edu.unq.po2.tp11;

public abstract class EstadoMaquinaJuego {
	
	private MaquinaDeVideojuego maquinaDeVideojuego;
	
	
	
	
	public EstadoMaquinaJuego(MaquinaDeVideojuego maquinaDeVideojuego) {
		super();
		this.maquinaDeVideojuego = maquinaDeVideojuego;
	}
	public MaquinaDeVideojuego getMaquinaDeVideojuego() {
		return maquinaDeVideojuego;
	}
	public void setMaquinaDeVideojuego(MaquinaDeVideojuego maquinaDeVideojuego) {
		this.maquinaDeVideojuego = maquinaDeVideojuego;
	}
	public abstract void empezarJuego();
	public abstract void terminarJuego();

}
