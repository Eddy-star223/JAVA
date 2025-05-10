// Meter.java

// Class Scanner

import java.util.Scanner;

public class Meter {

	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a value for feet: ");
	double feet = input.nextDouble();

	double meter = feet * 0.305;

	System.out.printf("%.0f feet is %.0f meters", feet, meter);
}
}