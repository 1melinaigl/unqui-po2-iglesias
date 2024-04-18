package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {

	
    private List <Integer> enteros;



public Multioperador () { 
	
	enteros = new ArrayList<Integer>();
}
	
public int sumar(List<Integer> enteros) {
	
	int suma = 0;
	if (!enteros.isEmpty()) {
		for (int numero : enteros) { 
		
			suma += numero;
	}	
	}
	return suma;
	
	
}

public int restar(List<Integer> enteros) {
	
	int resta = 0;
	if (!enteros.isEmpty())	{	
		resta = enteros.get(0);
			for (int indice = 1; indice < enteros.size();) {
		
					resta -= enteros.get(indice);
						indice++;
	}
	}
	return resta;
}


public int multiplicar(List<Integer> enteros) { 
	
	int producto = 0;
			if (!enteros.isEmpty()) { 
				
				for ( int numero : enteros) {
					
					producto *= numero;
					
				}
				
			}
	return producto;
}

}




