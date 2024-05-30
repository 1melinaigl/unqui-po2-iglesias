package ar.edu.unq.po2.tp11;

public class EstadoInicial extends EstadoMaquinaJuego {
	


	public EstadoInicial(MaquinaDeVideojuego maquinaDeVideojuego) {
		super(maquinaDeVideojuego);
		
	}

	public void empezarJuego() {
		
		if (this.getMaquinaDeVideojuego().getFichas() == 1) {
			
			this.getMaquinaDeVideojuego().setEstadoMaquina(new EstadoUnJugador(this.getMaquinaDeVideojuego()));
			System.out.println("Modo un jugador");
			getMaquinaDeVideojuego().getEstadoMaquina().empezarJuego();
			
		} else {
			
			this.getMaquinaDeVideojuego().setEstadoMaquina(new EstadoMultijugador(this.getMaquinaDeVideojuego()));
			
			System.out.println("Modo Multijugador");
			getMaquinaDeVideojuego().getEstadoMaquina().empezarJuego();		
		}
		}
		
	
	public void terminarJuego() {
		this.getMaquinaDeVideojuego().setEstadoMaquina(new EstadoInicial(this.getMaquinaDeVideojuego()));
		
	}
	}
	

