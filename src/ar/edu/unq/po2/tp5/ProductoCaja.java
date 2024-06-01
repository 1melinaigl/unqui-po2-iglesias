package ar.edu.unq.po2.tp5;
	
public class ProductoCaja implements Pagable {
    private String nombre;
    private double precioBase;
    private int stock;
    
    
    public ProductoCaja(String nombre, double precioBase, int stock) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    public double obtenerPrecio() {
    	
    	return getPrecioBase();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

	public void procesar() {
		
		stock =- 1;
	}
}
