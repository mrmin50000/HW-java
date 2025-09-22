package prak4;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		String[] months = { "январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь",
				"октябрь", "ноябрь", "декабрь" };
		int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		if (n == 2) {
			int year = scanner.nextInt();
			if (year % 4 == 0) {
				System.out.println("\n" + months[n - 1] + " " + (dom[n - 1] + 1));
			} else {
				System.out.println("\n" + months[n - 1] + " " + dom[n - 1]);
			}
		}

		else {
			System.out.println("\n" + months[n - 1] + " " + dom[n - 1]);
		}
		scanner.close();
	}
}
