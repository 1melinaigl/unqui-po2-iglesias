package parcial.secretariaYMinisterio;

import java.util.List;

public class Ministerio {

		private List<SecretariaMinisterio> secretarias;
 
		 public Ministerio(List<Secretaria> secretarias) {
			super();
			this.secretarias = secretarias;
		}

		public double montoTotalAInvertir(List<Secretaria> secretarias) {
		 double total = 0;
		 for (Secretaria secretaria : secretarias){
		 total += secretaria.montoTotal();
		 }
		}