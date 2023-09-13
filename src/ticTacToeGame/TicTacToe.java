package ticTacToeGame;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;
import static ticTacToeGame.GameStatus.FIRST_PLAYER_WON;
import static ticTacToeGame.GameStatus.SECOND_PLAYER_WON;

public class TicTacToe {
    private static Scanner input = new Scanner(System.in);
    private static Board board;
    private static String userInput;
    private static Player player1;
    private static Player player2;



    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        System.out.println("""
                =======================================
                ||          THE  TIC TAC TOE GAME    ||
                ========================================
                Welcome to the Tic Tac Toe Game
                """);
        System.out.println();
        System.out.println();
        selectPlayerMode();
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
        if (userInput.equals("2")){
            System.out.println("Not yet deployed!!!\nComing soon");
            selectPlayerMode();
        }
        else {
            System.out.println("Invalid Input");
            selectPlayerMode();
        }
    }

    private static void selectHumanPlayer() {
        player1 = new HumanPlayer();
        player2 = new HumanPlayer();
        System.out.println("""
                ===========================================
                            SELECT A SYMBOL
                ===========================================
                """);
        System.out.println("""
                Note that Symbol can Only be an 'X' or an 'O'
                """);
        try {
            System.out.println("Player1 select your symbol");
            String userInput1 = input.next();
            player1.setSymbol(userInput1.charAt(0));
            System.out.println("Player2 select your symbol");
            String userInput2 = input.next();
            player2.setSymbol(userInput2.charAt(0));
            playGame();
        }catch (IllegalArgumentException e){
            System.out.println();
            System.out.println("Symbol not available\nSymbol can either be an 'X' or an 'O' ");
            System.out.println();
            selectHumanPlayer();
        }

    }
    public static void playGame(){
        board = new Board();
        board.printBoard();
        playerOnePlays();
        playerTwoPlays();
        while (player1.checkGameStatus() != FIRST_PLAYER_WON || player2.checkGameStatus() != SECOND_PLAYER_WON){
            playerOnePlays();
            if (player1.checkGameStatus() == FIRST_PLAYER_WON ){
                System.out.println(player1.checkGameStatus());
                break;
            }
            playerTwoPlays();
            if (player2.checkGameStatus() == SECOND_PLAYER_WON ){
                System.out.println(player2.checkGameStatus());
                break;
            }
        }
        System.out.println("Do you want to play again? ");
        userInput = input.next();
        if (userInput.equalsIgnoreCase("yes")){
            selectPlayerMode();
        }
        else {
            System.out.println("Bye");
            exit(0);
        }

    }

    private static void playerTwoPlays() {
        try {
            System.out.println("Player2, Enter your position, from 1-9");
            int userInput = input.nextInt();
            player2.draw(userInput);
        }catch (InputMismatchException | IllegalArgumentException e){
            System.out.println();
            System.out.println("Invalid Input");
            System.out.println();
            playerTwoPlays();
        }

    }

    private static void playerOnePlays() {
        try {
            System.out.println("Player1, Enter your position, from 1-9");
            int userInput = input.nextInt();
            player1.draw(userInput);
        }catch (InputMismatchException | IllegalArgumentException e){
            System.out.println();
            System.out.println("Invalid Input");
            System.out.println();
            playerOnePlays();
        }
    }
}
