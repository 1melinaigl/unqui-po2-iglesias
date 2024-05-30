package ar.edu.unq.po2.tp11;

public class MaquinaDeVideojuego {
	
	private int fichas;
	private EstadoMaquinaJuego estadoMaquina;
	
	
	
	public MaquinaDeVideojuego(int fichas, EstadoMaquinaJuego estadoMaquina) {
		super();
		this.fichas = fichas;
		this.estadoMaquina = new EstadoInicial(this);
	}



	public MaquinaDeVideojuego(int fichas) {
		super();
		this.fichas = fichas;
	}



	public MaquinaDeVideojuego() {
		super();
	}



	public int getFichas() {
		return fichas;
	}



	public void setFichas(int fichas) {
		this.fichas = fichas;
	}



	public EstadoMaquinaJuego getEstadoMaquina() {
		return estadoMaquina;
	}



	public void setEstadoMaquina(EstadoMaquinaJuego estadoMaquina) {
		this.estadoMaquina = estadoMaquina;
	}
	
	
	public void encender() {
		
		if (this.getFichas() != 0) {
			this.getEstadoMaquina().empezarJuego();
		}
		else {
			
			System.out.println("Ingrese fichas para jugar");
		}
		
		this.estadoMaquina.empezarJuego(); 
	}
	
		
	}




