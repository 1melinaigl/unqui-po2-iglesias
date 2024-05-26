package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends ProductoCaja {
    public ProductoCooperativa(String nombre, double precioBase, int stock) {
        super(nombre, precioBase, stock);
    }

   @Override
    public double obtenerPrecio() {
        return getPrecioBase() * 0.9; 
    }
}
