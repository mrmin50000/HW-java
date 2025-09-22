package prak4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println(
				"Введите 3 стороны треугольника, цвет и есть заливка или нет (true - есть, false - нет)\n");
		Scanner scanner = new Scanner(System.in);
		System.out.println("сторона 1: ");
		double side1 = scanner.nextDouble();
		System.out.println("сторона 2: ");
		double side2 = scanner.nextDouble();
		System.out.println("сторона 3: ");
		double side3 = scanner.nextDouble();
		System.out.println("цвет: ");
		String color = scanner.next();
		System.out.println("заливка: ");
		boolean isFilled = scanner.nextBoolean();
		try {
			Triangle t1 = new Triangle(side1, side2, side3, color, isFilled);
			System.out.println('\n' + t1.ToString() + '\n');
		} catch (IllegalTriangleException e) {
			System.out.println(e);
		}
		Triangle t2 = new Triangle();
		System.out.println(t2.ToString());

		/* Second part */

		System.out.println("Введите два круга и два прямоугольника:\n");
		System.out.println("Радиус 1: ");
		double r1 = scanner.nextDouble();
		System.out.println("Заливка 1: ");
		boolean isFilled1 = scanner.nextBoolean();
		System.out.println("Цвет 1: ");
		String colorR1 = scanner.next();
		Circle c1 = new Circle(r1, isFilled1, colorR1);

		System.out.println("\nРадиус 2: ");
		double r2 = scanner.nextDouble();
		System.out.println("Заливка 2: ");
		boolean isFilled2 = scanner.nextBoolean();
		System.out.println("Цвет 2: ");
		String colorR2 = scanner.next();
		Circle c2 = new Circle(r2, isFilled2, colorR2);

		System.out.println("MAX: \n" + c1.max(c1, c2).ToString());

		System.out.println("\nСторона 1.1: ");
		double a1 = scanner.nextDouble();
		System.out.println("Сторона 1.2: ");
		double b1 = scanner.nextDouble();
		System.out.println("Заливка 1: ");
		boolean isFilled3 = scanner.nextBoolean();
		System.out.println("Цвет 1: ");
		String colorP1 = scanner.next();
		Rectangle R1 = new Rectangle(a1, b1, colorP1, isFilled3);

		System.out.println("\nСторона 2.1: ");
		double a2 = scanner.nextDouble();
		System.out.println("Сторона 2.2: ");
		double b2 = scanner.nextDouble();
		System.out.println("Заливка 2: ");
		boolean isFilled4 = scanner.nextBoolean();
		System.out.println("Цвет 2: ");
		String colorP2 = scanner.next();
		Rectangle R2 = new Rectangle(a2, b2, colorP2, isFilled4);

		System.out.println("MAX: \n" + R1.max(R1, R2).ToString());

		System.out.println("ComparableCircles: \n");

		ComparableCircle CC1 = new ComparableCircle(3.0, true, "yellow");
		ComparableCircle CC2 = new ComparableCircle(5.0, false, "red");

		System.out.println("Первый радиус = 3, второй = 5\n");
		System.out.println(CC1.compareto(CC2).ToString() + "\n");

		System.out.println("Прямоугольник со сторонами 3 и 4 с кругом радиуса 2\n");
		ComparableCircle CC3 = new ComparableCircle(2.0, false, "rainbow");
		Rectangle RR = new Rectangle(3, 4, "sadasda", false);

		System.out.println(CC3.compareto(RR).ToString() + "\n");

		scanner.close();
	}

}
