package problem4;

public class Resistor extends Circuit {

    private double resistance;

    public Resistor(double r) {
        resistance = r;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

}