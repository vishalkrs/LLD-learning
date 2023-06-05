package com.learning;

public class King extends ChessPiece{

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }

    public King(PieceName pieceName, Color color, Boolean isDead) {
        super(color,pieceName,isDead);
    }


}
