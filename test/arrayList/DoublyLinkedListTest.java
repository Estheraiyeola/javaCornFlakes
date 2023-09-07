package arrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {
    private DoublyLinkedList activity;
    @BeforeEach
    public void setUp(){
        activity = new DoublyLinkedList();
    }
    @Test
    public void testThatListIsNotNull(){
        assertNotNull(activity);
    }
    @Test
    public void testThatElementCanBeAddedAtTheHead(){
        activity.insertAtHead("Esther");
        assertEquals("Esther->END", activity.display());
    }
    @Test
    public void testThatMoreElementsCanBeAddedAtTheHead(){
        activity.insertAtHead("Esther");
        activity.insertAtHead("Temitope");
        activity.insertAtHead("Lase");
        assertEquals("Lase->Temitope->Esther->END", activity.display());
    }
    @Test
    public void testThatMoreElementsCanBeAddedAtTheTail(){
        activity.insertAtTail("Esther");
        activity.insertAtTail("Temitope");
        activity.insertAtTail("Lase");
        assertEquals("Esther->Temitope->Lase->END", activity.display());
    }
}
