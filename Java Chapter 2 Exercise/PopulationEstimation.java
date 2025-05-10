import java.util.Scanner;

public class PopulationEstimation {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);


System.out.print("Enter current world population: ");
double currentPopulation = input.nextDouble();

System.out.print("Enter annual world population growth (in %): ");
double annualPopulation = input.nextDouble();

// calculate the estimate population rate in the next five years
System.out.println("Estimate the population rate from in the next five years: ");
for (int i = 0; i <= 0; i++) {
double estimatedPopulation = currentPopulation * 1 + Math.pow(annualPopulation, i);

System.out.printf("Years %d: %.2f billion%n", i, estimatedPopulation);
}

  }
}

