import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class StudentScoreTest {

@Test
public void displayStudentScore() {
StudentScore studentNumbers = new StudentScore();
int[] scores = {{3, 3, 4}, {9, 1, 3}};
int[] expected = {0, 4, 25, 49, 81};
int[] actual = ascendingNumber.studentScore(scores);
assertArrayEquals(expected, actual);
  }

}