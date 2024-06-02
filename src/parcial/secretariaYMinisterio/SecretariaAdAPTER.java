package parcial.secretariaYMinisterio;

public class SecretariaAdAPTER implements SecretariaMinisterio {
	
	private Secretaria secretaria;

	@Override
	public double montoTotal() {
		
		
		return secretaria.inversionTotal();
	
	}



}
