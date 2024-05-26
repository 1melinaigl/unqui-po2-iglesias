package ar.edu.unq.po2.tp7;

public class LesionesDermatologicas {

    // Enumeración de lesiones dermatológicas
    public enum Lesion {
        ROJO("a", 1, "Gris"),
        GRIS("b", 2, "Amarillo"),
        AMARILLO("c", 3, "Miel"),
        MIEL("d", 4, "Rojo"); 
        
        // Atributos de la lesión
        private String descripcion;
        private int nivelDeRiesgo;
        private String proximoColorEnMaduracion;
        
        // Constructor de la lesión
        Lesion(String descripcion, int nivelDeRiesgo, String proximoColorEnMaduracion) {
            this.descripcion = descripcion;
            this.nivelDeRiesgo = nivelDeRiesgo;
            this.proximoColorEnMaduracion = proximoColorEnMaduracion;
        }
        
        // Métodos getter
        public String getDescripcion() {
            return descripcion;
        }

        public int getNivelDeRiesgo() {
            return nivelDeRiesgo;
        }

        public String getProximoColorEnMaduracion() {
            return proximoColorEnMaduracion;
        }
    }
}
