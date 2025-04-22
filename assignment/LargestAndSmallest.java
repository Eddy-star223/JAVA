import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

int largest = 0;
int smallest = 0;
 

int counter = 0;

while (counter <= 5) {
System.out.print("Enter number: ");
int num = input.nextInt();

if (num > largest) {
largest++;
}

if (num > smallest) {
smallest--;
}
counter++;
}

System.out.println("Largest number: " + largest);
System.out.println("Smallest number: " + smallest);

 





}
}