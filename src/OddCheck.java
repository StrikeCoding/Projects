import java.util.Scanner;


public class OddCheck {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Type an integer Value");
		
		//Test comment
		while (true) {
			try {

				String value = input.nextLine();
				int i = Integer.parseInt(value);

				if (i % 2 == 0) {
					System.out.println("Even");
				} else {
					System.out.println("Odd");
				}
				System.out.println("\nEnter another integer value if you wish to continue.");

			} catch (Exception e) {
				System.out.println("\nPlease enter a proper integer value");
			}
		}

	}
}
