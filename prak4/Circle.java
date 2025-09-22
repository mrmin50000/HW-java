package prak4;

public class Circle extends GeometricObject implements GeometricObject.Colorable {
	private double radius;

	public Circle(double radius, boolean isFilled, String color) {
		this.radius = radius;
		this.isFilled = isFilled;
		this.color = color;
	}

	public Circle() {
		this.radius = 1;
		this.isFilled = true;
		this.color = "red";
	}

	@Override
	public void howToColor() {
		System.out.println("Раскрасьте окружность\n");
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String ToString() {
		return "Круг:\nРадиус: " + this.radius + "\nПлощадь: " + this.getArea() + "\nПериметр: "
				+ this.getPerimeter() + "\nЗаливка: " + this.isFilled + "\nЦвет: " + this.color + "\n";
	}
}
