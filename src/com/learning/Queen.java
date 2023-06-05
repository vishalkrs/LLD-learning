package com.learning;

public class Queen extends ChessPiece{

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }

    public Queen(PieceName pieceName, Color color, Boolean isDead) {
        super(color,pieceName,isDead);
    }


}
