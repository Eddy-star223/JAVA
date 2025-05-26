public class AscendingOrder2 {

public static int[] ascendingSquare(int[] number) {
for (int count = 0; count < number.length; count++){

number[count] = number[count] * number[count];
}
for (int count = 0; count < number.length - 1; count++) {
  for (int counter = 0; counter < number.length - 1 - count; counter++) {

    if (number[counter] > number[counter + 1]) {
	int temp = number[counter];
	  number[counter] = number[counter + 1];
	    number[counter + 1] = temp;
  }

}

}

return number;

   }
}