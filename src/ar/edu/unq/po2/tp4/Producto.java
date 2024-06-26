package ar.edu.unq.po2.tp4;

public class Producto {

		private String nombre;
		protected double precioBase;
		private boolean esPrecioCuidado = false;
		

		public Producto(String nombre, double precioBase, boolean esPrecioCuidado) {
	
			this.nombre = nombre;
			this.precioBase = precioBase;
			this.esPrecioCuidado = esPrecioCuidado;
		
}

		public Producto(String unNombre, double precio) {
	
			this.nombre = unNombre;
			this.precioBase = precio;
}


		public String getNombre() {
			return nombre;
}


		public void setNombre(String nombre) {
			this.nombre = nombre;
}


		public double getPrecio() {
			return precioBase;
}


		public void setPrecio(double precioBase) {
			this.precioBase = precioBase;
}


		public boolean esPrecioCuidado() {
			return this.esPrecioCuidado;
}


		public void setEsPrecioCuidado(boolean esPrecioCuidado) {
			this.esPrecioCuidado = esPrecioCuidado;
}

		public double aumentarPrecio(double unAumento) {  
	
			double nuevoPrecio = this.precioBase += unAumento; 
	
			return nuevoPrecio;
}


}
