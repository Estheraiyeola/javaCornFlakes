package corn_flakes;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CornFlakes7Test {
    @Test
    public void factorialTest(){
        CornFlakes7 activity = new CornFlakes7();
        int one = activity.factorial(-1);
        assertEquals(0, one);
    }
}
