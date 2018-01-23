import java.util.Scanner;

/* To calculate volume an additional height variable would be needed,
 * either as a fixed variable or as user input and the volume formula
 * can be added to the output as (l*w*h) */

public class Lab1 {

	public static void main(String[] args) {
		// Variables
		Scanner scan = new Scanner(System.in);
		double length;
		double width;
		char keepGoing = 'Y';

		// Greeting
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");

		while (keepGoing == 'Y' || keepGoing == 'y') {
			// Gather length & width from user
			System.out.print("\nEnter Length: ");
			length = scan.nextDouble();
			System.out.print("Enter Width: ");
			width = scan.nextDouble();

			// Output Area & Perimeter
			System.out.println("Area: " + (length * width));
			System.out.println("Perimeter: " + ((2 * length) + (2 * width)));

			// Keep Going? y or Y will continue
			System.out.print("\nContinue? (y/n): ");
			keepGoing = scan.next().charAt(0);
		}

		scan.close();
	}
}
