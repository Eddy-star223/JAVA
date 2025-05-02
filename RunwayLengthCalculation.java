import java.util.Scanner;

public class RunwayLengthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter speed in meters/second: ");
        double speed = input.nextDouble();

        System.out.print("Enter acceleration in meters/second squared: ");
        double acceleration = input.nextDouble();

        
        double runwayLength = (speed * speed) / (2 * acceleration);

        
        System.out.printf("The minimum runway length needed is %.2f meters.%n", runwayLength);
    }
}