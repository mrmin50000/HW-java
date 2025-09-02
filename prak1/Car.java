public class Car {
	private String model;
	private String license;
	private String color;
	private int year;

	public Car() {
		model = "Sport Car";
		license = "None";
		color = "black";
		year = "1985";
	}

	public Car(String model, String license, String color, int year) {
		this.model = model;
		this.license = license;
		this.color = color;
		this.year = year;
	}

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
}
