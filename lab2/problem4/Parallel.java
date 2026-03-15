package problem4;

public class Parallel extends Circuit {

    private Circuit c1;
    private Circuit c2;

    public Parallel(Circuit a, Circuit b) {
        c1 = a;
        c2 = b;
    }

    @Override
    public double getResistance() {

        double r1 = c1.getResistance();
        double r2 = c2.getResistance();

        return 1 / ((1/r1) + (1/r2));
    }

    @Override
    public void applyPotentialDiff(double V) {

        potentialDiff = V;

        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }

}