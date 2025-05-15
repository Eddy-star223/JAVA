import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

int number = ;
int counter = 0; 

while (counter <= 5) {

System.out.print("Enter positve number: ");
int user = input.nextInt();
if (user % 2 == Math.sqrt(number)) {
System.out.println(number + " Is a prime number");
} else {
System.out.println(number + " Is not a prime number");
counter++;
}

}
}
}