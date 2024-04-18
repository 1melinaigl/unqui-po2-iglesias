package ar.edu.unq.po2.tp4;

public class ProductoDePrimeraNecesidad extends Producto {

	public ProductoDePrimeraNecesidad(String nombre, double precioBase, boolean esPrecioCuidado, double descuentoAAplicar) {
		super(nombre, precioBase, esPrecioCuidado);
		this.precioBase = this.precioBase * descuentoAAplicar;
		
	}
	
}
