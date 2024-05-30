package ar.edu.unq.po2.tp11;

public abstract class ModoDeReproduccion {
	
	private ReproductorMP3 reproductor;
	

	
	public ModoDeReproduccion(ReproductorMP3 reproductor) {
		super();
		this.reproductor = reproductor;
	}
	
	
	
	public ReproductorMP3 getReproductor() {
		return reproductor;
	}



	public void setReproductor(ReproductorMP3 reproductor) {
		this.reproductor = reproductor;
	}



	public abstract void play();
	public abstract void pause();
	public abstract void stop();
}
