package ticTacToeGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ticTacToeGame.GameStatus.FIRST_PLAYER_WON;

public class BoardTest {
    private Board activity;
    @BeforeEach
    public void setUp(){
        activity = new Board();
    }
    @Test
    public void testThatBoardSizeIsNine(){
        assertEquals(9, activity.getSize());
    }
    @Test
    public void testThatElementsCanBeReplaced(){
        activity.replaceElementAtIndex('X', 1);
        assertEquals('X', activity.getElementAtIndex(1));
    }
    @Test
    public void testThatElementsCannotBeReplacedWhenTheElementIs_X_Or_O(){
        activity.replaceElementAtIndex('X', 1);
        assertEquals('X', activity.getElementAtIndex(1));
        activity.replaceElementAtIndex('O', 2);
        assertEquals('O', activity.getElementAtIndex(2));
        assertThrows(IllegalArgumentException.class, ()-> activity.replaceElementAtIndex('X', 2));
    }

    @Test
    public void testThatBoardCanDetermineItsWinner_InTheFirstColumn(){
        activity.replaceElementAtIndex('X', 1);
        assertEquals('X', activity.getElementAtIndex(1));
        activity.replaceElementAtIndex('O',5 );
        assertEquals('O', activity.getElementAtIndex(5));
        activity.replaceElementAtIndex('X', 4);
        assertEquals('X', activity.getElementAtIndex(4));
        activity.replaceElementAtIndex('O',3 );
        assertEquals('O', activity.getElementAtIndex(3));
        activity.replaceElementAtIndex('X', 7);
        assertEquals('X', activity.getElementAtIndex(7));
        assertEquals(FIRST_PLAYER_WON, activity.checkGameStatus());
    }
    @Test
    public void testThatBoardCanDetermineItsWinner_InTheSecondColumn(){
        activity.replaceElementAtIndex('X', 2);
        assertEquals('X', activity.getElementAtIndex(2));
        activity.replaceElementAtIndex('O',3 );
        assertEquals('O', activity.getElementAtIndex(3));
        activity.replaceElementAtIndex('X', 5);
        assertEquals('X', activity.getElementAtIndex(5));
        activity.replaceElementAtIndex('O',4 );
        assertEquals('O', activity.getElementAtIndex(4));
        activity.replaceElementAtIndex('X', 8);
        assertEquals('X', activity.getElementAtIndex(8));
        assertEquals(FIRST_PLAYER_WON, activity.checkGameStatus());
    }
    @Test
    public void testThatBoardCanDetermineItsWinner_InTheThirdColumn(){
        activity.replaceElementAtIndex('X', 3);
        assertEquals('X', activity.getElementAtIndex(3));
        activity.replaceElementAtIndex('O',4 );
        assertEquals('O', activity.getElementAtIndex(4));
        activity.replaceElementAtIndex('X', 6);
        assertEquals('X', activity.getElementAtIndex(6));
        activity.replaceElementAtIndex('O',2 );
        assertEquals('O', activity.getElementAtIndex(2));
        activity.replaceElementAtIndex('X', 9);
        assertEquals('X', activity.getElementAtIndex(9));
        assertEquals(FIRST_PLAYER_WON, activity.checkGameStatus());
    }
    @Test
    public void testThatBoardCanDetermineItsWinner_InTheFirstRow(){
        activity.replaceElementAtIndex('X', 1);
        assertEquals('X', activity.getElementAtIndex(1));
        activity.replaceElementAtIndex('O',4 );
        assertEquals('O', activity.getElementAtIndex(4));
        activity.replaceElementAtIndex('X', 2);
        assertEquals('X', activity.getElementAtIndex(2));
        activity.replaceElementAtIndex('O',6 );
        assertEquals('O', activity.getElementAtIndex(6));
        activity.replaceElementAtIndex('X', 3);
        assertEquals('X', activity.getElementAtIndex(3));
        assertEquals(FIRST_PLAYER_WON, activity.checkGameStatus());
    }
    @Test
    public void testThatBoardCanDetermineItsWinner_InTheSecondRow(){
        activity.replaceElementAtIndex('X', 4);
        assertEquals('X', activity.getElementAtIndex(4));
        activity.replaceElementAtIndex('O',1 );
        assertEquals('O', activity.getElementAtIndex(1));
        activity.replaceElementAtIndex('X', 5);
        assertEquals('X', activity.getElementAtIndex(5));
        activity.replaceElementAtIndex('O',3 );
        assertEquals('O', activity.getElementAtIndex(3));
        activity.replaceElementAtIndex('X', 6);
        assertEquals('X', activity.getElementAtIndex(6));
        assertEquals(FIRST_PLAYER_WON, activity.checkGameStatus());
    }
    @Test
    public void testThatBoardCanDetermineItsWinner_InTheThirdRow(){
        activity.replaceElementAtIndex('X', 7);
        assertEquals('X', activity.getElementAtIndex(7));
        activity.replaceElementAtIndex('O',4 );
        assertEquals('O', activity.getElementAtIndex(4));
        activity.replaceElementAtIndex('X', 8);
        assertEquals('X', activity.getElementAtIndex(8));
        activity.replaceElementAtIndex('O',6 );
        assertEquals('O', activity.getElementAtIndex(6));
        activity.replaceElementAtIndex('X', 9);
        assertEquals('X', activity.getElementAtIndex(9));
        assertEquals(FIRST_PLAYER_WON, activity.checkGameStatus());
    }
    @Test
    public void testThatBoardCanDetermineItsWinner_InTheDiagonalComingFromTheLeft(){
        activity.replaceElementAtIndex('X', 1);
        assertEquals('X', activity.getElementAtIndex(1));
        activity.replaceElementAtIndex('O',4 );
        assertEquals('O', activity.getElementAtIndex(4));
        activity.replaceElementAtIndex('X', 5);
        assertEquals('X', activity.getElementAtIndex(5));
        activity.replaceElementAtIndex('O',6 );
        assertEquals('O', activity.getElementAtIndex(6));
        activity.replaceElementAtIndex('X', 9);
        assertEquals('X', activity.getElementAtIndex(9));
        assertEquals(FIRST_PLAYER_WON, activity.checkGameStatus());
    }
    @Test
    public void testThatBoardCanDetermineItsWinner_InTheDiagonalComingFromTheRight(){
        activity.replaceElementAtIndex('X', 3);
        assertEquals('X', activity.getElementAtIndex(3));
        activity.replaceElementAtIndex('O',4 );
        assertEquals('O', activity.getElementAtIndex(4));
        activity.replaceElementAtIndex('X', 5);
        assertEquals('X', activity.getElementAtIndex(5));
        activity.replaceElementAtIndex('O',6 );
        assertEquals('O', activity.getElementAtIndex(6));
        activity.replaceElementAtIndex('X', 7);
        assertEquals('X', activity.getElementAtIndex(7));
        assertEquals(FIRST_PLAYER_WON, activity.checkGameStatus());
    }
}
