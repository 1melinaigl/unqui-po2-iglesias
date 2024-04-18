package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {

    private String nombreDeEquipo;
    private List<Persona> integrantes;

    public EquipoDeTrabajo(String nombreDeEquipo, List<Persona> integrantes) {
        this.nombreDeEquipo = nombreDeEquipo;
        this.integrantes = integrantes; 
    }

    public String getNombreDeEquipo() {
        return nombreDeEquipo;
    }

    public void setNombreDeEquipo(String nombreDeEquipo) {
        this.nombreDeEquipo = nombreDeEquipo;
    }

    public List<Persona> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Persona> integrantes) {
        this.integrantes = integrantes;
    }
    
    public void agregarIntegrante(Persona persona) {
        integrantes.add(persona);
    }

    public int edadPromedioDelEquipo(List<Persona> integrantes) {
        if (integrantes.isEmpty()) {
            return 0;
        }
        
        int edadTotal = 0;
        for (Persona individuo : integrantes) {
            edadTotal += individuo.getEdad();
        }
        
        return edadTotal / integrantes.size();
    }
}
