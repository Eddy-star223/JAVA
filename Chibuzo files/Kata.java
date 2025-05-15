public class Kata {

public static Boolean isEven(int number) {
return (number % 2 == 0);
}

public static Boolean isPrime(int number) {
Math.sqrt(number);
return (number % 2 == 0);
}

public static int subtract(int number1, int number2) {
if (number1 > number2) 
return number1 - number2;
else
    return number2 - number1;

}

public static float division(float number1, float number2) {

if (number2 == 0) 

return (0);

else 
    return number1 / number2;

}

public static int factorOf(int number) {
int counter = 0;
for (int i = 1; i <= number; i++) {
if(number % i == 0) {
counter++;
}
}
return counter;

}

public static Boolean isSquare(int number) {
int square = (int) Math.sqrt(number);
return square * square == number;
}

public static Boolean isPalindrome(int number) {
int a = (number / 10000) % 10;
int b = (number / 1000) % 10;
int c = (number / 100) % 10;
int d = (number / 10) % 10;
int e = number % 10;
return (a == e);
}

public static long factorialOf(long number) {
long factorial = 1;
for (long count = 1; count <= number; count++) {
factorial *= count;
}
return factorial;
}

public static int squareOf(int number) {
return (number * number);
}




}