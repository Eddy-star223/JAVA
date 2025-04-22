import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

        
System.out.print("Enter first number: ");
int first = input.nextInt();

System.out.print("Enter second number: ");
int second = input.nextInt();

int result = 1;

for (int i = 0; i < second; i++) {
result *= first;

}

System.out.println(first + " raised to the power of " + second + " is " + result);
   
 }
}
