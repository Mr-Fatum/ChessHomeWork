import java.util.ArrayList;
import java.util.HashMap;

public class Boards {

    public static HashMap<Coordinate, Piece> getChessBoard() {

        HashMap<Coordinate, Piece> pieces = new HashMap<>();

        int pawnBRank = 7;
        int bRank = 8;
        int pawnWRank = 2;
        int wRank = 1;

        //________________________________________________Black Pawns________________________________________________

        Pawn pawnBa = new Pawn(COLOUR.B, new Coordinate('a', pawnBRank));
        Pawn pawnBb = new Pawn(COLOUR.B, new Coordinate('b', pawnBRank));
        Pawn pawnBc = new Pawn(COLOUR.B, new Coordinate('c', pawnBRank));
        Pawn pawnBd = new Pawn(COLOUR.B, new Coordinate('d', pawnBRank));
        Pawn pawnBe = new Pawn(COLOUR.B, new Coordinate('e', pawnBRank));
        Pawn pawnBf = new Pawn(COLOUR.B, new Coordinate('f', pawnBRank));
        Pawn pawnBg = new Pawn(COLOUR.B, new Coordinate('g', pawnBRank));
        Pawn pawnBh = new Pawn(COLOUR.B, new Coordinate('h', pawnBRank));

        //________________________________________________Black Rooks________________________________________________

        Rook rookBa = new Rook(COLOUR.B, new Coordinate('a', bRank));
        Rook rookBh = new Rook(COLOUR.B, new Coordinate('h', bRank));

        //________________________________________________Black Knights________________________________________________

        Knight knightBb = new Knight(COLOUR.B, new Coordinate('b', bRank));
        Knight knightBg = new Knight(COLOUR.B, new Coordinate('g', bRank));

        //________________________________________________Black Bishops________________________________________________

        Bishop bishopBc = new Bishop(COLOUR.B, new Coordinate('c', bRank));
        Bishop bishopBf = new Bishop(COLOUR.B, new Coordinate('f', bRank));

        //________________________________________________Black Queen________________________________________________

        Queen queenB = new Queen(COLOUR.B, new Coordinate('d', bRank));

        //________________________________________________Black King________________________________________________

        King kingB = new King(COLOUR.B, new Coordinate('e', bRank));

        //________________________________________________White Pawns________________________________________________

        Pawn pawnWa = new Pawn(COLOUR.W, new Coordinate('a', pawnWRank));
        Pawn pawnWb = new Pawn(COLOUR.W, new Coordinate('b', pawnWRank));
        Pawn pawnWc = new Pawn(COLOUR.W, new Coordinate('c', pawnWRank));
        Pawn pawnWd = new Pawn(COLOUR.W, new Coordinate('d', pawnWRank));
        Pawn pawnWe = new Pawn(COLOUR.W, new Coordinate('e', pawnWRank));
        Pawn pawnWf = new Pawn(COLOUR.W, new Coordinate('f', pawnWRank));
        Pawn pawnWg = new Pawn(COLOUR.W, new Coordinate('g', pawnWRank));
        Pawn pawnWh = new Pawn(COLOUR.W, new Coordinate('h', pawnWRank));

        //________________________________________________White Rooks_______________________________________________

        Rook rookWa = new Rook(COLOUR.W, new Coordinate('a', wRank));
        Rook rookWh = new Rook(COLOUR.W, new Coordinate('h', wRank));

        //________________________________________________White Knights_____________________________________________

        Knight knightWb = new Knight(COLOUR.W, new Coordinate('b', wRank));
        Knight knightWg = new Knight(COLOUR.W, new Coordinate('g', wRank));

        //________________________________________________White Bishops_____________________________________________

        Bishop bishopWc = new Bishop(COLOUR.W, new Coordinate('c', wRank));
        Bishop bishopWf = new Bishop(COLOUR.W, new Coordinate('f', wRank));

        //________________________________________________White Queen_______________________________________________

        Queen queenW = new Queen(COLOUR.W, new Coordinate('d', wRank));

        //________________________________________________White King________________________________________________

        King kingW = new King(COLOUR.W, new Coordinate('e', wRank));

        //________________________________________________Place Black in HashMap____________________________________

        pieces.put(pawnBa.getCoords(), pawnBa);
        pieces.put(pawnBb.getCoords(), pawnBb);
        pieces.put(pawnBc.getCoords(), pawnBc);
        pieces.put(pawnBd.getCoords(), pawnBd);
        pieces.put(pawnBe.getCoords(), pawnBe);
        pieces.put(pawnBf.getCoords(), pawnBf);
        pieces.put(pawnBg.getCoords(), pawnBg);
        pieces.put(pawnBh.getCoords(), pawnBh);

        pieces.put(rookBa.getCoords(), rookBa);
        pieces.put(rookBh.getCoords(), rookBh);

        pieces.put(knightBb.getCoords(), knightBb);
        pieces.put(knightBg.getCoords(), knightBg);

        pieces.put(bishopBc.getCoords(), bishopBc);
        pieces.put(bishopBf.getCoords(), bishopBf);

        pieces.put(queenB.getCoords(), queenB);

        pieces.put(kingB.getCoords(), kingB);

        //________________________________________________Place White in HashMap____________________________________

        pieces.put(pawnWa.getCoords(), pawnWa);
        pieces.put(pawnWb.getCoords(), pawnWb);
        pieces.put(pawnWc.getCoords(), pawnWc);
        pieces.put(pawnWd.getCoords(), pawnWd);
        pieces.put(pawnWe.getCoords(), pawnWe);
        pieces.put(pawnWf.getCoords(), pawnWf);
        pieces.put(pawnWg.getCoords(), pawnWg);
        pieces.put(pawnWh.getCoords(), pawnWh);

        pieces.put(rookWa.getCoords(), rookWa);
        pieces.put(rookWh.getCoords(), rookWh);

        pieces.put(knightWb.getCoords(), knightWb);
        pieces.put(knightWg.getCoords(), knightWg);

        pieces.put(bishopWc.getCoords(), bishopWc);
        pieces.put(bishopWf.getCoords(), bishopWf);

        pieces.put(queenW.getCoords(), queenW);

        pieces.put(kingW.getCoords(), kingW);

        return pieces;
    }

