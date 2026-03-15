package problem1;

import java.util.Objects;

public class Employee extends Person {

    private String employeeId;

    public Employee(String name, int age, String id) {
        super(name, age);
        employeeId = id;
    }

    @Override
    public boolean equals(Object o) {

        if (!super.equals(o)) return false;

        if (!(o instanceof Employee)) return false;

        Employee e = (Employee) o;

        return employeeId.equals(e.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeId);
    }
}