public class FactorNumbers {

public static int[] factor(int[] number) {

int count = 0;

for (int counter = 1; counter <= number; counter++) {
if(number % counter == 0) {
count++;

  }
}
return number[counter];

 }
}
