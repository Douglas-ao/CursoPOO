package entities;

public class Rectangle {
	
	/* 
	  Rectangle
	 -Width: double
	 -Height: double
	 ---------------
	 +Area(): double
	 +Perimeter(): double
	 +Diagonal(): double
	 */
	
	public double width;
	public double height;
	
	public double valueArea() {
	return width * height;
	}

	public double valuePerimeter() {
	return 2 * (width + height);
	}

	public double valueDiagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
