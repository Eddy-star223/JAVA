import java.util.Scanner;

public class Factorial {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter number: ");
int factorial = input.nextInt();

int number = factorial;

while (number > 1) {
number--;
factorial *= number; 
}  

System.out.println(factorial);

}
}