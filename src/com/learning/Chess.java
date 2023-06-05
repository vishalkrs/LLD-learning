package com.learning;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class Chess extends BoardGame{

    private final ChessPlayer chessPlayer1, chessPlayer2;

    @Override
    public boolean isOver() {
        return  chessPlayer1.getPiece(PieceName.KING).isDead() ||
                chessPlayer2.getPiece(PieceName.KING).isDead();

    }

    public Chess(ChessPlayer chessPlayer1, ChessPlayer chessPlayer2, ChessBoard chessBoard) {
        super(chessBoard, new ArrayDeque<Player>(
                Arrays.asList(chessPlayer1, chessPlayer2)
        ));
        this.chessPlayer1 = chessPlayer1;
        this.chessPlayer2 = chessPlayer2;
        prepareBoard(this.chessPlayer1, this.chessPlayer2, chessBoard);
    }


    private void prepareBoard(ChessPlayer firstPlayer, ChessPlayer secondPlayer, ChessBoard chessBoard) {
       placePawns(1,chessBoard, firstPlayer);
       placePawns(6,chessBoard, secondPlayer);
       placeRooks(0,chessBoard,firstPlayer);
       placeRooks(7,chessBoard,secondPlayer);
       placeKnights(0,chessBoard,firstPlayer);
       placeKnights(7,chessBoard,secondPlayer);
       placeBishops(0,chessBoard,firstPlayer);
       placeBishops(7,chessBoard,secondPlayer);
       placeQueen(0, chessBoard, firstPlayer);
       placeQueen(7,chessBoard,secondPlayer);
       placeKing(0,chessBoard,firstPlayer);
       placeKing(7,chessBoard,secondPlayer);
    }

    private void placePawns(int row, ChessBoard chessBoard, ChessPlayer player) {
        List<PieceName> pieceNames =
                Arrays.asList(PieceName.PAWN1, PieceName.PAWN2,PieceName.PAWN3, PieceName.PAWN4, PieceName.PAWN5, PieceName.PAWN6, PieceName.PAWN7, PieceName.PAWN8);
        int col = 0;
        for(PieceName pieceName : pieceNames) {
            chessBoard.putPiece(player.getPiece(pieceName),row, col++);
        }

    }

    private void placeRooks(int row, ChessBoard chessBoard, ChessPlayer player) {
        chessBoard.putPiece(player.getPiece(PieceName.ROOK1),row,0);
        chessBoard.putPiece(player.getPiece(PieceName.ROOK2),row,7);

    }

    private void placeKnights(int row, ChessBoard chessBoard, ChessPlayer player) {
        chessBoard.putPiece(player.getPiece(PieceName.KNIGHT1),row,1);
        chessBoard.putPiece(player.getPiece(PieceName.KNIGHT2),row,6);

    }

    private void placeBishops(int row, ChessBoard chessBoard, ChessPlayer player) {
        chessBoard.putPiece(player.getPiece(PieceName.BISHOP1),row,2);
        chessBoard.putPiece(player.getPiece(PieceName.BISHOP2),row,5);

    }

    private void placeQueen(int row, ChessBoard chessBoard, ChessPlayer player) {
        chessBoard.putPiece(player.getPiece(PieceName.QUEEN),row,4);

    }

    private void placeKing(int row, ChessBoard chessBoard, ChessPlayer player) {
        chessBoard.putPiece(player.getPiece(PieceName.KING),row,3);
    }






}
