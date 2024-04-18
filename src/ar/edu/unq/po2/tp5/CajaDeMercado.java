package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class CajaDeMercado implements Agencia{

	private List<Item> productos;
	


public void cajaDeMercado() {
	
	productos = new ArrayList<Item>();
}


public void registrarProducto(Item unProducto) {
	
	
	productos.add(unProducto);
	unProducto.decrementarStock();

}

public float obtenerMontoTotal() {
    float montoTotal = 0;
    for (Item item : productos) {
        montoTotal += item.obtenerPrecio();
    }
    return montoTotal;
}

public void registrarPago(Factura factura) {
	
	System.out.println("Se ha registrado un pago por un monto de: " + factura.calcularMontoTotal());
}

}
