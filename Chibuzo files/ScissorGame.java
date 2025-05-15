import java.util.Scanner;
import java.util.Random;

public class ScissorGame {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Random random = new Random();

int compWins = random.nextInt();

int userWins =0;
int counter = 0; 
compWins = 0;

while (Math.abs(userWins - compWins) <= 3) {   
System.out.print("scissor (0), rock (1), paper (2): ");
userWins = input.nextInt();

if (userWins == 0 && compWins == 3) {
System.out.println("comp won");

} else if (userWins == 1 && compWins == 2) {
System.out.println("Play on");
}else if (userWins == 2 && compWins == 2) {
System.out.println("It is a draw");
}


if (userWins == 3 && compWins == 0) {
System.out.println("You won");

} 
else if (userWins == 2 && compWins == 1) {
System.out.println("Play on");
}
else if (userWins == 1 && compWins == 1) {
System.out.println("It is a draw");
compWins++;

}


if(userWins > compWins) {
System.out.print("you win"); 
}
else {
	System.out.println("computer wins");
      
}
}

}
}