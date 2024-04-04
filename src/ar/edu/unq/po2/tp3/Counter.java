package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
    private List<Integer> numeros;

	public Counter() {
		super();
		this.numeros = new ArrayList<Integer>();
	}

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}

