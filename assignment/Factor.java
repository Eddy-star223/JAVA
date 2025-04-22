import java.util.Scanner;

public class Factor {
public static void main(String[] args) { 
Scanner input = new Scanner(System.in);

System.out.print("Enter number: ");
int user = input.nextInt();

        
System.out.println("Factors of " + user + " are:");
for (int i = 1; i <= user; i++) {
if (user % i == 0) {
System.out.println(i);
  
 }
}         

}
  
}