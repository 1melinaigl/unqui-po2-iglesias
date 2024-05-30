package ar.edu.unq.po2.tp11;

public class ReproductorMP3 {
	
	private ModoDeReproduccion modo;
	


	public ReproductorMP3(ModoDeReproduccion modo) {
		super();
		this.modo = new SeleccionDeCancion(this);
	}





	public ModoDeReproduccion getModo() {
		return modo;
	}





	public void setModo(ModoDeReproduccion modo) {
		this.modo = modo;
	}





	private void iniciar() {
		
		this.modo.play();
		
		
	}

}
