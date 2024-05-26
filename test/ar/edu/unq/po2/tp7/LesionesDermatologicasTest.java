package ar.edu.unq.po2.tp7;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.LesionesDermatologicas;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LesionesDermatologicasTest {

    @Test
    public void laDescripcionDeUnaLesionRojaEsA() {
        LesionesDermatologicas.Lesion rojo = LesionesDermatologicas.Lesion.ROJO;
        assertEquals("a", rojo.getDescripcion());
    }
    
    @Test
    
    public void elNivelDeRiesgoDeAmarilloEs3() {
    	
    	LesionesDermatologicas.Lesion amarillo = LesionesDermatologicas.Lesion.AMARILLO;
    	assertEquals(3, amarillo.getNivelDeRiesgo());
    	
    }
    
    public void elProximoColorDeMaduracionDeMielEsRojo() {
    	
    	LesionesDermatologicas.Lesion miel = LesionesDermatologicas.Lesion.MIEL;
    	assertEquals("Rojo", miel.getProximoColorEnMaduracion());
    	
    }
}
