import java.io.InputStream;
import java.util.Scanner;

public interface DeliveryStrategy {
	double calculateCost(double weight, double distance);
}

public class StandartDeliveryStrategy implements DeliveryStrategy {
	private double base_rate = 5;
	private double weight_rate = 0.5;
	private double distance_rate = 0.1;

	@Override
	public double calculateCost(double weight, double distance) {
		return base_rate + weight * weight_rate + distance * distance_rate;
	}
}

public class ExpressDeliveryStrategy implements DeliveryStrategy {
	private double base_rate = 10;
	private double weight_rate = 0.8;
	private double distance_rate = 0.2;

	@Override
	public double calculateCost(double weight, double distance) {
		return base_rate + weight * weight_rate + distance * distance_rate;
	}

}

public class CourierDeliveryStrategy implements DeliveryStrategy {
	private double base_rate = 15;
	private double weight_rate = 1;
	private double distance_rate = 0.3;

	@Override
	public double calculateCost(double weight, double distance) {
		return base_rate + weight * weight_rate + distance * distance_rate;
	}
}

public class Delivery {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 - Standart\n2 - Express\n3 - Courier\nChoice: ");
		int choice = scanner.nextInt();
		System.out.println("\nWeight: ");
		double weight = scanner.nextDouble();
		System.out.println("\nDistance: ");
		double distance = scanner.nextDouble();
		switch (choice) {
			case 1:
				DeliveryStrategy delivery1 = new StandartDeliveryStrategy();
				System.out.println("Cost: " + delivery1.calculateCost(weight, distance));
				break;
			case 2:
				DeliveryStrategy delivery2 = new ExpressDeliveryStrategy();
				System.out.println("Cost: " + delivery2.calculateCost(weight, distance));
				break;
			case 3:
				DeliveryStrategy delivery3 = new CourierDeliveryStrategy();
				System.out.println("Cost: " + delivery3.calculateCost(weight, distance));
				break;
			default:
				System.out.println("Not found");
				break;
		}
		scanner.close();
	}
}
