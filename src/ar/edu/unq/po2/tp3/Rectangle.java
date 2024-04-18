package ar.edu.unq.po2.tp3;

public class Rectangle {

	
	private Point topLeft;
	private Point bottomRight;


public Rectangle(Point topLeft, Point bottomRight) { 
	
	this.topLeft = topLeft;
	this.bottomRight = bottomRight;
	
}


public Point getTopLeft() {
	return topLeft;
}


public void setTopLeft(Point topLeft) {
	this.topLeft = topLeft;
}


public Point getBottomRight() {
	return bottomRight;
}


public void setBottomRight(Point bottomRight) {
	this.bottomRight = bottomRight;
}


public float getHeight() {
	
	return topLeft.getY() - bottomRight.getY();
}


public float getWidth() {
	
	
	return bottomRight.getX() - topLeft.getX();
}


public float getArea() {
	
	return getWidth() * getHeight();
			
}
public float getPerimeter() {
	
	return getWidth() +  getHeight() * 2;
}

public boolean esHorizontal() {
	
	return getWidth() > getHeight();
	
}


public boolean esVertical() {
	
	return getHeight() > getWidth();
}
}