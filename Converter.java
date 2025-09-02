import java.util.Scanner;

public class Converter {

	private static final double ROUBLES_PER_YUAN = 11.91;

	public static void main(String[] args) {
		int yuan;
		double roubles;
		Scanner input = new Scanner(System.in);

		System.out.print("Yuan input: ");
		yuan = input.nextInt();
		if (yuan % 100 <= 20 && yuan % 100 >= 10)
			System.out.println(String.format("Yuan output: %d юаней", yuan));
		else if (yuan % 10 == 1)
			System.out.println(String.format("Yuan output: %d юань", yuan));
		else if (yuan % 10 >= 2 && yuan % 10 <= 4)
			System.out.println(String.format("Yuan output: %d юаня", yuan));
		else
			System.out.println(String.format("Yuan output: %d юаней", yuan));

		roubles = yuan * ROUBLES_PER_YUAN;
		System.out.println(String.format("Roubles output: %f", roubles));

		input.close();
	}
}
