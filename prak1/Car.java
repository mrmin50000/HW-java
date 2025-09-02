public class Car {
	private String model;
	private String license;
	private String color;
	private int year;

	public Car() {
		model = "Sport Car";
		license = "None";
		color = "black";
		year = 1985;
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

	public void To_String() {
		System.out.println("Model: " + model);
		System.out.println("License: " + license);
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
	}

	public String GetModel() {
		return model;
	}

	public String GetLicense() {
		return license;
	}

	public String GetColor() {
		return color;
	}

	public int GetYear() {
		return year;
	}

	public void SetModel(String model) {
		this.model = model;
	}

	public void SetLicense(String license) {
		this.license = license;
	}

	public void SetColor(String color) {
		this.color = color;
	}

	public void SetYear(int year) {
		this.year = year;
	}

	public int ReturnAge() {
		return 2025 - this.year;
	}

	public static void main(String[] args) {
		Car C = new Car();
		C.To_String();
		C.SetModel("merc");
		System.out.print("\n");
		C.To_String();
		System.out.print("\n");
		System.out.println("Age: " + C.ReturnAge());
	}

}
