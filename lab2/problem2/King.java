package problem2;

public class King extends Piece {

    public King(Position p) {
        super(p);
    }

    @Override
    public boolean isLegalMove(Position b) {

        int rowDiff = Math.abs(position.row - b.row);
        int colDiff = Math.abs(position.col - b.col);

        if (rowDiff <= 1 && colDiff <= 1) {
            return true;
        }

        return false;
    }
}