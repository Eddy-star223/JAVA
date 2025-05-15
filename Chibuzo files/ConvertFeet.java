import java.util.Scanner;

public class ConvertFeet {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter number in feet: ");
double feet = input.nextDouble();

double meters = feet * 0.305;

System.out.printf("Enter a value for feet: %d%n " , meters);

  }
} 
