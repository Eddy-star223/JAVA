import java.util.Scanner;

public class TargetSum {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a target number: ");
int target = scanner.nextInt();

int sum = 0;
int count = 0;

while (sum < target) {
System.out.print("Enter an integer: ");
int num = scanner.nextInt();
sum += num;
count++;
System.out.println("Current sum: " + sum);
        
}

System.out.println("Target reached or exceeded.");
System.out.println("Number of integers entered: " + count);
System.out.println("Final sum: " + sum);

        
 }

}