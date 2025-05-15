import java.util.Random;
import java.util.Scanner;

public class MystreyGame2 {
public static void main(String[] args) {
Random random = new Random();
Scanner input = new Scanner(System.in);

int randomNumber = random.nextInt(10) + 1;

int userInput;

for (int counter = 0; counter < 3; counter++) {
System.out.print("Enter trail: " );
userInput = input.nextInt();

if (userInput == randomNumber) {
System.out.println("You guess the correct number.");
System.out.println("Congratulation");
break;
} else if (userInput < randomNumber ) {
System.out.println("Your guess is too low.");
} else if (userInput > randomNumber) {
System.out.println("Your guess is too high.");
}
else {
System.out.println("Error");
}		
}
System.out.println("Game Over");

}
}