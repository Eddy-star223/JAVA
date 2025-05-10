import java.util.Scanner;

public class SumSpecificator {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter specific number: ");
int specific = input.nextInt();

int sum = 0;
int counter = 0;

while (counter <= 50) {
System.out.print("Enter integer number: ");
int number = input.nextInt();
sum += number;
if (sum == specific){
sum = specific;
break;
}
if (sum > specific) {
break;
}
}


System.out.println("Current sum: " + " " + sum);

System.out.println("Specific number exceeded. Final sum: " + sum);
}

}