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

int add;
for (column = 1; column <= 6; column++) {
add = column;

if (add == 1) {
System.out.print("					");
}else if (add == 2){
System.out.print("				");
}else if (add == 3) {
System.out.print("			");
}else if (add == 4) {
System.out.print("		");
}else if (add == 5) {
System.out.print("	");
}
else if (add == 6) {
System.out.print("");
}

for (row = 0; row < column; row++) {
System.out.printf("%d	", add--);
}

System.out.println();

}



}
}