    public static HashMap<Coordinate, Piece> getTestBoard() {

        HashMap<Coordinate, Piece> pieces = new HashMap<>();

        int pawnBRank = 7;
        int bRank = 8;
        int pawnWRank = 2;
        int wRank = 1;

        //________________________________________________Black ____________________________________________________

        Pawn pawnB = new Pawn(COLOUR.B, new Coordinate('g', pawnBRank));

        //________________________________________________Black Rooks_______________________________________________

        Rook rookB = new Rook(COLOUR.B, new Coordinate('a', bRank));

        //________________________________________________Black Knights_____________________________________________

        Knight knightB = new Knight(COLOUR.B, new Coordinate('h', 7));

        //________________________________________________Black Bishops_____________________________________________


        //________________________________________________Black Queen_______________________________________________

        Queen queenB = new Queen(COLOUR.B, new Coordinate('d', bRank));

        //________________________________________________White Pawns_______________________________________________

        Pawn pawnWe = new Pawn(COLOUR.W, new Coordinate('e', pawnWRank));
        Pawn pawnWh = new Pawn(COLOUR.W, new Coordinate('h', pawnWRank));

        //________________________________________________White Rooks_______________________________________________

        Rook rookWa = new Rook(COLOUR.W, new Coordinate('a', wRank));
        Rook rookWh = new Rook(COLOUR.W, new Coordinate('h', wRank));


        //________________________________________________White Bishops_____________________________________________

        Bishop bishopW = new Bishop(COLOUR.W, new Coordinate('f', 6));

        //________________________________________________White Queen_______________________________________________

        Queen queenW = new Queen(COLOUR.W, new Coordinate('g', 5));

        //________________________________________________White King________________________________________________

        King kingW = new King(COLOUR.W, new Coordinate('e', wRank));

        //________________________________________________Place Black in HashMap____________________________________


        pieces.put(pawnB.getCoords(), pawnB);

        pieces.put(rookB.getCoords(), rookB);

        pieces.put(knightB.getCoords(), knightB);

        pieces.put(queenB.getCoords(), queenB);

        //________________________________________________Place White in HashMap____________________________________

        pieces.put(pawnWe.getCoords(), pawnWe);
        pieces.put(pawnWh.getCoords(), pawnWh);

        pieces.put(rookWa.getCoords(), rookWa);
        pieces.put(rookWh.getCoords(), rookWh);

        pieces.put(bishopW.getCoords(), bishopW);

        pieces.put(queenW.getCoords(), queenW);

        pieces.put(kingW.getCoords(), kingW);

        return pieces;
    }

