package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private String nombre;
    private String direccion; 
    private List<Producto> catalogo;
    private int cantidadDeProductos;

    public Supermercado() {

    }

    public Supermercado(String nombre,String direccion) {
        super();
        this.nombre = nombre;
        this.direccion = direccion;
        this.catalogo = new ArrayList<Producto>();
        this.cantidadDeProductos = 0;
    }

    public void agregarProducto(Producto producto) {
        catalogo.add(producto);
        this.cantidadDeProductos += 1;
    }

    public Double getPrecioTotal() {
        Double precioTotal = (double) 0;
        for (Producto producto:this.catalogo) {
            precioTotal += producto.getPrecio();
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

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public void setCantidadDeProductos(int cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }


}