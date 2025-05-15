import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate : ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        
        double monthlyInterestRate = annualInterestRate / 1200;

        
        int numberOfMonths = years * 12;

        
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfMonths);

       
        System.out.printf("Future investment value is %d%n", futureInvestmentValue);
    }
}
