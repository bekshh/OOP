package grade;

import model.Student;

public class GradeBookTest {

    public static void main(String[] args) {

        Course course = new Course("OOP");
        GradeBook book = new GradeBook(course);

        book.addStudent(new Student("Denis", 90));
        book.addStudent(new Student("Aliya", 75));
        book.addStudent(new Student("Murat", 60));
        book.addStudent(new Student("Dana", 100));

        book.displayGradeReport();
        book.displayBarChart();
    }
}
