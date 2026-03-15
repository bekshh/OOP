package problem2;

public class Pawn extends Piece {

    public Pawn(Position p) {
        super(p);
    }

    @Override
    public boolean isLegalMove(Position b) {

        if (b.col == position.col && b.row == position.row + 1) {
            return true;
        }

        return false;
    }
}