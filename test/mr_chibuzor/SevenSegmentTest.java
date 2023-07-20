package mr_chibuzor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SevenSegmentTest {
//    @Test
//    public void testThatTheDisplayGoesOff(){
//        SevenSegment activity = new SevenSegment();
//        activity.setDisplay("11110010");
//        String expected = "Invalid input";
//        assertEquals(expected, activity.getDisplay());
//
//    }
    @Test
//    public  void testThatTheMethodPrintsOne(){
//        SevenSegment activity = new SevenSegment();
//        activity.setDisplay("01100001");
//        String expected = """
//                          #
//                          #
//                          #
//                          #
//                          #
//                """;
//        assertEquals(expected,activity.getDisplay());
//    }
    public  void testThatTheMethodPrintsTwo(){
        SevenSegment activity = new SevenSegment();
        activity.setDisplay("11011011");
        activity.getDisplay();
        String expected = """
                # # # #
                      #
                # # # #
                #     \s
                # # # #""";
        assertEquals(expected,activity.getDisplay());
    }
}
