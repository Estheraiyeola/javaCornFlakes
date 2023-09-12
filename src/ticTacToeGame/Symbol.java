package ticTacToeGame;

public enum Symbol {
    CROSS('X'),
    CIRCLE('O');

    private char symbol;

    Symbol(char symbol) {
        this.symbol = symbol;
    }


    public char returnSymbol(){
        return symbol;
    }
}
