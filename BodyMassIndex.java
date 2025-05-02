import java.util.Scanner;

public class BodyMassIndex {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pounds: ");
int pounds = input.nextInt();

System.out.print("Enter height in inches: ");
int inches = input.nextInt();

int BodyMassIndex = pounds / inches;

System.out.println("The body mass index is " + BodyMassIndex);

  }
}