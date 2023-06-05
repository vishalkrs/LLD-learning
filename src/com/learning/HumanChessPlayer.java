package com.learning;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class HumanChessPlayer extends ChessPlayer{

    public HumanChessPlayer(Map<PieceName, ChessPiece> pieces, ChessBoard chessBoard, String name) {
        super(pieces, chessBoard, name);
    }

    @Override
    public Move makeMove() {
        getChessBoard().Display();
        int x, y;
        Scanner scanner = new Scanner(System.in);
        x= scanner.nextInt(); y = scanner.nextInt();
        Optional<ChessPiece> chessPiece =
              getChessBoard().getCell(new Pair(x,y)).getChessPiece();

        if(!chessPiece.isPresent())
            throw new RuntimeException("Invalid Spot");


        Pair source = new Pair(x,y);

        x= scanner.nextInt(); y = scanner.nextInt();
        Pair destination = new Pair(x,y);
        // validate destinations
        Optional<ChessPiece> destinationChessPiece =
                getChessBoard().getCell(new Pair(x,y)).getChessPiece();

        if(destinationChessPiece.isPresent() && chessPiece.get().getColor() == destinationChessPiece.get().getColor()) {
            throw new RuntimeException("Invalid move as same side's chessPiece Present");
        }

      return new Move(source,destination);

    }
}
