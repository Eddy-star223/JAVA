import java.util.Random;
import java.util.Scanner;

public class MystreyGame {
public static void main(String[] args) {
Random random = new Random();
Scanner input = new Scanner(System.in);

int randomNumber = random.nextInt(10) + 1;
int counter = 0;

while (counter != 2) {
System.out.print("Enter first trail:" + counter);
int guess = input.nextInt();
if (guess == randomNumber) {
System.out.println("You guess the correct number.");
System.out.println("Game Over");
} else if (guess < randomNumber) {
System.out.println("You guess is too low.");
} else if (guess > randomNumber) {
System.out.println("Your guess is too high.");
counter++;
     }
   }

  }
}

/*
System.out.print("Enter your guess: ");
guess = input.nextInt();
if (guess == randomNumber) {
System.out.println("You guess the wrong number");
} else if (guess < randomNumber) {
System.out.println("Your guess is too low.");
} else if (guess > randomNumber) {
System.out.println("Your guess is too high.");
}

System.out.print("Enter your guess: ");
guess = input.nextInt();
if (guess == randomNumber) {
System.out.println("You guess the correct number");
} else if (guess < randomNumber) {
System.out.println("Your guess is too low");
} else if (guess > randomNumber) {
System.out.println("Your guess is too high");
} else {
 System.out.println("Your correct answer is" + randomNumber);
} */

  
  
 

