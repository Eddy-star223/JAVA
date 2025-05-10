import java.util.Scanner;

public class PopulationCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);


System.out.print("Enter estimated world population: ");
double worldPopulation = input.nextDouble();

System.out.print("Enter annual growing rate: ");
double annualRate = input.nextDouble();
 
double worldPopulation1 = worldPopulation;
double annualRate1 = worldPopulation * annualRate + worldPopulation; 
 

System.out.printf("Estimated world population:%f%n Increase rate after one year:%f", 
worldPopulation1, annualRate1); 

  }
} 