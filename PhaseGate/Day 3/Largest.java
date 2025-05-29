public class Largest {

	public static int largest(int[] array) {
	
	int largest = array[0];
	int temp = 0;

	for (int counter = 0; counter < array.length; counter++) {
		if(array[counter] > largest && largest != array[counter]){
		largest = array[counter];
		 temp = counter;
} 

}
return counter;

}
}