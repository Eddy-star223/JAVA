import java.util.Scanner;

public class SmapleInt {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: ");
int num1 = input.nextInt();

if (num1 % 5 == 0) 
System.out.println("HiFive");


if (num1 % 2 == 0) 
System.out.println("HiEven");



}


}