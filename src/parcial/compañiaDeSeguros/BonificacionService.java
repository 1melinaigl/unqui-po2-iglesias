package parcial.compañiaDeSeguros;

public interface BonificacionService {
	
	
public boolean codigoValido(int unCodigo);
public void anularCodigo(int unCodigo);
public void notificarTitular(String unTitular, int unCodigo);
	

}
