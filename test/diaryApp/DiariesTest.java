package diaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {

    private Diaries activity;
    @BeforeEach
    public void setActivity(){
        activity = new Diaries();
    }
    @Test
    public void testThatListOfDiariesIsEmpty(){
        assertTrue(activity.isEmpty());
    }
    @Test
    public void testThatADiaryCanBeAddedToAListOfDiaries(){
        activity.add("Esther", "Password");
        assertEquals(1, activity.getSize());
        activity.add("Sola", "Password");
        assertEquals(2, activity.getSize());
    }
    @Test
    public void testThatADiaryCanBeFoundInAListOfDiariesByUsingTheUsername(){
        activity.add("Esther", "Password");
        assertEquals(1, activity.getSize());
        activity.add("Sola", "Password");
        assertEquals(2, activity.getSize());
        assertEquals("Esther",activity.findByUsername("Esther").getUsername());
    }
    @Test
    public void testThatADiaryCanBeDeletedFromAListOfDiariesByUsingTheUsername(){
        activity.add("Esther", "Password");
        assertEquals(1, activity.getSize());
        activity.add("Sola", "Password");
        assertEquals(2, activity.getSize());
        activity.delete("Esther", "Password");
        assertThrows(IllegalArgumentException.class, ()-> activity.findByUsername("Esther"));
        assertEquals(1,activity.getSize());
    }
    @Test
    public void testThatListOfDiariesHasUniqueUsernames(){
        activity.add("Esther", "Password");
        assertEquals(1, activity.getSize());
        activity.add("Sola", "Password");
        assertEquals(2, activity.getSize());
        assertThrows(IllegalArgumentException.class, ()->activity.add("Esther", "Password"));

    }
}
