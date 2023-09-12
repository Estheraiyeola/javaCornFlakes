package ticTacToeGame;

import java.util.Scanner;

import static ticTacToeGame.GameStatus.FIRST_PLAYER_WON;
import static ticTacToeGame.GameStatus.SECOND_PLAYER_WON;

public class TicTacToe {
    private static Scanner input = new Scanner(System.in);
    private static Board board = new Board();
    private static String userInput;
    private static Player player1 = new HumanPlayer();
    private static Player player2 = new HumanPlayer();



    public static void main(String[] args) {
        mainMenu();
        selectPlayerMode();
    }

    private static void mainMenu() {
        System.out.println("""
                =======================================
                          THE  TIC TAC TOE GAME
                ========================================
                """);
    }

    public static void selectPlayerMode(){
        System.out.println("""
                =========================================
                            PLAYER MODE
                =========================================
                MODES
                1. Human Player
                2. Play with Computer
                """);
        userInput = input.next();
        if (userInput.equals("1")) selectHumanPlayer();
    }

    private static void selectHumanPlayer() {
        System.out.println("""
                Note that Symbol can Only be an 'X' or an 'O'
                """);
        System.out.println("Player1 select your symbol");
        userInput = input.next();
        player1.setSymbol(userInput.charAt(0));
        System.out.println("Player2 select your symbol");
        userInput = input.next();
        player2.setSymbol(userInput.charAt(0));

    }
    public static void playGame(){
        while (board.checkGameStatus() != FIRST_PLAYER_WON || board.checkGameStatus() != SECOND_PLAYER_WON){

        }
    }
}
