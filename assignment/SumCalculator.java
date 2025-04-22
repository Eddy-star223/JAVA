import java.util.Scanner; 

public class SumCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

String choice;

do {
System.out.print("Enter first numbrer: ");
int num1 = input.nextInt();

System.out.print("Enter first numbrer: ");
int num2 = input.nextInt();

int sum = num1 + num2;
System.out.print("The sum is: " + sum);


System.out.print(" " + "Do you wish to perform the operation again: ");
choice = input.next();

} while 
(choice.equalsIgnoreCase("yes")); 

System.out.print("Goodbye!");


}
}








