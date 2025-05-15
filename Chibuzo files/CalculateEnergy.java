import java.util.Scanner;

public class CalculateEnergy {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the amount of water in kilograms: ");
int waterInKilograms = input.nextInt();

System.out.print("Enter the initial temperature: ");
int initialTemperature = input.nextInt();

System.out.print("Enter the final temperature of the water: ");
int finalTemperature = input.nextInt();

int calculateEnergy = waterInKilograms * (finalTemperature - initialTemperature) * 4184;

System.out.printf("The energy needed to heat is %d%n%d%n%d%n%d%n " , waterInKilograms , 
initialTemperature , finalTemperature , calculateEnergy);

  }
} 