package corn_flakes;

import corn_flakes.MinuteSecond;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class MinutesSecondTest {
    @Test
    public void testThatTheMethodWorks(){
        MinuteSecond activity = new MinuteSecond();
        activity.setMinute1(Integer.parseInt("6000"));
        assertEquals(120, activity.getSecond());
    }

    @Test
    public void testThatTheMethodDoesNotCollectNegativeNumbers(){
        MinuteSecond activity = new MinuteSecond();
        activity.setMinute1(-5);
        assertEquals(0, activity.getSecond());
    }

    @Test
    public void testThatTheMethodGetsTheDays(){
        MinuteSecond activity = new MinuteSecond();
        activity.setMinutes2(2880);
        assertEquals(2, activity.getDays());
    }

    @Test
    public void testThatTheMethodDoesNotGetNegativeDays(){
        MinuteSecond activity = new MinuteSecond();
        activity.setMinutes2(-2330);
        assertEquals(0, activity.getDays());
    }

    @Test
    public void testThatTheMethodGetsTheYears(){
        MinuteSecond activity = new MinuteSecond();
        activity.setMinute3(1_000_000_000);
        assertEquals(2, activity.getYears());
    }

    @Test
    public  void testThatTheMethodDoesNotTakenegativeValues(){
        MinuteSecond activity = new MinuteSecond();
        activity.setMinute3(-1051200);
        assertEquals(0, activity.getYears());
    }
}
