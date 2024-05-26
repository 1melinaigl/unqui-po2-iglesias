package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class CajaDeMercado {

	private List<Pagable> pagables;
	

	
	public CajaDeMercado() {
		this.pagables = new ArrayList<Pagable>();
	}
	

	public double registrarProducto() {
		

		double monto = 0;
		for (Pagable pagable : this.pagables) {
			
			monto += pagable.obtenerPrecio();
			pagable.procesar();
			
			
		}
		return monto;
	}
	

	public List<Pagable> getPagable() {
		return pagables;
	}


	public void setProductos(List<Pagable> pagables) {
		this.pagables = pagables;
	}

	public void addProducto(Pagable unPagable) {
		
	 pagables.add(unPagable);
	}
	
}