package ar.edu.unq.po2.tp5;

public class ProductoDeEmpresa extends Item {

	
public ProductoDeEmpresa(String nombre, double precioBase, int stock) {
	
	super(nombre, precioBase, stock);
}

@Override

public double obtenerPrecio() {
	
	return super.getPrecioBase();
	
}
}

