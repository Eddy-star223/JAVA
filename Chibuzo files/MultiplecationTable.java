public class MultiplecationTable {  
	public static void multiTable(int num1, int num2) {  

	
	System.out.print("\t\t\t");
	for (int counter = num1; counter <= num2; counter++) {
	System.out.printf("%d\t", counter);
	}
	System.out.println();

	for (int counter = num1; counter <= 93; counter++) {
	System.out.print("-");	
	}
	System.out.println(); 


	for (int counter = num1; counter <= num2; counter++) {
	int set = counter;
	
	System.out.print("\t" + counter + "|");
	System.out.print("\t\t");
	
	

	for (int row = num1; row <= num2; row++) {
	System.out.printf("%d\t", row * set); 	
	

	}System.out.println(); 
	
    }
	
}
}