package mr_femi;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question1Test {
    @Test
    public void testMultiplyMethod(){
        Question1 activity = new Question1();
        int result = Question1.MultiplyNumbers(2, 5);
        assertEquals(10, result);
    }

    @Test
    public void testThatPowerMethodWorks(){
        Question1 activity = new Question1();
        int result = activity.PowerOfANumber(5, 3);
        assertEquals(125, result);
    }
}
