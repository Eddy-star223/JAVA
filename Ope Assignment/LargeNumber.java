import java.util.Scanner;

public class LargeNumber {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int number = 0;
int largest = 0;


for (int i = 0; i <= 9; i++) {
System.out.print("Enter number: ");
largest = input.nextInt();

if (largest > number) { 
System.out.println(largest);
largest++;
}
}
System.out.print("The largest number is: " + largest);

}
}