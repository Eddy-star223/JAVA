import java.util.Arrays;
public class ArrayKata {

public static int maximumIn(int [] number) {
int maximum = 0;

for (int counter = 0; counter < number.length; counter++) {
if (number[counter] > maximum) {
 maximum = number[counter];
}
}
return maximum;
}

public static int minimumIn(int [] number) {
int minimum = number[0];

for (int counter = 0; counter < number.length; counter++) {
if (number[counter] < minimum) {
 minimum = number[counter];
}
}
return minimum;
}

public static int sumOf(int [] number) {
int sum = 0;

for (int numbers : number) {
sum += numbers;
}
return sum;

}


public static int sumOfEvenNumbersIn(int [] number) {
int sum = 0;

for (int numbers : number) {
if (numbers % 2 == 0){
sum += numbers;
}
}
return sum;

}


public static int sumOfOddNumbersIn(int [] number) {
int sum = 0;

for (int numbers : number) {
if (numbers % 2 != 0){
sum += numbers;
}
}
return sum;

}

public static int[] maximumAndMinimumOf(int[] number) {

int[] b = new int[2];
int maximum = number[0];
int minimum = number[0];
for (int numbers : number) {
if (numbers > maximum) {
maximum = numbers;}

else if (numbers < minimum){
minimum = numbers;
}

}
b[0] = minimum;
b[1] = maximum;
return b;
}


public static int noOfOddNumbersIn(int[] number) {

int noOfOddNumbers = 0;
  
for (int numbers : number) {
if (numbers % 2 == 1) {
noOfOddNumbers++;
}
}
return noOfOddNumbers; 
} 

public static int noOfEvenNumbersIn(int[] number) {

int noOfEvenNumbers = 0;
  
for (int numbers : number) {
if (numbers % 2 == 0) {
noOfEvenNumbers++;
}
}
return noOfEvenNumbers; 
} 


public static String evenNumbersIn(int[] number) {
	int count = 0;
	for(int index = 0; index < number.length;index++){
		if(number[index] % 2 == 0){
			++count;}}

	int[] evenArray = new int[count];

	int counter = 0;

	for(int index = 0; index < number.length; index++){
		if(number[index] % 2 == 0){
			evenArray[counter] = number[index];
			++counter;}} 

	return Arrays.toString(evenArray);}


public static String oddNumbersIn(int[] number) {
	int odd = 0;
for (int count = 0; count < number.length; count++) {
	if (number[count] % 2 != 0) {
	++odd;
}
}

	int[] oddNumber = new int[odd];
	int counting = 0;	

	for (int count = 0; count < number.length; count++) {
	if (number[count] % 2 != 0) {
	oddNumber[counting] = number[count];
	++counting;

	
}	
}

	return Arrays.toString(oddNumber);}

public static int[] squareNumbersIn(int[] number) {

	//int[] squareNumbers = 0;
	int[] num = new int[number.length];
	 
	for (int count = 0; count < number.length; count++) {
	num[count] = num[count] * num[count]; 

}
	return num;

}
	




}



























