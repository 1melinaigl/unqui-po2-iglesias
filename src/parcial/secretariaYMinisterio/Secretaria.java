package parcial.secretariaYMinisterio;

import java.util.List;

public class Secretaria {

		private List<Actividad> actividades;

		public Secretaria(List<Actividad> actividades) {
			super();
			this.actividades = actividades;
		}

		public List<Actividad> getActividades() {
			return actividades;
		}

		public void setActividades(List<Actividad> actividades) {
			this.actividades = actividades;
		}
	
		public double inversionTotal() {
			
			return this.getActividades().stream().mapToDouble(a -> a.inversionTotal()).sum();
			
		}



}
