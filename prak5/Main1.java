package prak5;

import java.util.List;

import java.util.ArrayList;

class Circle implements Comparable<Circle> {
	public double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	Circle() {
		this.radius = 1;
	}

	@Override
	public int compareTo(Circle other) {
		if (this.radius > other.radius) {
			return 1;
		} else if (this.radius < other.radius) {
			return -1;
		} else {
			return 0;
		}
	}
}

class Array2DUtils {
	public static <T extends Comparable<T>> T Max(T[][] array2D) {
		if (array2D == null || array2D.length == 0) {
			throw new IllegalArgumentException("array is null or length = 0");
		}

		T max = array2D[0][0];

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if (array2D[i][j].compareTo(max) == 1) {
					max = array2D[i][j];
				}
			}
		}

		return max;
	}
}

public class Main1 {

	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> arr) {
		ArrayList<T> res = new ArrayList<T>();

		for (T el : arr) {
			if (!res.contains(el)) {
				res.add(el);
			}
		}

		return res;
	}

	public static <T> int search(T el, ArrayList<T> arr) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).equals(el)) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("apple");
		arr.add("apple");
		arr.add("apple");
		arr.add("apple");
		arr.add("apple");
		arr.add("apple");
		arr.add("lorem");
		arr.add("ipsum");

		ArrayList<String> arrWithoutDuplicates = removeDuplicates(arr);

		System.out.println(arr);
		System.out.println("\n" + arrWithoutDuplicates);

		System.out.println("\n" + search("apple", arr));

		ArrayList<Circle> carr = new ArrayList<>();
		carr.add(new Circle(12));
		carr.add(new Circle(10));
		carr.add(new Circle());
		System.out.println("\n" + carr);
		Circle max = new Circle(0);
		for (int i = 0; i < carr.size() - 1; i++) {
			if (carr.get(i).compareTo(max) == 1) {
				max = carr.get(i);
			}
		}
		System.out.println("\n" + max.radius + "\n");

		Circle[][] arr2d = { { new Circle(12), new Circle(1) }, { new Circle(123), new Circle() },
				{ new Circle(), new Circle() } };
		System.out.println(Array2DUtils.Max(arr2d).radius);
	}
}
