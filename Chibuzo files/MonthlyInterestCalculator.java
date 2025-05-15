import java.util.Scanner;

public class MonthlyInterestCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the balance: ");
double balance = input.nextDouble(); 

System.out.print("Enter the annual percentage interest rate:");
double annualInterestRate = input.nextDouble();

double interest = balance * 1200 / annualInterestRate;

System.out.printf("The interest for next month is: $%.2f%n", interest);

  }
}

