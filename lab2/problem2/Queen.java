package problem2;

public class Queen extends Piece {

    public Queen(Position p) {
        super(p);
    }

    @Override
    public boolean isLegalMove(Position b) {

        if (position.row == b.row ||
            position.col == b.col ||
            Math.abs(position.row - b.row) ==
            Math.abs(position.col - b.col)) {

            return true;
        }

        return false;
    }
}