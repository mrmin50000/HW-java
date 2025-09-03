package prak2.app.vehicles;

public abstract class Vehicle {
	protected String model;
	protected String license;
	protected String color;
	protected int year;
	protected String ownerName;
	protected int insuranceNumber;
	protected String engineType;

	public String GetModel() {
		return this.model;
	}

	public String GetLicense() {
		return this.license;
	}

	public String GetColor() {
		return this.color;
	}

	public int GetYear() {
		return this.year;
	}

	public String GetOwnerName() {
		return this.ownerName;
	}

	public int GetInsuranceNumber() {
		return this.insuranceNumber;
	}

	public String GetEngineType() {
		return this.engineType;
	}

	public abstract String vehicleType();

	public void SetEngineType(String engType) {
		this.engineType = engType;
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

	public void SetOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void SetInsuranceNumber(int insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public void ToString() {
		System.out.println("Model: " + this.model + "\n");
		System.out.println("License: " + this.license + "\n");
		System.out.println("Color: " + this.color + "\n");
		System.out.println("Year: " + this.year + "\n");
		System.out.println("Owner Name: " + this.ownerName + "\n");
		System.out.println("Insurance number: " + this.insuranceNumber + "\n");
		System.out.println("Engine Type: " + this.engineType + "\n");
	}
}
