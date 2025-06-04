import java.util.Scanner;

public class EmployeePayroll {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	

while (true) {
    System.out.println("Welcome to Semicolon employees payroll");
    System.out.println("""
=========================================
       1. Add employee payroll
       2. View Employee payroll
       3. Update Employee payroll
       4. Exit
=========================================
          """);	

        System.out.print("Enter input (1-4): ");
	int menuChoice = input.nextInt();

	if (menuChoice == 4) {
        	System.out.println("Exit");
        		break;
}

    while (true) {
	if (menuChoice == 1) {
            System.out.print("Enter employee name: ");
	    String name = input.next();

	    System.out.print("Enter number of hour worked in a week: ");
	    int hourlyWork = input.nextInt();
		
	    System.out.print("Enter hourly pay rate: ");
	    double hourlyPay = input.nextDouble();

	    System.out.print("Enter federal tax withholding rate: ");
	    int federalTax = input.nextInt();

	    System.out.print("Enter State tax withholding rate: ");
	    int stateTax = input.nextInt();

		

	double grossPay = hourlyWork * hourlyPay;
	double federalWithholding =(double) grossPay * federalTax;
	double stateWithholding = grossPay * stateTax;
	double totalDeduction = federalWithholding + stateWithholding;
	double netPay = totalDeduction - grossPay;
	
	System.out.println();
	System.out.println("Employee Name: " + name);
	System.out.println("Hours Worked: " + hourlyWork);
	System.out.println("Pay Rate: $" + hourlyPay );
	System.out.println("Gross Pay: $" + grossPay);
	System.out.println("Dedications:");
	System.out.println("\tfederal Withholding: $" + (federalWithholding * 100) +  federalWithholding);
	System.out.println("\tState Withholding: $" + (stateWithholding * 100) + stateWithholding);
	System.out.println("\tTotal Deduction: $" + totalDeduction);
	System.out.println("Net pay: $" + netPay);
	System.out.println();


 if (menuChoice == 4) {
        System.out.println("Exit");
        break;}
}
			

}
}
}
}