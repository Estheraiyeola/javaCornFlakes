package diaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary activity;
    @BeforeEach
    public void setActivity(){
        activity = new Diary("Esther", "Password");
    }
    @Test
    public void testThatUserCanLockDiary(){
        activity.lockDiary();
        assertTrue(activity.isLocked());
    }
    @Test
    public void testThatUserCanUnlockDiary(){
        activity.lockDiary();
        assertTrue(activity.isLocked());
        activity.unlockDiary();
        assertFalse(activity.isLocked());
    }
    @Test
    public void testThatUserCanCreateEntries(){
        activity.createEntry("First Day", "I am coding");
        assertEquals(new Entry(1, "First Day", "I am coding").getId(), activity.findEntry(1).getId());
        assertEquals(1, activity.getSize());

    }
    @Test
    public void testThatUserCanDeleteEntry() {
        activity.createEntry("First Day", "I am coding");
        assertEquals(new Entry(1, "First Day", "I am coding").getId(), activity.findEntry(1).getId());
        activity.createEntry("Second Day", "I am reading");
        assertEquals(new Entry(2, "Second Day", "I am reading").getId(), activity.findEntry(2).getId());
        activity.deleteEntry(2);
        assertThrows(IllegalArgumentException.class, () -> activity.findEntry(2));
        assertEquals(1, activity.getSize());
    }
    @Test
    public void testThatUserCanUpdateEntry(){
        activity.createEntry("First Day", "I am coding");
        assertEquals(new Entry(1, "First Day", "I am coding").getId(), activity.findEntry(1).getId());
        activity.updateEntry(1, " Girl", " with music in my hears");
        assertEquals(new Entry(1, "First Day Girl", "I am coding with music in my hears").getEntry(), activity.findEntry(1).getEntry());
        assertEquals(1, activity.getSize());
        System.out.println(activity.findEntry(1).getEntry());
    }

}
