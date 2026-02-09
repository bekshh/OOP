package test;

public class problem2 {

    private int width;

    public problem2(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                result += "[*]";
            }
            result += "\n";
        }

        return result;
    }
}