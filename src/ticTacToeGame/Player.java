package ticTacToeGame;

public abstract class Player {
    public abstract char getSymbol();
    public abstract int getId();
    public abstract void setSymbol(char symbol);

    public abstract void draw(int index);

    public abstract GameStatus checkGameStatus();
}
