package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {

		RoadBike bike1 = new RoadBike();
		System.out.println("bike 1 before changing:\n");
		bike1.printDescription();
		bike1.setPostHeight(20);
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);
		MountainBike bike3 = new MountainBike();
		Bike bike4 = new Bike();

		System.out.println("-----------------------------------\n");
		bike1.printDescription();
		bike2.printDescription();
		bike3.printDescription();
		bike4.printDescription();
	}// end method main

}// end class BikeDriver
