import java.util.Scanner;

public class PoundsConvert {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter number in pounds: ");
Double numberInPounds = input.nextDouble();

double convertPounds = 0.454 * 1000;

System.out.println("Pound converted is " + convertPounds);

  }
} 