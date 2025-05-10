import java.util.Scanner;

public class CircleCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter circle of the radius: "); // prompt
int radius = input.nextInt();

// Calculate and display the diameter, circumference, and area
System.out.printf("Circumference: %.2f%n", 2 * 3.14159 * radius);
System.out.printf("Area: %.2f%n" , 3.14159 * radius);

// Predefined constant Math.PI
System.out.printf("Circumference: %.2f%n" , 2 * Math.PI * radius);
System.out.printf("Area: %.2f%n" , Math.PI * radius);

  }
}

