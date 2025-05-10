import java.util.Scanner;

public class NumberOccurence {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int largest = Integer.MIN_VALUE;
int count = 0;

System.out.println("Enter integers (0 to stop):");

while (true) {
int num = scanner.nextInt();

if (num == 0) {
break;
}

if (num > largest) {
num = largest;
count = 1;
} else if (num == largest) {
count++;
}
}

if (largest >= Integer.MIN_VALUE) {
System.out.println("Largest number: " + largest);
System.out.println("Occurrences: " + count);
} else {
System.out.println("No numbers entered.");
        
}

        
  }
}
