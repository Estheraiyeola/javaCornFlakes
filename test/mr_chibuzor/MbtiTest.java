package mr_chibuzor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class MbtiTest {
    private MBTI activity;
    @BeforeEach
    public void setUp(){
        activity = new MBTI();
    }
    @Test
    public void testThatMethodNameWorks(){
        activity.nameMethod();
        Assertions.assertEquals("Esther", activity.getNameMethod());
    }
    @Test
    public void testDisplayMethod(){
        activity.displayMethod();

    }
    @Test
    public void  testStringCollectorMethod(){
        String[] personality = new String[]{"I", "N", "F", "P"};
        String actual = activity.collectLettersToMakeUpPersonality(personality);
        String expected = """
                A Mediator (INFP) is someone who possesses the Introverted, Intuitive, Feeling, and Prospecting personality traits. 
                These rare personality types tend to be quiet, open-minded, and imaginative, and they apply a caring and creative approach to everything they do.
                Although they may seem quiet or unassuming, Mediators (INFPs) have vibrant, passionate inner lives. 
                Creative and imaginative, they happily lose themselves in daydreams, inventing all sorts of stories and conversations in their minds. 
                These personalities are known for their sensitivity – Mediators can have profound emotional responses to music, art, nature, and the people around them.               
                Idealistic and empathetic, Mediators long for deep, soulful relationships, and they feel called to help others. 
                But because this personality type makes up such a small portion of the population, Mediators may sometimes feel lonely or invisible, adrift in a world that doesn’t seem to appreciate the traits that make them unique.
                """;
        Assertions.assertEquals(expected, actual);
    }

}