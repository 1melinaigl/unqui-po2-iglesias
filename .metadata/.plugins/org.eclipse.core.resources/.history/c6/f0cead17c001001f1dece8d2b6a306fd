package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoPrimeraNecesidadTest {

	private ProductoDePrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoDePrimeraNecesidad("Leche", 8d, false, 0.8);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals((7.2), leche.getPrecio());
	}
}