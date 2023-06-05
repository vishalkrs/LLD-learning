package com.learning;

public class Pawn extends ChessPiece{

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }

    public Pawn(PieceName pieceName, Color color, Boolean isDead) {
        super(color,pieceName,isDead);
    }


}
