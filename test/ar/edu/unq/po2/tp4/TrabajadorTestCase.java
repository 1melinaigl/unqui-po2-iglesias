package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {

	private Trabajador trabajador;
	private IngresoNormal ingresoNormal;
	private IngresoHorasExtra ingresoExtra;
	
	@BeforeEach
	public void setUp(){ 
		
		trabajador = new Trabajador();
		ingresoNormal = new IngresoNormal("Enero", "Salario", 1000);
		ingresoExtra = new IngresoHorasExtra("Febrero", "horasExtra", 500);
	}
	
	// Realizo los test correspondientes
	
	@Test
	void testAgregarUnIngresoAlTrabajador() {
		
		trabajador.addIngreso(ingresoExtra);
		assertEquals(1, trabajador.getIngresos().size());
		
	}

	void testMontoPercibidoTotal() {
		
		trabajador.addIngreso(ingresoExtra);
		trabajador.addIngreso(ingresoNormal);
		assertEquals(1500, trabajador.getTotalPercibido());
	}
	
	void testMontoImponibleTotal() {
		trabajador.addIngreso(ingresoExtra);
		trabajador.addIngreso(ingresoNormal);
		assertEquals(1000, trabajador.getMontoImponible());
		
	}
}
