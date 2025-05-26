import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class AscendingOrderTest2 {

@Test
public void displayAscendingSquare() {
AscendingOrder2 ascendingNumber = new AscendingOrder2();
int[] number = {9, -2, 7, 0, -05};
int[] expected = {0, 4, 25, 49, 81};
int[] actual = ascendingNumber.ascendingSquare(number);
assertArrayEquals(expected, actual);
  }

}