    public static HashMap<Coordinate, Piece> getCheckIngBoard() {
        HashMap<Coordinate, Piece> pieces = new HashMap<>();

        int pawnBRank = 7;
        int bRank = 8;
        int pawnWRank = 2;
        int wRank = 1;

        //________________________________________________Black Pawns_______________________________________________

        Pawn pawnB = new Pawn(COLOUR.B, new Coordinate('g', pawnBRank));

        //________________________________________________Black Rooks_______________________________________________

        Rook rookBh = new Rook(COLOUR.B, new Coordinate('h', bRank));
        Rook rookB = new Rook(COLOUR.B, new Coordinate('a', bRank));

        //________________________________________________Black Knights_____________________________________________

        Knight knightB = new Knight(COLOUR.B, new Coordinate('h', 7));

        //________________________________________________Black Bishops_____________________________________________


        //________________________________________________Black Queen_______________________________________________

        Queen queenB = new Queen(COLOUR.B, new Coordinate('d', bRank));

        //________________________________________________Black King________________________________________________

        King kingB = new King(COLOUR.B, new Coordinate('e', bRank));

        //________________________________________________White Pawns_______________________________________________

        Pawn pawnWe = new Pawn(COLOUR.W, new Coordinate('e', pawnWRank));
        Pawn pawnWh = new Pawn(COLOUR.W, new Coordinate('h', pawnWRank));

        //________________________________________________White Rooks_______________________________________________

        Rook rookWa = new Rook(COLOUR.W, new Coordinate('a', wRank));
        Rook rookWh = new Rook(COLOUR.W, new Coordinate('h', wRank));

        //________________________________________________White Knights_____________________________________________

        //________________________________________________White Bishops_____________________________________________

        Bishop bishopW = new Bishop(COLOUR.W, new Coordinate('f', 6));

        //________________________________________________White Queen_______________________________________________

        Queen queenW = new Queen(COLOUR.W, new Coordinate('g', 5));

        //________________________________________________White King________________________________________________

        King kingW = new King(COLOUR.W, new Coordinate('e', wRank));

        //________________________________________________Place Black in HashMap____________________________________


        pieces.put(pawnB.getCoords(), pawnB);

        pieces.put(rookB.getCoords(), rookB);
        pieces.put(rookBh.getCoords(), rookBh);

        pieces.put(knightB.getCoords(), knightB);

        pieces.put(queenB.getCoords(), queenB);

        pieces.put(kingB.getCoords(), kingB);

        //________________________________________________Place White in HashMap____________________________________

        pieces.put(pawnWe.getCoords(), pawnWe);
        pieces.put(pawnWh.getCoords(), pawnWh);

        pieces.put(rookWa.getCoords(), rookWa);
        pieces.put(rookWh.getCoords(), rookWh);

        pieces.put(bishopW.getCoords(), bishopW);

        pieces.put(queenW.getCoords(), queenW);

        pieces.put(kingW.getCoords(), kingW);

        return pieces;
    }

