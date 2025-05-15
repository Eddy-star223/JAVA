import java.util.Scanner;

public class NaturalNumbers {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int sum = 0;

for (int i = 1; i <= 10;) {
System.out.print("Enter number: ");
int number = input.nextInt();
sum =+ number;
i++;

}
System.out.println("The sum of the first 10 natural numbers is:" + sum);

}
}