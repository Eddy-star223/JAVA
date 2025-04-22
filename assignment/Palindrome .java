import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

while (true) {
System.out.print("Enter a five-digit integer: ");
String input = scanner.next();

if (input.length() != 5 || !input.matches("\\d+")) {
System.out.println("Error: Input must be a five-digit integer.");
continue;
   
}
            
if (isPalindrome(input)) {
System.out.println(input + " is a palindrome.");
    
} else {
System.out.println(input + " is not a palindrome.");
            
}

            
System.out.print("Do you want to check another number? (yes/no): ");
String response = scanner.next().toLowerCase();
if (response == yes) {
break;
}
}

        
}

public static boolean isPalindrome(String input) {
int left = 0;
int right = input.length() - 1;

while (left < right) {
if (input.charAt(left) != input.charAt(right)) {
return false;
  
}
left++;
right--;
}
return true;
}
}