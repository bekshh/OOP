package problem2;

public class Main {

    public static void main(String[] args) {

        Position start = new Position(1,1);
        Position move = new Position(1,8);

        Piece rook = new Rook(start);

        System.out.println(rook.isLegalMove(move));
    }
}