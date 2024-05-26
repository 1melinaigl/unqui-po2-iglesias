package ar.edu.unq.po2.tp10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CultivoTestCase {
	
	private CultivoPuro cultivoPuro;
	private CultivoPuro soja;
	private CultivoPuro trigo;
	private CultivoMixto cultivoMixto;


	
	@BeforeEach
	
	void setUp() {
		cultivoMixto = new CultivoMixto();
		soja = new CultivoDeSoja();
		trigo = new CultivoDeTrigo();
	 	cultivoMixto.addCultivo(soja);
	 	cultivoMixto.addCultivo(trigo);
	}
	

	@Test
	void laGananciaDeUnCultivoMixtoEsDe800() {
		assertEquals(800, cultivoMixto.gananciaAnual());
	}

}
