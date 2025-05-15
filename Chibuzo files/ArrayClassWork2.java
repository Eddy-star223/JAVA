public class ArrayClassWork2 {
public static void main(String[] args) {

char[][] wyser = new char[3][3];
wyser[0][0] = 'X';
wyser[0][1] = 'O';
wyser[0][2] = 'X';

wyser[1][0] = 'O';
wyser[1][1] = 'O';
wyser[1][2] = 'O';

wyser[2][0] = 'X';
wyser[2][1] = 'X';
wyser[2][2] = 'O';

for (int counter = 0; counter < wyser.length; counter++){
System.out.println(wyser[counter]);

}

/*
public static String printArray(char[] array) {
for (int counter = 0; counter < char.length; counter++){
printArray(char[counter])
System.out.println(array[i]+ " ");


 public static String printArray(char[] array) {
for (int counter = 0; counter < array.length; counter++){
System.out.println(array[i]+ " ");

*/

}
}