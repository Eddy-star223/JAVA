public class Occurrences {
public static int occurrenceCount(String word, char a) {

int count = 0;

for (int counter = 0; counter < word.length(); counter++) {
	if (word.charAt(counter) == a) { 
	count++;
}
}
return count;
}
}