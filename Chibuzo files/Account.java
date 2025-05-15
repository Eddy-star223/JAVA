 // Account class with a double instance variable balance and a constructor
 // and deposit method that perform validation.

public class Account {
private String name; // instance variable
private double balance; // instance variable

// Account contructor that receives two parameters
public Account(String name) {
this.name = name; // assign name to instance variable name

// validate that the balance is greater than 0.0; if it's not,
// instance variable balance keeps its default initial value of 0.0
if (balance > 0.0) { // if the balance is valid
   this.balance = balance; // assign it to instance variable balance
  }
}

// method that deposits (add) only a valid amount to the balance
public void Deposits(double depositsAmount) {
if (depositsAmount > 0.0) { // if the depositsAmount is valid
balance = balance + depositsAmount; // add it to the balance 

  }
}

// Method that returns account balance
public double getBalance() {
   return balance;
}

// method that sets name
public void setName(String name) {
   this.name = name;
}

// Method that returns name
public String getName() {
   return name;
  }
}