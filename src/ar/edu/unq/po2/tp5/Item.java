package ar.edu.unq.po2.tp5;
	
abstract class Item {
    private String nombre;
    private double precioBase;
    private int stock;
    
    
    public Item(String nombre, double precioBase, int stock) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    public abstract double obtenerPrecio();

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

	protected void decrementarStock() {
		
		stock =- 1;
	}
}
