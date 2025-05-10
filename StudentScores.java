import java.util.Scanner;

public class StudentScores {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);

int number;
int score = 0;
int lowest = 0;
int secondLowest = 0;
int countLowest = 0;
int secondLowestCount = 0;

System.out.print("Enter number: ");
number = input.nextInt();  

for (int i = 0; i <= number; i++) {
System.out.println("Enter student name: ");
String studentName = input.next();

System.out.println("Enter student score: ");
score = input.nextInt();

if (score < secondLowest ) {
secondLowest = score;
++secondLowestCount;
}

else if (score > lowest) {
lowest = score;
++countLowest;
}

System.out.println("The student lowest score is: " + lowest);
System.out.println("The student secondLowest score is: " + secondLowest);


}

}
}