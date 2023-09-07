package deitel_package.chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultiplesTest {
    @Test
    public void testThatMethodIsMultipleWorks(){
        Multiples activity = new Multiples();
        boolean isMultiple = activity.isMultiple(6, 2);
        assertTrue(isMultiple);
    }
}
