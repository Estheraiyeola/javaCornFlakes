package arrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest{
    private ArrayList activity;
    @BeforeEach
    public void setUp(){
        activity = new ArrayList();
    }
    @Test
    public void testThatArrayListObjectExists(){
        assertNotNull(activity);
    }
    @Test
    public void testThatTheArrayListIsEmpty(){
        boolean isEmpty = activity.isEmpty();
        assertTrue(isEmpty);
    }
    @Test
    public void testThatElementsCanBeAddedToTheArrayList(){
        activity.add("Esther");
        boolean isEmpty = activity.isEmpty();
        assertFalse(isEmpty);
    }
    @Test
    public void testThatTwoElementsCanBeAddedToTheList(){
        activity.add("Esther");
        activity.add("Pelumi");
        int size = activity.getSize();
        assertEquals(2, size);
    }
    @Test
    public void testThatElementsCanBeRemoved(){
        activity.add("Esther");
        activity.add("Pelumi");
        activity.remove("Pelumi");
        int size = activity.getSize();
        assertEquals(1, size);
    }

    @Test
    public void testGetCapacityMethod(){
        ArrayList activity = new ArrayList(2);
        activity.add("Esther");
        activity.add("Pelumi");
        int size = activity.getSize();
        assertEquals(2, size);
        int capacity = activity.getCapacity();
        assertEquals(2, capacity);
    }

    @Test
    public void testGetCapacityMethodWithoutAConstructor(){
        ArrayList activity = new ArrayList();
        activity.add("Esther");
        activity.add("Pelumi");
        int size = activity.getSize();
        assertEquals(2, size);
        int capacity = activity.getCapacity();
        assertEquals(16, capacity);
    }
    @Test
    public void testTheAddMethodWithoutInitialCapacity(){
        ArrayList activity = new ArrayList();
        activity.add("Esther");
        activity.add("Pelumi");
        int size = activity.getSize();
        assertEquals(2, size);
        activity.add("Temitope");
        activity.add("Lase");
        size = activity.getSize();
        assertEquals(4, size);
        int capacity = activity.getCapacity();
        assertEquals(16, capacity);
    }
    @Test
    public void testTheAddMethodWithInitialCapacity(){
        ArrayList activity = new ArrayList(2);
        activity.add("Esther");
        activity.add("Pelumi");
        int size = activity.getSize();
        int capacity = activity.getCapacity();
        assertEquals(2, size);
        assertEquals(2, capacity);
        activity.add("Temitope");
        size = activity.getSize();
        assertEquals(3, size);
        capacity = activity.getCapacity();
        assertEquals(4, capacity);
    }
    @Test
    public void testTheAddMethodWithInitialCapacityAndMoreElements(){
        ArrayList activity = new ArrayList(3);
        activity.add("Esther");
        activity.add("Pelumi");
        int size = activity.getSize();
        int capacity = activity.getCapacity();
        assertEquals(2, size);
        assertEquals(3, capacity);
        activity.add("Temitope");
        activity.add("Lase");
        size = activity.getSize();
        assertEquals(4, size);
        capacity = activity.getCapacity();
        assertEquals(6, capacity);
    }

    @Test
    public void testThatReturnsTheContentOfTheListAtAParticuarIndex(){
        activity.add("Esther");
        activity.add("Pelumi");
        activity.add("Temitope");
        activity.add("Lase");
        String element = activity.getElement(2);
        assertEquals("Temitope", element);

    }

    @Test
    public void testThatReturnsTheContentOfTheList(){
        ArrayList activity = new ArrayList(5);
        activity.add("Esther");
        activity.add("Pelumi");
        activity.add("Temitope");
        activity.add("Lase");
        String elements = activity.getElementsInTheList();
        String[] expected = {"Esther", "Pelumi", "Temitope", "Lase", null};
        assertEquals(Arrays.toString(expected), elements);

    }
    @Test
    public void testThatAddsElementsAtAnIndex(){
        ArrayList activity = new ArrayList(2);
        activity.add("Esther");
        activity.add("Pelumi");
        activity.add("Temitope");
        activity.add("Lase", 1);
        String[] expected = {"Esther", "Lase", "Pelumi", "Temitope"};
        assertSame(expected, activity.getElementsInTheList());
    }

    @Test
    public void testThatElementsCanBeRemovedFromTheList(){
        ArrayList activity = new ArrayList(2);
        activity.add("Esther");
        activity.add("Pelumi");
        activity.add("Temitope");
        activity.remove("Esther");
        assertEquals(2, activity.getSize());
        String[] expected = {"Pelumi", "Temitope"};
        assertEquals(Arrays.toString(expected), activity.getElementsInTheList());
    }



}
