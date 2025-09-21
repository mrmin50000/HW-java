package prak4;

public class IllegalTriangleException extends Exception {
	public IllegalTriangleException() {
		super("Недопустимый треугольник: сумма любых двух сторон должна быть больше третьей");
	}

	public IllegalTriangleException(String message) {
		super(message);
	}

	public IllegalTriangleException(double side1, double side2, double side3) {
		super(String.format(
				"Недопустимый треугольник со сторонами: %.2f, %.2f, %.2f. Нарушено правило треугольника: сумма любых двух сторон должна быть больше третьей",
				side1, side2, side3));
	}
}
