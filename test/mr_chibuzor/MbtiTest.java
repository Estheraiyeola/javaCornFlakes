package mr_chibuzor;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MbtiTest {
    @Test
    public void testThatMethodNameWorks(){
        MBTI activity = new MBTI();
        activity.nameMethod("Esther");
        assertEquals("Esther", activity.getNameMethod());
    }
    @Test
    public void testDisplayMethod(){
        MBTI activity = new MBTI();
        activity.displayMethod();

    }



}