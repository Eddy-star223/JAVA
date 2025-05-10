import java.util.Scanner;

public class Multiply{
// Main method begin execution
public static void main (String[] args){
Scanner input = new Scanner(System.in);

// read two integers 
System.out .print("Enter first integer: ");
int firstNumber = input.nextInt();

System.out.print("Enter second integer: ");
int secondNumber = input.nextInt();

// calculate triple d and double values
int tripled = firstNumber * 3;
int doubled = secondNumber * 2;

// Check if tripled is multiple of doubled
if (tripled % doubled == 0) {
   System.out.println("The first number tripled is multiple of the second number double.");
} else {
       System.out.println("The first number tripled is not a multiple of the second number double.");
    }
  }
}


