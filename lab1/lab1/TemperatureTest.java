package lab1;

public class TemperatureTest {

    public static void main(String[] args) {

        Temperature t1 = new Temperature(100, 'C');
        Temperature t2 = new Temperature(32, 'F');

        System.out.println("t1 in F = " + t1.getFahrenheit());
        System.out.println("t2 in C = " + t2.getCelsius());

        t1.setBoth(0, 'C');
        System.out.println("Updated t1: " + t1);
    }
}
