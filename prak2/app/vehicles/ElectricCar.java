package prak2.app.vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
	private int batteryCapacity;

	public ElectricCar() {
		super();
		batteryCapacity = 100;
		this.engineType = "Electro";
	}

	public void SetBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int GetBatteryCapacity() {
		return this.batteryCapacity;
	}

	@Override
	public String vehicleType() {
		return "ElectricCar";
	}

	@Override
	public void ToString() {
		super.ToString();
		System.out.println("Battery Capacity: " + batteryCapacity);
	}
}
