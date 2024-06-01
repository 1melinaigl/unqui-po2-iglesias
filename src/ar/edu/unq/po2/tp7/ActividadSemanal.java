package ar.edu.unq.po2.tp7;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ActividadSemanal {

    public enum DiaDeLaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO;
    } 

    public enum Deporte {
        RUNNING(1),
        FUTBOL(2),
        BASQUET(2),
        TENNIS(3),
        JABALINA(4);
        
        private int nivelDeComplejidad;
        
        Deporte(int nivelDeComplejidad) {
            this.nivelDeComplejidad = nivelDeComplejidad;
        }
        
        public int getNivelDeComplejidad() {
            return nivelDeComplejidad;
        }
    }
    
    /* Precondicion: la duracion siempre sera en formato hora, 1 hora, 2 horas */
    private DiaDeLaSemana diaDeLaSemana;
    private LocalTime horaDeInicio;
    private int duracion;
    private Deporte deporte;
    
    public ActividadSemanal(DiaDeLaSemana diaDeLaSemana, LocalTime horaDeInicio, int duracion, Deporte deporte) {
        this.diaDeLaSemana = diaDeLaSemana;
        this.horaDeInicio = horaDeInicio;
        this.duracion = duracion;
        this.deporte = deporte;
    }

    public DiaDeLaSemana getDiaDeLaSemana() {
        return diaDeLaSemana;
    }

    public LocalTime getHoraDeInicio() {
        return horaDeInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public Deporte getDeporte() {
        return deporte;
    }
    
    // Método para calcular el costo de una actividad por hora
    public double costoHoraPorActividad() {
        double costoHora;
        if (diaDeLaSemana.ordinal() >= DiaDeLaSemana.LUNES.ordinal() &&
            diaDeLaSemana.ordinal() <= DiaDeLaSemana.MIERCOLES.ordinal()) {
            costoHora = 500;
        } else {
            costoHora = 1000;
        }
        return costoHora + deporte.getNivelDeComplejidad() * 200;    }
    
    public double costoDeActividad() {
    	
    	return this.costoHoraPorActividad() * this.getDuracion();
    	
    	
    }
    // Método para calcular el costo total de todas las actividades semanales
    public double costoPorActividadSemanal(List<ActividadSemanal> actividades) { 
      
    	Stream<ActividadSemanal> streamDeActividades = actividades.stream();
    	return streamDeActividades.mapToDouble(a -> a.costoDeActividad())
    			.sum();
    	
    }
    
    public List<ActividadSemanal> actividadesDeFutbol(List<ActividadSemanal> actividades) {
    	
    	Stream<ActividadSemanal> streamDeActividades = actividades.stream();
    	return streamDeActividades .filter(a -> a.getDeporte() == Deporte.FUTBOL)
                .collect(Collectors.toList());
    	
    }
    
    public List<ActividadSemanal> actividadesConComplejidad(List<ActividadSemanal> actividades, int unaComplejidad) {
    	
    	Stream<ActividadSemanal> streamDeActividades = actividades.stream();
    	return streamDeActividades .filter(a -> a.getDeporte().getNivelDeComplejidad() == unaComplejidad)
    			.collect(Collectors.toList());
    	
    }
     
    public int getDuracionTotalDeLasActividades (List<ActividadSemanal> actividades) {
    	Stream<ActividadSemanal> streamDeActividades = actividades.stream();
    	return streamDeActividades.mapToInt(a -> a.getDuracion())
    			.sum();
    	
    }
    public Optional<ActividadSemanal> actividadDeMenorCostoPorDeporte(List<ActividadSemanal> actividades, Deporte deporteInteres) {
    	Stream<ActividadSemanal> streamDeActividades = actividades.stream();
                      return streamDeActividades.filter(actividad -> actividad.getDeporte() == deporteInteres) //
                          .min(Comparator.comparingDouble(ActividadSemanal::costoDeActividad)); // 
    }

    @Override
    public String toString() {
        return "Deporte: " + deporte + ". Dia: " + diaDeLaSemana + " A LAS: " + horaDeInicio + ". Duración: " +  duracion;
                   
    }
}

