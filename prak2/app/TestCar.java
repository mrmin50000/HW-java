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
		C1.SetColor("purple");
		String color1 = C1.GetColor();
		C2.SetModel("Tesla");
		System.out.println("\n" + color1 + "\n");
		String color2 = C2.GetModel();
		System.out.println(color2 + "\n------------------------------------------\nVehicleType for Car:\n");
		String vt1 = C1.vehicleType();
		System.out.println("\nFor Car: " + vt1 + "\n");
		String vt2 = C2.vehicleType();
		System.out.println("For ElectricCar: " + vt2);
	}
}
