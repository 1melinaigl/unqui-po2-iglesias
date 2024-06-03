package prueba.testPoliza;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import parcial.compañiaDeSeguros.BonificacionService;
import parcial.compañiaDeSeguros.Fase;
import parcial.compañiaDeSeguros.GastoAdministrativo;
import parcial.compañiaDeSeguros.Item;
import parcial.compañiaDeSeguros.Poliza;
import parcial.compañiaDeSeguros.Vigente;

public class PolizaVigenteTestCase {
	
	private Poliza poliza;
	private List<Item> inventario;
	private List<GastoAdministrativo> gastosAdministrativos;
	private Vigente fasePoliza;
	private BonificacionService bonificador;
	
	@BeforeEach
	public void setUp() {
		
		fasePoliza = mock(Vigente.class);
		bonificador = mock(BonificacionService.class);
		inventario = new ArrayList<Item>();
		
		poliza = new Poliza(inventario, gastosAdministrativos, fasePoliza, bonificador);
	}
	

	@Test
	void unaPolizaVigentenNoTieneGastosAdministrativos() {
		
		List<GastoAdministrativo> spyGastoAdministrativo = spy(new ArrayList<GastoAdministrativo>());
		Poliza poliza = new Poliza(inventario, spyGastoAdministrativo, fasePoliza, bonificador);
		
		poliza.aplicarBeneficio("taylor", 1989);
		verify(spyGastoAdministrativo).clear();
		
		

		
		
		
		
	}

}
