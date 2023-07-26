package mr_chibuzor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CardValidatorTest {
    @Test
    public void testCreditCardNumberCollectorMethod(){
            CardValidator activity = new CardValidator();
            activity.creditCardCollector();
            String expected = "Check the length, Its invalid";
            int actual = activity.getLength();
            assertEquals(expected, actual);
    }
}
