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
		scanner.close();
	}

}
