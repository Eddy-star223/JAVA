public class semicolonBankAtm {

	static String accountHolder = "User";
	static double balance = 1000;
	static double withdrawal = 50000;
	static double charges = 100;
    
    static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            	balance -= amount;
	    System.out.println(amount + " withdrawn. New balance: " + balance);
	    	balance -= charges;
	    System.out.print(charges + " was withdrawn " + amount );
           
        } else {
            System.out.println("Insufficient funds");
        }
    }

    
		
	static void checkBalance() {
        	System.out.println("Account Holder: " + accountHolder);
       	 System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        
        deposit(400);
        withdraw(800);
        checkBalance();

    }
}