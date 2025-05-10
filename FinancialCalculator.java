import java.util.Scanner;

public class FinancialCalculator {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);

int amount = 0;
int rate = 3.75;
int months = 0;


System.out.print("Enter the amount: ");
amount = input.nextInt();

System.out.print("Enter the rate: ");
rate = input.nextInt();


System.out.print("Enter the months: ");
months = input.nextInt();

for (int i = 0; int i <= 2; i++){

int value = amount * (months + rate)  



}
}
}