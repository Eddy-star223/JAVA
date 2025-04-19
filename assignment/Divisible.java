import java.util.Scanner;

public class Divisible {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// read integer
System.out.print("Enter an integer: ");
int number = input.nextInt();

// divisible by 3
if (number % 3 == 0){
   System.out.println(number + " Is divisible by 3.");
} else{
    System.out.println(number + " Is not divisible by 3.");
    }
  }
} 
   
