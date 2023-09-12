package ticTacToeGame;

public class Board {
    private char[] board = new char[]{'.','.','.','.','.','.','.','.','.'};
    private GameStatus X_IsWon = GameStatus.FIRST_PLAYER_WON;
    private GameStatus O_IsWon = GameStatus.SECOND_PLAYER_WON;


    public int getSize() {
        return board.length;
    }

    public void replaceElementAtIndex(char playersLetter, int index) {
        if (board[index -1] != 'X' && board[index-1] != 'O'){
            board[index - 1] = playersLetter;
            printBoard();
        }
        else throw new IllegalArgumentException("Space has been taken by a symbol");
    }

    public char getElementAtIndex(int index) {
        return this.board[index-1];
    }
    public GameStatus checkGameStatus(){
        if (board[0] == 'X' && board[3] == 'X'&& board[6] == 'X'){
            return X_IsWon;
        }
        if (board[0] == 'O' && board[3] == 'O'&& board[6] == 'O'){
            return O_IsWon;
        }
        if (board[1] == 'X' && board[4] == 'X'&& board[7] == 'X'){
            return X_IsWon;
        }
        if (board[1] == 'O' && board[4] == 'O'&& board[7] == 'O'){
            return O_IsWon;
        }
        if (board[2] == 'X' && board[5] == 'X'&& board[8] == 'X'){
            return X_IsWon;
        }
        if (board[2] == 'O' && board[5] == 'O'&& board[8] == 'O'){
            return O_IsWon;
        }
        if (board[0] == 'X' && board[1] == 'X'&& board[2] == 'X'){
            return X_IsWon;
        }
        if (board[0] == 'O' && board[1] == 'O'&& board[2] == 'O'){
            return O_IsWon;
        }
        if (board[3] == 'X' && board[4] == 'X'&& board[5] == 'X'){
            return X_IsWon;
        }
        if (board[3] == 'O' && board[4] == 'O'&& board[5] == 'O'){
            return O_IsWon;
        }
        if (board[6] == 'X' && board[7] == 'X'&& board[8] == 'X'){
            return X_IsWon;
        }
        if (board[6] == 'O' && board[7] == 'O'&& board[8] == 'O'){
            return O_IsWon;
        }
        if (board[0] == 'X' && board[4] == 'X'&& board[8] == 'X'){
            return X_IsWon;
        }
        if (board[0] == 'O' && board[4] == 'O'&& board[8] == 'O'){
            return O_IsWon;
        }
        if (board[2] == 'X' && board[4] == 'X'&& board[6] == 'X'){
            return X_IsWon;
        }
        if (board[2] == 'O' && board[4] == 'O'&& board[6] == 'O'){
            return O_IsWon;
        }
        return GameStatus.IN_PROGRESS;
    }

    public void printBoard(){
        System.out.printf("""
                |   %c  |   %c  |   %c  |
                |   %c  |   %c  |   %c  |
                |   %c  |   %c  |   %c  |
                """,
                board[0], board[1], board[2],
                board[3], board[4], board[5],
                board[6], board[7], board[8]);
        System.out.println();
    }

}
