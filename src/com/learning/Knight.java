package com.learning;

import java.util.Optional;

public class Knight extends ChessPiece{

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {
        //check first valid move
       int  xCoordinateDiff = Math.abs(source.getX()- destination.getX());
       int  yCoordinateDiff = Math.abs(destination.getY() - source.getY());

        System.out.println("xCoorinateDiff:  +" + xCoordinateDiff);
        System.out.println("yCoorinateDiff:  +" + yCoordinateDiff);
        if (!(Math.max(xCoordinateDiff,yCoordinateDiff) == 2 && Math.min(xCoordinateDiff,yCoordinateDiff)==1)) {
            throw new RuntimeException("Wrong move bhai");
        }

        Optional<ChessPiece> destinationChessPiece = destination.getChessPiece();
        Optional<ChessPiece> sourceChessPiece = source.getChessPiece();
        if (destinationChessPiece.isPresent() && sourceChessPiece.get().getColor() == destinationChessPiece.get().getColor()) {
            throw new RuntimeException("It's your own piece , how can you kill it");
        }

        if(destinationChessPiece.isPresent()) {
            destinationChessPiece.get().setDead(true);
            chessBoard.removePiece(destination.getX(),destination.getY());
        }

        chessBoard.removePiece(source.getX(), source.getY());
        chessBoard.putPiece(sourceChessPiece.get(), destination.getX(), destination.getY());

    }

    public Knight(PieceName pieceName, Color color, Boolean isDead) {
        super(color,pieceName,isDead);
    }


}
