package prak2.app;

import prak2.app.vehicles.*;

public class TestCar {
	public static void main(String[] args) {
		Car C1 = new Car();
		ElectricCar C2 = new ElectricCar();
		C1.ToString();
		System.out.println("-----------------------------------------\n");
		C2.ToString();
		System.out.println(
				"-----------------------------------------\nE. g. set Car's color to purple and get it, Electric car's model set to Tesla and get it\n");
		C1.SetYear(123);
		int year1 = C1.GetYear();
		C2.SetOwnerName("Torwalds");
		System.out.println("\n" + year1 + "\n");
		String ownerName2 = C2.GetOwnerName();
		System.out.println(ownerName2 + "\n------------------------------------------\nVehicleType for Car:\n");
		String vt1 = C1.vehicleType();
		System.out.println("\nFor Car: " + vt1 + "\n");
		String vt2 = C2.vehicleType();
		System.out.println("For ElectricCar: " + vt2);

		System.out.println("---------------prak3-----------\n");
		C1.SetInsuranceNumber(21321);
		int insuranceNumber = C1.GetInsuranceNumber();
		System.out.println(insuranceNumber);
		System.out.println("\n");
		int battery = C2.GetBatteryCapacity();
		System.out.println(battery + "\n");
	}
}
