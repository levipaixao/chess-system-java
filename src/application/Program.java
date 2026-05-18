package application;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<ChessPiece> captured = new ArrayList<>();

        ChessMatch chessMatch = new ChessMatch();
        while (!chessMatch.getCheckMate()) {
            try {

                UI.clearScreen(); // serve para limpar o terminal
                UI.printMatch(chessMatch, captured);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(input);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source); //Pintar os movimentos possiveis da peça
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);
                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(input);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
                if (capturedPiece != null){
                    captured.add(capturedPiece);
                }
                if (chessMatch.getPromoted() != null){
                    System.out.print("Enter piece for promotion (B/N/Q/R): ");
                    String type = input.nextLine().toUpperCase();
                    while (!type.equals("B") && !type.equals("N") && !type.equals("R") & !type.equals("Q")) {
                        System.out.print("Invalid value! Enter piece for promotion (B/N/R/Q): ");
                        type = input.nextLine().toUpperCase();
                    }                    chessMatch.replacePromotedPiece(type);
                }
            }
            catch (ChessException | InputMismatchException e){
                System.out.println(e.getMessage());
                input.nextLine();
            }
        }
        UI.clearScreen();
        UI.printMatch(chessMatch,captured);
    }
}