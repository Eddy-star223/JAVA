public class AccountWithdraws {

private String name;
private double balance;

public AccountWithdraws(String name, double balance) {
this.name = name;

if (balance > 0.0) {
this.balance = balance;

}
}
public void SetName(String name) {
this.name = name;
}

public String getName() {
return name;
}

public void withdraw(double withdrawAmount) {
if ( withdrawAmount > balance) {
balance = withdrawAmount - balance;
}
}

public double getBalance() {
return balance;
}                                                                                                                                             


}
