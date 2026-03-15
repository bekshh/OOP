package problem1;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person p = (Person) o;

        return age == p.age && name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}