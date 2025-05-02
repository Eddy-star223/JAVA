import java.util.Scanner;

public class TriangleArea {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Prompt users to enter coordinate of three points
System.out.print("Enter the x1 and y1: ");
double x1 = input.nextDouble();
double y1 = input.nextDouble();

System.out.print("Enter the x2 and y2: ");
double x2 = input.nextDouble();
double y2 = input.nextDouble();

System.out.print("Enter the x3 and y3: ");
double x3 = input.nextDouble();
double y3 = input.nextDouble();

// Calculate the area of triangle
double area = 0.5 * Math.abs(x1 * (y2- y3) + x2 * (y3 - y1) + x3 * (y1-y2));

// Display the area
System.out.println("The area of the triangle is " + area);

  }
} 