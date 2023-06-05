package com.learning;

import java.util.Map;

public abstract class ChessPlayer extends  Player{

  private final Map<PieceName, ChessPiece> pieces;

  private final ChessBoard chessBoard;

    public ChessPlayer( Map<PieceName, ChessPiece> pieces, ChessBoard chessBoard, String name) {
        super(name);
        this.pieces = pieces;
        this.chessBoard = chessBoard;
    }

    public ChessPiece getPiece(PieceName pieceName) {
      if(!pieces.containsKey(pieceName)) {
        throw new IllegalArgumentException(("invalid arg"));
      }
      return this.pieces.get(pieceName);
  }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public Map<PieceName, ChessPiece> getPieces() {
        return pieces;
    }
}
