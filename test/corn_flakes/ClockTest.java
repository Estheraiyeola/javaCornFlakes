package corn_flakes;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    @Test
    public void testThatTheSetSecondMethodWorks(){
        Clock activity = new Clock();
        activity.setSecond(720);

        assertEquals(0, activity.getSecond());
        assertEquals(12, activity.getMinute());
        assertEquals(0, activity.getHour());
    }
    @Test
    public void testThatTheSetMinuteMethodWorks(){
        Clock activity = new Clock();
        activity.setMinute(805);

        assertEquals(0, activity.getSecond());
        assertEquals(25, activity.getMinute());
        assertEquals(13, activity.getHour());
    }

    @Test
    public void testThatTheHourMethodWorks(){
        Clock activity = new Clock();

        activity.setMinute(120);

        assertEquals(0, activity.getSecond());
        assertEquals(0, activity.getMinute());
        assertEquals(2, activity.getHour());
    }
    @Test
    public void testThatSecondsMethodDoesNotCollectNegativeValues(){
        Clock activity = new Clock();
        activity.setSecond(-500);

        assertEquals(0, activity.getSecond());
        assertEquals(0, activity.getMinute());
        assertEquals(0, activity.getHour());
    }

    @Test
    public void testThatMinuteMethodDoesNotCollectNegativeValues(){
        Clock activity = new Clock();
        activity.setMinute(-500);

        assertEquals(0, activity.getSecond());
        assertEquals(0, activity.getMinute());
        assertEquals(0, activity.getHour());
    }

    @Test
    public void testThatHourMethodDoesNotCollectNegativeValues(){
        Clock activity = new Clock();
        activity.setHour(-4);

        assertEquals(0, activity.getSecond());
        assertEquals(0, activity.getMinute());
        assertEquals(0, activity.getHour());
    }
}
