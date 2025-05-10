public class UniqueNumber{

public static int duplicateOf(int [] number) {


for (int i = 0; i < number.length; i++) {
for (int j = i + 1; j < number.length; j++) {
 if (number[i] == number[j]) {
} 

}
}

return number [i];
} 
}