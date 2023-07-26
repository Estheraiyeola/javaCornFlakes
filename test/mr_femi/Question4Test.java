package mr_femi;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Question4Test {
    @Test
    public void testThatReverseNumberMethodWorks(){
        Question4 activity = new Question4();
        String result = activity.reverseNumber(12345);
        assertEquals(result, result);
    }
}
