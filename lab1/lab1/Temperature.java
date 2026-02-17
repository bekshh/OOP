package lab1;

public class Temperature {

    private double value;
    private char scale;   // 'C' or 'F'

    // Конструктор по умолчанию
    public Temperature() {
        this.value = 0;
        this.scale = 'C';
    }

    // Конструктор только со значением (по умолчанию C)
    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    // Конструктор только со шкалой (по умолчанию 0)
    public Temperature(char scale) {
        this.value = 0;
        setScale(scale);
    }

    // Конструктор со значением и шкалой
    public Temperature(double value, char scale) {
        this.value = value;
        setScale(scale);
    }

    public double getCelsius() {
        if (scale == 'C') {
            return value;
        } else {
            return (value - 32) * 5 / 9;
        }
    }

    public double getFahrenheit() {
        if (scale == 'F') {
            return value;
        } else {
            return value * 9 / 5 + 32;
        }
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            System.out.println("Invalid scale. Use 'C' or 'F'.");
        }
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        setScale(scale);
    }

    public char getScale() {
        return scale;
    }

    @Override
    public String toString() {
        return value + "°" + scale;
    }
}
