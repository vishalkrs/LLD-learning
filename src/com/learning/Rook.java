package com.learning;

public class Rook extends ChessPiece{

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }

    public Rook(PieceName pieceName, Color color, Boolean isDead) {
        super(color,pieceName,isDead);
    }


}
