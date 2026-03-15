package problem1;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Employee> set = new HashSet<>();

        Employee e1 = new Employee("Denis", 20, "E01");
        Employee e2 = new Employee("Denis", 20, "E01");

        set.add(e1);
        set.add(e2);

        System.out.println(set.size());
    }
}