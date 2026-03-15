package problem2;

public class Knight extends Piece {

    public Knight(Position p) {
        super(p);
    }

    @Override
    public boolean isLegalMove(Position b) {

        int rowDiff = Math.abs(position.row - b.row);
        int colDiff = Math.abs(position.col - b.col);

        if ((rowDiff == 2 && colDiff == 1) ||
            (rowDiff == 1 && colDiff == 2)) {
            return true;
        }

        return false;
    }
}