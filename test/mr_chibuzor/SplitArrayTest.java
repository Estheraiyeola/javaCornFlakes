package mr_chibuzor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitArrayTest {
    private SplitArray activity;
    @BeforeEach
    public void setActivity(){
        activity = new SplitArray();
    }
    @Test
    public void testThatElementsInAnArrayIsSplit(){
        int[] array = {23, 45, 60, 38};
        int[] expected = {2, 3, 4, 5, 6, 0, 3, 8};
        assertArrayEquals(expected, activity.splitArray(array));
    }
    @Test
    public void testThatElementsExpandWhenOneIsAdded(){
        int[] array = {9, 9, 9};
        int[] expected = {1, 0, 0, 0};
        assertArrayEquals(expected, activity.addOneToSumOfElements(array));
    }
}
