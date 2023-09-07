package deitel_package.chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HypotenuseCalculationsTest {
    @Test
    public  void testThatTheMethodHypotenuseWorks(){
        HypotenuseCalculations activity = new HypotenuseCalculations();
        double hypotenuse = activity.hypotenuse(3.0, 4.0);
        assertEquals(5.0, hypotenuse);

    }

    @Test
    public void  testThatMethodHypotenuseWorksAgain(){
        HypotenuseCalculations activity = new HypotenuseCalculations();
        double hypotenuse = activity.hypotenuse(5.0, 12.0);
        assertEquals(13, hypotenuse);
    }

    @Test
    public void testThatMethodHypotenuseWorksAgainAndAgain(){
        HypotenuseCalculations activity = new HypotenuseCalculations();
        double hypotenuse = HypotenuseCalculations.hypotenuse(8.0, 15.0);
        assertEquals(17, hypotenuse);
    }

}
