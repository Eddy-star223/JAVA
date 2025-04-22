public class FourPatterns {
    public static void main(String[] args) {

System.out.print("Pattern A");
System.out.println();

for (int i = 1; i <= 6; i++) {
for (int j = 1; j <= i; j++) {

System.out.print("* ");  

}
System.out.println();
}

System.out.println();
System.out.print("Pattern B");
System.out.println();

for (int i = 6; i <= 1; i--) {
for (int j = 1; j <= i; j++) {

System.out.print("* ");  

}

System.out.println();

}

System.out.print("Pattern C");
System.out.println();

for (int k = 1; k <= j; k++) {
for (int j = 1; j <= 6; j++) {

System.out.print("* ");  

}

System.out.println();
}

System.out.print("Pattern D");
System.out.println();

for (int k = 1; k <= j; k++) {
for (int j = 6; j <= 1; j--) {

System.out.print("* ");  

}

System.out.println();
}

}
}