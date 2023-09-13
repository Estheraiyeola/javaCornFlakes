package ticTacToeGame;

public class HumanPlayer extends Player {
    private char symbol;
    private int id;
    private static Board board = new Board();
    HumanPlayer(char symbol, int id){
        this.symbol = symbol;
        this.id = id;
    }
    HumanPlayer(){

    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setSymbol(char symbol) {
        if (symbol == 'X') this.symbol = Symbol.CROSS.returnSymbol();
        else if (symbol == 'O') this.symbol = Symbol.CIRCLE.returnSymbol();
        else throw new IllegalArgumentException("Symbol not available\n Symbol can either be an 'X' or an 'O' ");
    }

    @Override
    public void draw(int index) {
        board.replaceElementAtIndex(this.getSymbol(), index);

    }

    @Override
    public GameStatus checkGameStatus() {
        return board.checkGameStatus();
    }

    public static char getElementAtIndex(int index) {
       return board.getElementAtIndex(index);
    }

}
