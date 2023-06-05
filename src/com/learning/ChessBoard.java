package com.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChessBoard implements Board{

    private final List<List<ChessCell>> cells;
    private static  final int rowCount = 8;
    private static final int colCount = 8;


    @Override
    public void Display() {
       for(int row = 0; row<rowCount; row++) {
           for(int col =0; col<colCount; col++) {
               Pair p = new Pair(row,col);

               Optional<ChessPiece> chessPiece = this.getCell(p).getChessPiece();
               if(!chessPiece.isPresent()) {
                   System.out.print("0    |   ");
               } else {
                   System.out.print(chessPiece.get().getName()
                           + " | ");
               }

           }
           System.out.println();
       }
    }

    @Override
    public void applyMove(Move move) {
        ChessCell sourceCell = getCell(move.getSource());
        ChessCell destinationCell = getCell(move.getDestination());
        ChessPiece chessPiece = sourceCell.getChessPiece().get();

        System.out.println("chessPiece present" + chessPiece.getName());

        chessPiece.move(sourceCell,destinationCell, this);

    }

    public ChessBoard() {
       this.cells = new ArrayList<>();
       for(int i = 0; i< rowCount; i++) {
           List<ChessCell> chessCells = new ArrayList<>();
           for (int j = 0; j < colCount; j++) {
               chessCells.add(new ChessCell(i, j));
           }
           this.cells.add(chessCells);
       }
    }

    public ChessCell getCell(Pair pair) {
        return this.cells.get(pair.getX()).get(pair.getY());
    }

    public void putPiece(ChessPiece chessPiece,int row, int col) {
        getCell(new Pair(row, col)).setChessPiece(Optional.ofNullable(chessPiece));
    }

    public void removePiece(int row, int col) {
        getCell(new Pair(row, col)).setChessPiece(Optional.empty());
    }
}
