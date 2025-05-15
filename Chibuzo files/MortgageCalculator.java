import java.util.Scanner;

public class MortgageCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);


System.out.print("Enter the principal amount: ");
double amount = input.nextInt();

System.out.print("Enter the annual rate: ");
double rate = input.nextDouble();

System.out.print("Enter the duration in years: ");
int duration = input.nextInt();

double monthlyRate = rate / 1200;
int numOfPayment = duration * 12;

double monthlyPayment= (amount * monthlyRate) /
(1 - Math.pow(1 + monthlyRate, -numOfPayment));



System.out.println("Your monthly payment is: $" + monthlyPayment);


}
}