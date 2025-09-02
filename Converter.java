import java.util.Scanner;

public class Converter {

	private static final double ROUBLES_PER_YUAN = 11.91;

	public static void main(String[] args) {
		int yuan;
		double roubles;
		Scanner input = new Scanner(System.in);

		System.out.print("Yuan input: ");
		yuan = input.nextInt();

		roubles = yuan * ROUBLES_PER_YUAN;
		System.out.println(String.format("Roubles output: %f", roubles));

		input.close();
	}
}
