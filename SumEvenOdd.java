import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
               System.out.println("Enter a set of integers: ");
	int even = 0;
        int odd = 0;

            int a = input.nextInt();
            int b = input.nextInt();	
	    int c = input.nextInt();
            int d = input.nextInt();

            if (a % 2 == 0) {
                even= even+ a;
            }

            if (b % 2 == 0) {
                even= even + b;   
            }
 
	    if (c % 2 == 0) {
                even= even + c;   
            } 
	
            if (d % 2 == 0) {
                even= even + d;   
            }
		
            if (a % 2 != 0) {
		odd = odd + a;                
            }
            
            if (b % 2 != 0) {
               odd = odd + b;
            }
            
            if (c % 2 != 0) {
               odd = odd + c;
            }

            if (d % 2 != 0) {
               odd = odd + d;
            }
        
        System.out.println("Sum of even integers: " + even);
        System.out.println("Sum of odd integers: " + odd);
    }
}
