package mr_femi;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class NewSwapTest {
    @Test
    public void testThatSwapMethodWorks(){
        NewSwap swap = new NewSwap();
        int[] array = {5, 2, 6, 10, 9, 3};
        int[] expected = {5, 2, 9, 10, 6, 3};
        assertArrayEquals(expected, swap.swapMethod(array, 2, 4));
    }
    @Test
    public void testThatTheIsogramMethodWorksForLowerCase(){
        NewSwap isogram = new NewSwap();
        String text = "a b c d e f g h i j k l m n o p q r s t u v w x y z a , &\\ ";
        assertTrue(isogram.checkTextForIsogram(text));
    }
    @Test
    public void testThatTheIsogramMethodWorksForUpperCase(){
        NewSwap isogram = new NewSwap();
        String text = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        assertTrue(isogram.checkTextForIsogram(text));
    }
}
