package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
    private List<Integer> numeros;

	public Counter() {
		super();
		numeros = new ArrayList<Integer>();
	}

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;

}
	
	public void addNumber(int numeroAAgregar) {
		
		numeros.add(numeroAAgregar);
	}
	
	public int countEvenNumbers() { 
		int evenNumbers = 0;
		for (int entero:numeros) {
			if (esPar (entero)) {
				evenNumbers =+ 1;
			}
		}
		return evenNumbers;
	}
	
	private boolean esPar(int entero) { 
		
		return entero % 2 == 0;
	}

		
	public int countOddNumbers() { 
		
		int oddNumbers = 0;
			for (int entero:numeros) { 
				if ( esImpar(entero)) {
					oddNumbers =+ 1;
				}
			}
		
			return oddNumbers;
	}

	private boolean esImpar(int entero) {
		
		return entero % 2 != 0;
	}
	
	
	public int countMultiplesNumbers(int numeroMultiplo) {
		
				int multiplesNumbers = 0;
					for(int entero: numeros) {
						if (esMultiplo(numeroMultiplo, entero)) {
							multiplesNumbers =+ 1;
						}
				}
			
				return multiplesNumbers;		
					
	}
	
	private boolean esMultiplo(int numeroMultiplo, int entero) { 
		
		return entero % numeroMultiplo == 0;
			
	}
	
	
	
	
	
	
	
}
