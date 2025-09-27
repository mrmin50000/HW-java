package prak5;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericStack<E> {
	private static final int DEFAULT_CAPACITY = 10;
	private E[] elements;
	private int size;

	@SuppressWarnings("unchecked")
	public GenericStack(int initialCapacity) {
		if (initialCapacity <= 0) {
			throw new IllegalArgumentException("Начальная емкость должна быть положительной");
		}
		elements = (E[]) new Object[initialCapacity];
		size = 0;
	}

	public GenericStack() {
		this(DEFAULT_CAPACITY);
	}

	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return elements.length;
	}

	public E peek() {
		if (isEmpty()) {
			throw new java.util.EmptyStackException();
		}
		return elements[size - 1];
	}

	public void push(E o) {
		if (size == elements.length) {
			resize(2 * elements.length);
		}
		elements[size++] = o;
	}

	public E pop() {
		if (isEmpty()) {
			throw new java.util.EmptyStackException();
		}
		E o = elements[--size];
		elements[size] = null;
		return o;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@SuppressWarnings("unchecked")
	private void resize(int newCapacity) {
		E[] newArray = (E[]) new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newArray[i] = elements[i];
		}
		elements = newArray;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("stack: [");
		for (int i = 0; i < size; i++) {
			sb.append(elements[i]);
			if (i < size - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

}

public class GenericStackExtendsByArrayList<E> extends ArrayList<E> {

	public E peek() {
		if (isEmpty()) {
			throw new java.util.EmptyStackException();
		}
		return get(getSize() - 1);
	}

	public void push(E o) {
		add(o);
	}

	public E pop() {
		if (isEmpty()) {
			throw new java.util.EmptyStackException();
		}
		E o = get(getSize() - 1);
		remove(getSize() - 1);
		return o;
	}

	public int getSize() {
		return size();
	}

	@Override
	public String toString() {
		return "стек: " + super.toString();
	}
}

public class Main2 {
	public static void main(String[] args) {
		GenericStack<String> stack = new GenericStack<>(5);
		stack.push("123");
		System.out.println(stack.toString());
		Scanner input = new Scanner(System.in);
		GenericStack<String> stack2 = new GenericStack<>();

		System.out.println("Введите 5 строк:");

		for (int i = 1; i <= 5; i++) {
			System.out.print("Строка " + i + ": ");
			String line = input.nextLine();
			stack2.push(line);
		}
		System.out.println("\nСтроки в обратном порядке:");
		while (!stack2.isEmpty()) {
			System.out.println(stack2.pop());
		}
		input.close();
	}
}
