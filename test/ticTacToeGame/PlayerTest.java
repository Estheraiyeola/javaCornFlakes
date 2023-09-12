package ticTacToeGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ticTacToeGame.GameStatus.FIRST_PLAYER_WON;
import static ticTacToeGame.GameStatus.SECOND_PLAYER_WON;

public class PlayerTest {
    private Player player1;
    private Player player2;
    private Board board;
    private GameStatus status;
    @BeforeEach
    public void setActivity(){
        player1 = new HumanPlayer();
        player2 = new HumanPlayer();
        board = new Board();
    }
    @Test
    public void testThatPlayerHasASymbol(){
        player1.setSymbol('X');
        assertEquals('X', player1.getSymbol());
        player2.setSymbol('O');
        assertEquals('O', player2.getSymbol());
    }
    @Test
    public void testThatPlayerCanDraw(){
        player1.setSymbol('X');
        assertEquals('X', player1.getSymbol());
        player2.setSymbol('O');
        assertEquals('O', player2.getSymbol());

        player1.draw(3);
        assertEquals('X', HumanPlayer.getElementAtIndex(3));
        player2.draw(4);
        assertEquals('O', HumanPlayer.getElementAtIndex(4));

        player1.draw(6);
        assertEquals('X', HumanPlayer.getElementAtIndex(6));
        player2.draw(5);
        assertEquals('O', HumanPlayer.getElementAtIndex(5));

        player1.draw(9);
        assertEquals('X', HumanPlayer.getElementAtIndex(9));

        assertEquals(FIRST_PLAYER_WON, player2.checkGameStatus());
    }
}
