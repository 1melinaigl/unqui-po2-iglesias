package ar.edu.unq.po2.tp11;

public class Reproduccion extends ModoDeReproduccion {
	
	

	public Reproduccion(ReproductorMP3 reproductor) {
		super(reproductor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		System.out.println("ERROR");
	}

	@Override
	public void pause() {
		// song.pause)()
		this.getReproductor().setModo(new Pausa(this.getReproductor()));

	}

	@Override
	public void stop() {
		// song.stop()
		this.getReproductor().setModo(new SeleccionDeCancion(this.getReproductor()));
	}

}
