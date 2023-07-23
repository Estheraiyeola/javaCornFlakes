package mr_chibuzor;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static junit.framework.TestCase.assertEquals;

public class MbtiTest {
    private MBTI activity;
    @BeforeEach
    public void setUp(){
        activity = new MBTI();
    }
    @Test
    public void testThatMethodNameWorks(){
        activity.nameMethod("Esther");
        assertEquals("Esther", activity.getNameMethod());
    }
    @Test
    public void testDisplayMethod(){
        activity.displayMethod();

    }

}