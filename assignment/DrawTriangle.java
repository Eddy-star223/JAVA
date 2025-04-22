import java.util.Scanner;

public class DrawTriangle {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter length of base of the triangle (1-10): ");
int baseLength = scanner.nextInt();

while (baseLength < 1 || baseLength > 10) {
System.out.print("Invalid input.  Enter a number between 1 and 10: ");
baseLength = scanner.nextInt();
        
}

        
for (int i = 1; i <= baseLength; i++) {
for (int j = 1; j <= i; j++) {
System.out.print("* ");
            
}
 System.out.println();
        
}

        
  }
}
