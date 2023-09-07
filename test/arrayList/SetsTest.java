package arrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SetsTest {
    private Sets activity;
    @BeforeEach
    public void setUp(){
        activity = new Sets();
    }
    @Test
    public void testThatTheListIsEmpty(){
        assertTrue(activity.isEmpty());
    }
    @Test
    public void testThatListIsNotEmpty(){
        activity.add("Esther");
        assertFalse(activity.isEmpty());
        assertEquals(1, activity.getSize());
    }
    @Test
    public void testThatElementsCanBeRemovedFromTheList(){
        activity.add("Sade");
        activity.add("Esther");
        activity.remove("Sade");
        assertEquals(1,activity.getSize());
    }
    @Test
    public void testThatElementsCanBeGottenFromTheList(){
        Sets activity = new Sets(2);
        activity.add("Sade");
        activity.add("Esther");
        String[] expected = {"Sade", "Esther"};
        String actual = activity.getElements();
        assertEquals(Arrays.toString(expected), actual);
    }
    @Test
    public void testThatElementsCapacityCanBeIncreased(){
        Sets activity = new Sets(2);
        activity.add("Sade");
        activity.add("Esther");
        activity.add("Sola");
        int size = activity.getSize();
        int capacity = activity.getCapacity();
        assertEquals(3, size);
        assertEquals(4, capacity);
    }
    @Test
    public void testThatListHasUniqueElement(){
        Sets activity = new Sets(2);
        activity.add("Sade");
        activity.add("Esther");
        activity.add("Sade");
        int size = activity.getSize();
        int capacity = activity.getCapacity();
        assertEquals(2, size);
        assertEquals(2, capacity);
    }
    @Test
    public void testThatElementsCanBeGotten(){
        Sets activity = new Sets(3);
        activity.add("Sade");
        activity.add("Esther");
        activity.add("Sola");
        int size = activity.getSize();
        int capacity = activity.getCapacity();
        assertEquals(3, size);
        assertEquals(3, capacity);
        Object[] expected = {"Sade", "Esther", "Sola"};
        Object actual = activity.getElements();
        assertEquals(Arrays.toString(expected), actual);
    }
    @Test
    public void testThatTwoSetsCanBeCompared(){
        Object[] firstSet = {"Sade", "Esther", "Sola"};
        Object[] secondSet = {"Sade", "Esther", "Sola"};
        boolean comparison = activity.compare(firstSet, secondSet);
        assertTrue(comparison);
    }
    @Test
    public void testThatTwoSetsCanBeComparedWithoutBeingUnique(){
        Object[] firstSet = {"Sade", "Esther", "Sola"};
        Object[] secondSet = {"Sade", "Esther", "Sola"};
        boolean comparison = activity.compare(firstSet, secondSet);
        assertFalse(comparison);
    }

}
