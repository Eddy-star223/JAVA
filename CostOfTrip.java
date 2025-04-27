import java.util.Scanner;

public class CostOfTrip {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the distance to drive: ");
int distanceToDrive = input.nextInt();

System.out.print("Enter fuel efficiency of car in miles per gallon: ");
int fuelEfficiency = input.nextInt();

System.out.print("Enter the price per gallon: ");
int pricePerGallon = input.nextInt();

int costOfTrip = distanceToDrive + fuelEfficiency + pricePerGallon;

System.out.printf("Cost of the trip is %d%n%d%n%d%n%d%n" , distanceToDrive , fuelEfficiency , pricePerGallon , costOfTrip);

  }
}