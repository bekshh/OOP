package test;

public class problem1 {

    private String name;
    private int id;
    private int yearOfStudy;

    // constructor with two parameters
    public problem1(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void incrementYear() {
        yearOfStudy++;
    }
}
