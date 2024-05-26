package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoDePrimeraNecesidadTestCase {

	private ProductoDePrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoDePrimeraNecesidad("Leche", 8, false, 0.8);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals((6.4), leche.getPrecio());
	}
}