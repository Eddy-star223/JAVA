import java.util.Scanner;

public class AverageCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int numA = input.nextInt();

System.out.print("Enter second integer: ");
int numB = input.nextInt();

System.out.print("Enter second integer: ");
int numC = input.nextInt();

int sum = numA + numB + numC;
int average = sum / 2;
int product = numA * numB * numC;
int smallest = Math.min(numA, Math.min(numB, numC));
int largest = Math.max(numA, Math.max(numB, numC));

System.out.printf("%d:%d:%d:%d:%d", sum, average, product, smallest, largest);


}
}