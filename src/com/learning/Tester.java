package com.learning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
       ChessBoard chessBoard = new ChessBoard();
       ChessPlayer firstPlayer = new HumanChessPlayer(getPieces(Color.WHITE), chessBoard, "VISHAL");
       ChessPlayer secondPlayer = new HumanChessPlayer(getPieces(Color.BLACK), chessBoard, "Krsna");
       BoardGame chessBoardGame = new Chess(firstPlayer, secondPlayer, chessBoard);
       chessBoardGame.startGame();

    }


    private static Map<PieceName, ChessPiece> getPieces(Color color) {
        Map<PieceName, ChessPiece> pieces = new HashMap<>();
        pieces.put(PieceName.BISHOP1, new Bishop(PieceName.BISHOP1, color, false));
        pieces.put(PieceName.BISHOP2, new Bishop(PieceName.BISHOP2, color, false));
        pieces.put(PieceName.ROOK1, new Rook(PieceName.ROOK1, color, false));
        pieces.put(PieceName.ROOK2, new Rook(PieceName.ROOK2, color, false));
        pieces.put(PieceName.KNIGHT1, new Knight(PieceName.KNIGHT1, color, false));
        pieces.put(PieceName.KNIGHT2, new Knight(PieceName.KNIGHT2, color, false));
        pieces.put(PieceName.KING, new King(PieceName.KING, color, false));
        pieces.put(PieceName.QUEEN, new Queen(PieceName.QUEEN, color, false));

        List<PieceName> pieceNames =
                Arrays.asList(PieceName.PAWN1, PieceName.PAWN2,PieceName.PAWN3, PieceName.PAWN4, PieceName.PAWN5, PieceName.PAWN6, PieceName.PAWN7, PieceName.PAWN8);

        for(PieceName pieceName: pieceNames) {
         pieces.put(pieceName,new Pawn(pieceName, color, false));
        }
        return pieces;
    }


}
