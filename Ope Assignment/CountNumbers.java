import java.util.Scanner;

public class CountNumbers {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int positive = 0;
int negative = 0;
int total = 0;
double average = 0;
int counter = 1;

while (counter != 10000) {
System.out.print("Enter unspecified integer and enter 0 to end: ");
int unspecified = input.nextInt();

if (unspecified == 0) {
break;
}


if (unspecified >= 1) {
positive++; 
} 

if (unspecified <= -1) {
negative++;
}

total = total + unspecified;

if (counter > 0) {
average = (double) total / counter;
}

counter ++;
} 

System.out.println("the number of positives is: " + positive);
System.out.println("the number of negatives is: " + negative);
System.out.println("the total number is: " + total);
System.out.println("the average is: " + average);






}

}