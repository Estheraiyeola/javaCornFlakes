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
}
