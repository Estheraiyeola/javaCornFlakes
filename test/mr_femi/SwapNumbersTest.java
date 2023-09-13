package mr_femi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwapNumbersTest {
    @Test
    public void testThatSwapMethodWorks(){
        SwapNumbers activity = new SwapNumbers();
        int[] arrays = {2,4,6,8,10};
        int[] arrays2 = {10,4,6,8,2};
        assertArrayEquals(arrays2, activity.mrFemi(arrays,0, 4));
    }
}
