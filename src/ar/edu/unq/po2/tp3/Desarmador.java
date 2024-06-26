package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Desarmador {

    private List<Integer> numeros;

    public Desarmador() {
        super();
        numeros = new ArrayList<Integer>();
    }

    public void addNumber(int numeroAAgregar) {
        numeros.add(numeroAAgregar);
    }

    public int getMayorCantidadDeDigitosPares(List<Integer> numeros) {
        int maximoNumerosPares = numeros.get(0);
        for (int entero : numeros) {
            if (cantidadDeDigitosPares(entero) > cantidadDeDigitosPares(maximoNumerosPares)) {
                maximoNumerosPares = entero;
            }
        }
        return maximoNumerosPares;
    }


    public int cantidadDeDigitosPares(int unNumero) {
        int digitosPares = 0;
        while (unNumero != 0) {
            int digito = unNumero % 10;
            if (digito % 2 == 0) {
                digitosPares++;
            }
            unNumero /= 10;
        }
        return digitosPares;
    }
}