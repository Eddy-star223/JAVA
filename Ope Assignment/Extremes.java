import java.util.Scanner;

public class Extremes {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter any number of choice: ");
int number = input.nextInt();

int maximum = 0;
int minimum = 99673;
int sum = 0;

for (int counter = 0; counter <= number; ) {
System.out.print("Enter number: ");
int num = input.nextInt();


if (num > maximum) {
maximum = num;

}
else if (num < minimum) {
minimum = num;

}
counter++;
}
sum = maximum + minimum;

System.out.println("Maximum number: " + maximum);
System.out.println("Minimum number: " + minimum);
System.out.println("Sum of two extremes: " + sum);


}
}