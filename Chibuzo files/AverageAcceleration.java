import java.util.Scanner;

public class AverageAcceleration {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the staring velocity (v0) in meters/second:");
double v0 = input.nextDouble();

System.out.print("Enter the ending velocity (v1) in meters/second:");
double v1 = input.nextDouble();

System.out.print("Enter the time span (t) in seconds:");
double t = input.nextDouble();

double averageAcceleration = v1 - v0 / t;

System.out.println("The average acceleration is " + averageAcceleration + " Meters/second");

  }
}  