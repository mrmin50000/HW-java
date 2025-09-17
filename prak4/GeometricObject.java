package prak4;

public abstract class GeometricObject {
	protected double side1;
	protected double side2;
	protected double side3;
	protected String color;
	protected boolean isFilled;

	public double getSide1() {
		return this.side1;
	}

	public double getSide2() {
		return this.side2;
	}

	public double getSide3() {
		return this.side3;
	}

	public String getColor() {
		return this.color;
	}

	public boolean getIsFilled() {
		return this.isFilled;
	}

	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String ToString() {
		return "Треугольник: сторона 1 = " + side1 + " сторона 2 = " + side2 + " сторона 3 = " + side3
				+ " цвет = " + color + " заливка = " + isFilled + '\n';
	}

}
