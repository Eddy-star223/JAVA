import java.util.Arrays;

public class ImageRotation {
//public static int[] rotate(int[][] numbers){
public static void main(String[] args) {


int[][] numbers = {{1, 2, 3},
		   {4, 5, 6}, 
		   {7, 8, 9} };

for (int column = 0; column < numbers.length; column++) {
  for (int row = 0; row < numbers[column].length; row++) {
	
	System.out.println(Arrays.deepToString(numbers));
}
}

}
}
}