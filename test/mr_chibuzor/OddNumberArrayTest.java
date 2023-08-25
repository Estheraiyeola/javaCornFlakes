package mr_chibuzor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OddNumberArrayTest {
    private OddNumberArray activity;
    @BeforeEach
    public void setActivity(){
        activity = new OddNumberArray();
    }
    @Test
    public void testThatOddNumbersAreSubtractedFrom(){
        int[] array = {22, 41, 15, 8, 2, 1};
        int[] expected = {39, 13, -1};
        assertArrayEquals(expected, activity.subtractTwoFromOddNumbers(array));
    }
}
