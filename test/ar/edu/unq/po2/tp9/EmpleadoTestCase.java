package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTestCase {
	
	private Empleado empleado;
	private Temporario empleadoTemporario; 

	@BeforeEach
	public void setUp(){ 
		
		empleadoTemporario = new Temporario(2, true, true);
	}

	@Test
	void elSueldoDeUnEmpleadoTemporarioEsDe9657() {
		
		assertEquals(965.7, empleadoTemporario.sueldo());
	}

}
