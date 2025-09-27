package prak5;

import java.util.List;

import java.util.ArrayList;

public class Circle implements Comparable {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	Circle() {
		this.radius = 1;
	}

	@Override
	public int compareTo(Object arg0) {
		if (this.radius > arg0.g) {
			return 1;
		}
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
	}
}
