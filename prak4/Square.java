package prak4;

public class Square extends GeometricObject implements GeometricObject.Colorable {

	private double side;

	public Square(double side, boolean a, String c) {
		this.side = side;
		this.isFilled = a;
		this.color = c;
	}

	public Square() {
		this.side = 0;
		this.isFilled = true;
		this.color = "red";
	}

	@Override
	public void howToColor() {
		System.out.println("Раскрасьте все 4 стороны\n");
	}

	public double getSide() {
		return this.side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return side * 4;
	}

	@Override
	public String ToString() {
		return "Квадрат:\nСторона: " + this.side + "\nПлощадь: " + this.getArea() + "\nПериметр: "
				+ this.getPerimeter() + "\nЗаливка: " + this.isFilled + "\nЦвет: " + this.color + "\n";
	}
}
