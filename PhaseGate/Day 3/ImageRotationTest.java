import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ImageRotationTest {

@Test
public void rotate() {
ImageRotation rotateNumbers = new ImageRotation();
int[] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
int[] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
int[] actual = rotateNumbers.ImageRotation(numbers);
assertArrayEquals(expected, actual);
  }

}