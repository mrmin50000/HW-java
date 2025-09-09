package prak2.app.vehicles;

public class Car extends Vehicle {
	@Override
	public String vehicleType() {
		return "Car";
	}

	public Car() {
		model = "mercedes";
		color = "black";
		insuranceNumber = 123;
		ownerName = "Sam";
		license = "00000";
		engineType = "Combustion";
		year = 1999;
	}
}
