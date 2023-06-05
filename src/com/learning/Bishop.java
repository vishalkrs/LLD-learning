package com.learning;

public class Bishop extends ChessPiece{

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }

    public Bishop(PieceName pieceName, Color color, Boolean isDead) {
        super(color,pieceName,isDead);
    }


}
