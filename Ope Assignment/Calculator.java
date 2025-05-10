import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

String menu = """ 
1. Addition 
2. subtraction
3. multiplication
4. division
5. square

""";

menu:	
while (true) {
System.out.print(menu);
System.out.println("Enter your choice of option");
int user = input.nextInt();
switch (user) {


case 1: 
Addition:
while (true) {
 System.out.println("Additon");
	 System.out.print("Please enter first number: ");
	int firstNumber = input.nextInt();
	 System.out.print("Please enter second number: ");
	int secondNumber = input.nextInt();
	


	int total1 = firstNumber + secondNumber;
	System.out.println(total1);

	System.out.println("Press 0 to go back");
	
	if(input.nextInt() == 0) {
	continue menu;
}
break;
	
} 
  case 2: 
subtraction:
while (true) {
 System.out.println("subtraction");
	 System.out.print("Please enter first number: ");
	int firstNumber = input.nextInt();
	 System.out.print("Please enter second number: ");
	int secondNumber = input.nextInt();
	


	int total1 = firstNumber - secondNumber;
	System.out.println(total1);

	System.out.println("Press 0 to go back");
	
	if(input.nextInt() == 0) {
	continue menu;
}
break;
	
} 
 case 3: 
multiplication:
while (true) {
 System.out.println("multiplication");
	 System.out.print("Please enter first number: ");
	int firstNumber = input.nextInt();
	 System.out.print("Please enter second number: ");
	int secondNumber = input.nextInt();
	


	int total1 = firstNumber * secondNumber;
	System.out.println(total1);

	System.out.println("Press 0 to go back");
	
	if(input.nextInt() == 0) {
	continue menu;
}
break;
	
} 

case 4:
division:
while (true) {
System.out.print("division");
System.out.print("Please enter first number: ");
double divide1 = input.nextDouble();
System.out.print("Please enter first number: ");
double divide2 = input.nextDouble();
Double total = divide1 / divide2;
System.out.print(total);

 System.out.print("Press 0 to go back");
if (input.nextDouble() == 0) {
continue menu;
}
break;

}

case 5:
while (true) {
square:
	System.out.println("Square"); 
	System.out.print("Enter number: ");
	int num1 = input.nextInt();
	
	System.out.print("Enter number: ");
	int num2 = input.nextInt();
	
	int total = num1 + num2;
	System.out.println(Math.sqrt(total));

	System.out.print("press 0 to go back: ");
	if (input.nextInt() == 0) {
	continue menu;

}
}




      
}
	










}
}
}
