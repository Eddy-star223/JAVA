import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter five integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        
        int largest = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        int smallest = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5))));

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

        
        System.out.print("Enter an integer to check divisibility by 3: ");
        int value = input.nextInt();
        if (value % 3 == 0) {
            System.out.println(value + " is divisible by 3.");
        } else {
            System.out.println(value + " is not divisible by 3.");
        }
    }
}
