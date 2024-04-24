package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	
	
	
public Supermercado(String nombre, String direccion, List<Producto> productos)	{
	
	this.nombre = nombre;
	this.direccion = direccion;
	productos = new ArrayList<Producto>();
	
}


public Supermercado(String nombre, String direccion)	{
	
	this.nombre = nombre;
	this.direccion = direccion;
	
}

public int getCantidadDeProductos() { 
	
	return productos.size();
}

public double getPrecioTotal() {
    double precioTotal = 0;
    if (!productos.isEmpty()) {
        for (Producto producto : productos) { 
            precioTotal += producto.getPrecio();
        }
    } else { 
        precioTotal = 0;
    }
    return precioTotal;
}


public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public List<Producto> getProductos() {
	return productos;
}

public void setProductos(List<Producto> productos) {
	this.productos = productos;
}

public void agregarProducto(Producto unProducto) { 
	
	 productos.add(unProducto);
}
	








}
	
