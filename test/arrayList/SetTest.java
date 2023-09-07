package arrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private ArrayList activity;
    @BeforeEach
    public void setUp(){
        activity = new Set();
    }

    @Test
    public void testThatListIsEmpty(){
        assertTrue(activity.isEmpty());
    }

    @Test
    public void testThatListIsNotEmpty(){
        activity.add("Esther");
        assertFalse(activity.isEmpty());
    }
    @Test
    public void testThatListIsUnique(){
        Set activity = new Set(2);
        activity.add("Esther");
        activity.add("Esther");
        String expected = Arrays.toString(new String[]{"Esther", null});
        assertEquals(expected, activity.getElementsInTheList());
        assertEquals(1, activity.getSize());
    }

    @Test
    public void testThatListIsUniqueByIncreasingTheSizeOfTheList(){
        Set activity = new Set(1);
        activity.add("Esther");
        activity.add("Sola");
        activity.add("Sade");
        activity.add("Sade");
        String expected = Arrays.toString(new String[]{"Esther", "Sola", "Sade", null});
        assertEquals(expected, activity.getElementsInTheList());
        assertEquals(3, activity.getSize());
    }
}
