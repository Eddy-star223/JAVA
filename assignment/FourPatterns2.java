public class FourPatterns2 {
public static void main(String[] args) {

int column;
int row;

int counter = 5;
int counter2 = 0;
 

System.out.print("Pattern A");

System.out.println();
for (column = 0; column <= counter; column++) {
for (row = 0; row <= column; row++) {
int add = row + 1;
System.out.print(add + " ");
}

System.out.println();

}

System.out.print("\nPattern B");

System.out.println();
for (column = 5; column >= counter2; column--) {
for (row = 0; row <= column; row++) {
int add = row + 1;
System.out.print(add + " ");
}

System.out.println();
}

System.out.print("Pattern C");

System.out.println();
for (column = 0; column <= counter; column++) {
for (row = 0; row <= column; row++) {
int add = row + 1;
System.out.print(add + " ");
}

System.out.println();

}


}
}