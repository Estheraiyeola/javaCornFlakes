package dietelChapter5Test;

import dietelChapter5.MinimumAndMaximum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinimumAndMaximumTest {
    private MinimumAndMaximum activity;
    @BeforeEach
    public void setActivity(){
        activity = new MinimumAndMaximum();
    }
    @Test
    public void testThatUserCanAddNumber(){
        activity.numberOfInputs(5);
        activity.add(10);
        int[] expected = {10};
        assertArrayEquals(expected, activity.getArray());
    }
//    @Test
//    public void testThatUserCanAddNumbers(){
//        activity.numberOfInputs(5);
//        activity.add(10);
//        activity.add(20);
//        activity.add(30);
//        activity.add(40);
//        activity.add(50);
//        List<Integer> expected = new ArrayList<>();
//        expected = 10, 20, 30, 40, 50;
//        assertArrayEquals(expected, activity.getArray());
//    }
}
