package arrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    private LinkedList activity;
    @BeforeEach
    public void setActivity(){
        activity = new LinkedList();
    }
    @Test
    public void testThatListIsEmpty(){
        assertTrue(activity.isEmpty());
    }
    @Test
    public void testThatElementCanBeAddedToTheList(){
        activity.insertAtHead("Esther");
        String expected = "Esther->END";
        assertEquals(expected, activity.displayList());
    }
    @Test
    public void testThatMoreThanOneElementCanBeAddedToTheList(){
        activity.insertAtHead("Esther");
        activity.insertAtHead("Temitope");
        String expected = "Temitope->Esther->END";
        assertEquals(expected, activity.displayList());
    }
    @Test
    public void testThatElementsCanBeAddedAtTheTailOfTheList(){
        activity.insertAtTail("Esther");
        activity.insertAtTail("Temitope");
        String expected = "Esther->Temitope->END";
        assertEquals(expected, activity.displayList());
    }
    @Test
    public void testThatElementsCanBeAddedAtAParticularIndex(){
        activity.insertAtHead("Esther");
        activity.insertAtHead("Sola");
        activity.insertAtHead("Sade");
        activity.insertAtHead("Temitope");
        activity.insertAtIndex("Pelumi", 2);
        String expected = "Temitope->Sade->Sola->Pelumi->Esther->END";
        assertEquals(expected, activity.displayList());
    }
    @Test
    public void testToRemoveElementAtTheBeginningOfTheList(){
        activity.insertAtHead("Esther");
        activity.insertAtHead("Sola");
        activity.insertAtHead("Sade");
        activity.insertAtHead("Temitope");
        activity.insertAtIndex("Pelumi", 2);
        String element = activity.deleteAtFirst();
        String expected = "Sade->Sola->Pelumi->Esther->END";
        assertEquals("Temitope", element);
        assertEquals(expected, activity.displayList());
    }
    @Test
    public void testToRemoveElementsAtTheEndOfList(){
        activity.insertAtHead("Esther");
        activity.insertAtHead("Sola");
        activity.insertAtHead("Sade");
        activity.insertAtHead("Temitope");
        activity.insertAtIndex("Pelumi", 2);
        String element = activity.deleteAtLast();
        String expected = "Temitope->Sade->Sola->Pelumi->END";
        assertEquals("Esther", element);
        assertEquals(expected, activity.displayList());
    }
    @Test
    public void testToRemoveElementAtAnIndex(){
        activity.insertAtHead("Esther");
        activity.insertAtHead("Sola");
        activity.insertAtHead("Sade");
        activity.insertAtHead("Temitope");
        activity.insertAtIndex("Pelumi", 2);
        String element = activity.deleteAtIndex(2);
        String expected = "Temitope->Sade->Pelumi->Esther->END";
        assertEquals("Sola", element);
        assertEquals(expected, activity.displayList());
    }
    @Test
    public void testToAddElementAtAnIndex() {
        activity.insertAtHead("Esther");
        activity.insertAtHead("Sola");
        activity.insertAtHead("Sade");
        activity.insertAtHead("Temitope");
        activity.insertAtIndex("Pelumi", 2);
        activity.insertAtIndex("Lase",0);
        String expected = "Lase->Temitope->Sade->Sola->Pelumi->Esther->END";
        assertEquals(expected, activity.displayList());
    }
    @Test
    public void testToAddElementAtTheLastIndex() {
        activity.insertAtHead("Esther");
        activity.insertAtHead("Sola");
        activity.insertAtHead("Sade");
        activity.insertAtHead("Temitope");
        activity.insertAtIndex("Pelumi", 2);
        activity.insertAtIndex("Lase",5);
        String expected = "Temitope->Sade->Sola->Pelumi->Esther->Lase->END";
        assertEquals(expected, activity.displayList());
    }
    @Test
    public void testToFindAnElement(){
        activity.insertAtHead("Esther");
        activity.insertAtHead("Sola");
        activity.insertAtHead("Sade");
        activity.insertAtHead("Temitope");
        activity.insertAtIndex("Pelumi", 2);
        String expected = "Temitope->Sade->Sola->Pelumi->Esther->END";
        activity.find("Sola");
        assertEquals(expected, activity.displayList());
    }

}
