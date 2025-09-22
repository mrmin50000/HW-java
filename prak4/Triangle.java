package prak4;

public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;

	public Triangle(double side1, double side2, double side3, String color, boolean isFilled)
			throws IllegalTriangleException {
		if (!isValidTriangle(side1, side2, side3)) {
			throw new IllegalTriangleException(side1, side2, side3);
		}
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

	@Override
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public String ToString() {
		return "Треугольник:\nCторона 1 = " + this.side1 + "\nCторона 2 = " + this.side2 + "\nCторона 3 = "
				+ this.side3 + "\nПериметр: " + this.getPerimeter() + "\nПлощадь: " + this.getArea()
				+ "\nЗаливка: " + this.isFilled + "\nЦвет: " + this.color + "\n";
	}

	private boolean isValidTriangle(double a, double b, double c) {
		return a + b > c && a + c > b && b + c > a;
	}
}
