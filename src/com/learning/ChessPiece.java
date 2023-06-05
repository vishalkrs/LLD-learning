package com.learning;

public abstract class ChessPiece {

    private final Color color;
    private final PieceName pieceName;
    private boolean isDead;


    public abstract void move(ChessCell source, ChessCell destination, ChessBoard chessBoard);

    public boolean isDead() {
        return this.isDead;
    }

    public  void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    public  PieceName getName() {
        return this.pieceName;
    }

    public Color getColor() {
        return this.color;
    }

    public ChessPiece(Color color, PieceName pieceName, boolean isDead) {
        this.color = color;
        this.pieceName = pieceName;
        this.isDead = isDead;
    }
}
