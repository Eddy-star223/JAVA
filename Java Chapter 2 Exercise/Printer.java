import java.util.Scanner;

public class Printer {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int square1 = input.nextInt();

System.out.print("Enter second integer: ");
int square2 = input.nextInt();

int sumSquare = square1 + square2;
int diffSquare = square1 - square2;

System.out.printf("%d", sumSquare, diffSquare);



}
}