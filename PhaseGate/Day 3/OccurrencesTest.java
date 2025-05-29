import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OccurrencesTest {

@Test

public void numberOfOccurrence() {
Occurrences occurrenceLetter = new Occurrences();
String word = "Hello World";
char a = 'o';
int expected = 2;
int actual = occurrenceLetter.occurrenceCount(word, a);
assertEquals(expected, actual);
  }

}