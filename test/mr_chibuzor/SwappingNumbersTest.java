package mr_chibuzor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SwappingNumbersTest {
    private SwappingNumbers activity;

    @BeforeEach
    public void setActivity(){
        activity = new SwappingNumbers();
    }
    @Test
    public void testThatObjectIsNotNull(){
        assertNotNull(activity);
    }
    @Test
    public void testThatArrayIsNotEmpty(){
        int[] array = {1, 2, 3, 4, 5, 6};
        assertFalse(activity.isEmpty(array));
    }
    @Test
    public void testThatEvenNumbersSwapPlacesWithOddNumbers(){
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 1, 4, 3, 6, 5};
        assertArrayEquals(expected, activity.swapEvenNumbers(array));
    }
    @Test
    public void testThatNumbersCanBeSwapped(){
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {2, 1, 4, 3, 6, 5, 7};
        assertArrayEquals(expected, activity.swapEvenNumbers(array));
    }
    @Test
    public void testThatOddNumbersCanBeSwapped(){
        int[] array = {45, 52, 11, 33, 48, 25};
        int[] expected = {45, 52, 33, 11, 48, 25};
        assertArrayEquals(expected, activity.swapOddNumbers(array));

    }
    @Test
    public void swapFirstWithTheLast(){
        int[] array = {45, 52, 11, 33, 48, 25};
        int[] expected = {25, 48, 33, 11, 52, 45};
        assertArrayEquals(expected, activity.swapFirstWithLast(array));

    }
}
