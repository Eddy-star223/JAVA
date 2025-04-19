// Account class that contains a name instance variable
// and methods to set and get its value

public class Account {
private String name; // instance variable

// method to set the name in the object
public void setName(String name) {
this.name(); //store the name
}

// method to retrieve the name from the object
public String getName() {
return name; // return value of name to caller
  }
}


// Creating and manipulating an account object
import java.util.Scanner;

public class AccountTest {
public static void main(String[] agrs) {
// create a scanner object to obtain input from the command window
Scanner input = new Scanner(system.in);

// create an account object and assign it to myAccount
Account myAccount = new Account();

// display initial value of (null)
System.out.printf("Initial name is:%s%n%n" , myAccount.getName());

// prompt for and read name
System.out.println("Please enter the name:");
String theName = input.nextLine(); // read a line of text
myAccount.setName(theName); // put thename in myAccount
System.out.println(); // output a blank line

// display the name stored in object myAccount
System.out.printf("Name stored in object myAccount is:%n%s%n" ,
myAcccount.getName());
  }
}













  



   