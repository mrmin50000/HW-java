package prak4;

public class Rectangle extends GeometricObject implements GeometricObject.Colorable {

	private double side1;
	private double side2;

	public Rectangle(double side1, double side2, String color, boolean isFilled) {
		this.side1 = side1;
		this.side2 = side2;
		this.color = color;
		this.isFilled = isFilled;
	}

	public Rectangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.color = "red";
		this.isFilled = true;
	}

	@Override
	public void howToColor() {
		System.out.println("Раскрасьте все 4 стороны\n");
	}

	@Override
	public double getArea() {
		return side1 * side2;
	}

	@Override
	public double getPerimeter() {
		return (side1 + side2) * 2;
	}

	@Override
	public String ToString() {
		return "Прямоугольник:\nCторона 1 = " + this.side1 + "\nCторона 2 = " + this.side2 + "\nПериметр: "
				+ this.getPerimeter() + "\nПлощадь: " + this.getArea() + "\nЗаливка: " + this.isFilled
				+ "\nЦвет: " + this.color + "\n";
	}

}
