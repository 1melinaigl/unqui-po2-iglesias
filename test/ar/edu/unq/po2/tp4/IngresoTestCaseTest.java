package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTestCaseTest {
	
	private IngresoNormal ingresoNormal;
	private IngresoHorasExtra ingresoExtra;
	
	@BeforeEach
	public void setUp(){ 
		
		ingresoNormal = new IngresoNormal("Enero", "normal", 1000);
		ingresoExtra = new IngresoHorasExtra("Febrero", "EXTRA", 500);
	}
	

	@Test
	void testElIngresoNormalRetornaUnImponibleDe1000() {
		assertEquals(1000, ingresoNormal.getMontoImponible());
	}

	@Test
	
	void testElIngresoExtraRetornaUnImponibleDe0() {
		
		assertEquals(0, ingresoExtra.getMontoImponible());
	}
}
