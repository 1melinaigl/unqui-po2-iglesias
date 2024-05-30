package ar.edu.unq.po2.tp11;

public class SeleccionDeCancion extends ModoDeReproduccion {


	public SeleccionDeCancion(ReproductorMP3 reproductor) {
		super(reproductor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// song.play()
		this.getReproductor().setModo(new Reproduccion(this.getReproductor()));
		
	}

	@Override
	public void pause() {
		 System.out.println("ERROR");

	}

	@Override
	public void stop() {

	}

}
