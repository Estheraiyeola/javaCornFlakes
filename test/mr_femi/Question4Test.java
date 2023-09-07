package mr_femi;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question4Test {
    @Test
    public void testThatReverseNumberMethodWorks(){
        Question4 activity = new Question4();
        String result = activity.reverseNumber(12345);
        assertEquals(result, "54321");
    }
}