    public static HashMap<Coordinate, Piece> getPromotingBoard() {
        HashMap<Coordinate, Piece> pieces = new HashMap<>();

        int pawnBRank = 7;
        int bRank = 8;
        int pawnWRank = 2;
        int wRank = 1;

        //________________________________________________Black Pawns_______________________________________________

        Pawn pawnW = new Pawn(COLOUR.W, new Coordinate('g', pawnBRank));
        Pawn pawnB = new Pawn(COLOUR.B, new Coordinate('b', pawnWRank));

        //________________________________________________Black Rooks_______________________________________________

        Rook rookBh = new Rook(COLOUR.B, new Coordinate('h', bRank));
        Rook rookB = new Rook(COLOUR.B, new Coordinate('a', bRank));

        //________________________________________________Black Knights_____________________________________________

        Knight knightB = new Knight(COLOUR.B, new Coordinate('h', 7));

        //________________________________________________Black Bishops_____________________________________________


        //________________________________________________Black Queen_______________________________________________

        Queen queenB = new Queen(COLOUR.B, new Coordinate('d', bRank));

        //________________________________________________Black King________________________________________________

        King kingB = new King(COLOUR.B, new Coordinate('e', bRank));

        //________________________________________________White Pawns_______________________________________________

        Pawn pawnWe = new Pawn(COLOUR.W, new Coordinate('e', pawnWRank));
        Pawn pawnWh = new Pawn(COLOUR.W, new Coordinate('h', pawnWRank));

        //________________________________________________White Rooks_______________________________________________

        Rook rookWa = new Rook(COLOUR.W, new Coordinate('a', wRank));
        Rook rookWh = new Rook(COLOUR.W, new Coordinate('h', wRank));


        //________________________________________________White Bishops_____________________________________________

        Bishop bishopW = new Bishop(COLOUR.W, new Coordinate('f', 6));

        //________________________________________________White Queen_______________________________________________

        Queen queenW = new Queen(COLOUR.W, new Coordinate('g', 5));

        //________________________________________________White King________________________________________________

        King kingW = new King(COLOUR.W, new Coordinate('e', wRank));

        //________________________________________________Place Black in HashMap____________________________________


        pieces.put(pawnW.getCoords(), pawnW);
        pieces.put(pawnB.getCoords(), pawnB);

        pieces.put(rookB.getCoords(), rookB);
        pieces.put(rookBh.getCoords(), rookBh);

        pieces.put(knightB.getCoords(), knightB);

        pieces.put(queenB.getCoords(), queenB);

        pieces.put(kingB.getCoords(), kingB);

        //________________________________________________Place White in HashMap____________________________________

        pieces.put(pawnWe.getCoords(), pawnWe);
        pieces.put(pawnWh.getCoords(), pawnWh);

        pieces.put(rookWa.getCoords(), rookWa);
        pieces.put(rookWh.getCoords(), rookWh);

        pieces.put(bishopW.getCoords(), bishopW);

        pieces.put(queenW.getCoords(), queenW);

        pieces.put(kingW.getCoords(), kingW);

        return pieces;
    }


    //______________________________________________HELPER METHODS FOR displayBoard_________________________________

    public static String fancySeparator() {

        String unit = "|====";
        String repeated = new String(new char[8]).replace("\0", unit);
        String str = "  " + repeated + "|";
        return str;
    }

    public static String spacer(int n, String type) {
        if (type.equals("L"))
            return n + " ";
        else
            return " " + n;
    }

    public static String fancyColumnIndex() {
        StringBuilder str = new StringBuilder();
        str.append("   ");
        for (char file = 'a'; file <= 'h'; file++) {
            str.append(" ").append(file).append("   ");
        }

        return str.toString();
    }



    public static String displayBoard(Pieces pieces) {

        int dimRank = BOARD.FIRST_RANK.getRankVal();
        char dimFile = BOARD.FIRST_FILE.getFileVal();
        char lastFile = BOARD.LAST_FILE.getFileVal();

        StringBuilder str = new StringBuilder();

        str.append(fancyColumnIndex()).append("\n");
        str.append(fancySeparator()).append("\n");
        for (int rank = 8; rank >= dimRank; rank--) {
            str.append(spacer(rank, "L")).append("|");
            for (char file = dimFile; file <= lastFile; file++) {
                Coordinate coord = new Coordinate(file, rank);
                str.append((pieces.getPieces().get(coord) != null)
                        ? (" " + pieces.getPieces().get(coord).toBoardString() + " |")
                        : "    |");
            }
            str.append(spacer(rank, "R")).append("\n");
            str.append(fancySeparator()).append("\n");
        }
        str.append(fancyColumnIndex()).append("\n");

        return str.toString();

    }


}
