package ar.edu.unq.po2.tp3;

public class Point {

	
	private float x;
	private float y;


public Point() {
	
	this.x = 0;
	this.y = 0;
}

public Point (float x, float y) {
	
	this.x = x;
	this.y = y;
	
}

public float getX() {
	return x;
}

public void setX(float x) {
	this.x = x;
}

public float getY() {
	return y;
}

public void setY(float y) {
	this.y = y;
}

public void mover( float unNuevoPuntoX, float unNuevoPuntoY) {
	
	this.x = unNuevoPuntoX;
	this.y = unNuevoPuntoY;
	
}

public Point sum(Point otherPoint) {
  
	float newX = this.x + otherPoint.getX();
	float newY = this.y + otherPoint.getY();
	
    return new Point(newX, newY);
}





}