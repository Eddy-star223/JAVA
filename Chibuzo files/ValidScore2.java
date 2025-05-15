
import java.util.Scanner;

public class ValidScore2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int gradeA = 0;
int gradeB = 0;
int gradeC = 0;
int gradeD = 0;
int gradeF = 0;
int count = 0;
int valid = 0;
int invalid = 0;

while (valid != 10) {
System.out.print("Enter number 0-100: ");
int score = input.nextInt();
if (score >= 0 && score <= 100) {
switch (score / 10) {
case 8: 
case 9:
case 10:
System.out.println("A");
gradeA++; break;

case 7: System.out.println("B"); gradeB++; break;

case 6: System.out.println("C"); gradeC++; break;

case 5: System.out.println("D"); gradeD++; break;

case 4:
case 3:
case 2:
case 1:
default: System.out.println("F"); gradeF++; break;
}
valid ++;
}

if (score < 0 || score > 100) {
System.out.println("This is an invalid number");
invalid ++;
}

}
System.out.println("Total number of gradeA student: " + gradeA);
System.out.println("Total number of gradeB student: " + gradeB);
System.out.println("Total number of gradeC student: " + gradeC);
System.out.println("Total number of gradeD student: " + gradeD);
System.out.println("Total number of gradeF student: " + gradeF);
System.out.println("Total number of invalid number is: " + invalid);
}
}

