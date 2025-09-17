package prak4;

public class Triangle extends GeometricObject {
	public Triangle(double side1, double side2, double side3, String color, boolean isFilled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.color = color;
		this.isFilled = isFilled;
	}

	public Triangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
		this.color = "red";
		this.isFilled = true;
	}

}
