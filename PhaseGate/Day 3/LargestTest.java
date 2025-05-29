import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class LargestTest {

@Test
public void largestNumber() {
Largest lagestNumber = new Largest();
int[] number = {1,5,3,4,5,5};
int[] expected = {1};
int[] actual = occurrenceLetter.Occurrences(number);
assertArrayEquals(expected, actual);
  }

}