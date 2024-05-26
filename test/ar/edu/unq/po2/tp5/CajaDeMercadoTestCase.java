package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDeMercadoTestCase {
	
	private CajaDeMercado cajaDeMercado;
	private ProductoCaja manteca;
	private ProductoCaja cafe;
	private ArrayList<ProductoCaja> productos;
	
	
	@BeforeEach
	public void setUp(){ 
		    cajaDeMercado = new CajaDeMercado();
		    manteca = new ProductoCaja("Manteca", 200, 30);
		    cafe = new ProductoCaja("Cafe",800, 15);	
		    
	}

	@Test
	void testCantidadDeProductosEnCaja(){
		
	cajaDeMercado.addProducto(cafe);	
	assertEquals(1, cajaDeMercado.getProductos().size());
	}

	
	@Test
	
	void testMontoTotalDeProductosEnCaja() {
		
		cajaDeMercado.addProducto(cafe);
		cajaDeMercado.addProducto(manteca);
		
		assertEquals(cajaDeMercado.registrarProducto(), 1000);
		
		
		
	}
}
