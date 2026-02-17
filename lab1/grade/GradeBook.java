package grade;

import model.Student;
import java.util.ArrayList;

public class GradeBook {

    private Course course;
    private ArrayList<Student> students;

    public GradeBook(Course course) {
        this.course = course;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double getAverage() {
        int sum = 0;

        for (Student s : students) {
            sum += s.getGrade();
        }

        return students.size() == 0 ? 0 : (double) sum / students.size();
    }

    public Student getBestStudent() {
        Student best = students.get(0);

        for (Student s : students) {
            if (s.getGrade() > best.getGrade()) {
                best = s;
            }
        }
        return best;
    }

    public Student getLowestStudent() {
        Student lowest = students.get(0);

        for (Student s : students) {
            if (s.getGrade() < lowest.getGrade()) {
                lowest = s;
            }
        }
        return lowest;
    }

    public void displayGradeReport() {
        System.out.println("Course: " + course.getCourseName());

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("Average: " + getAverage());
        System.out.println("Best: " + getBestStudent());
        System.out.println("Lowest: " + getLowestStudent());
    }

    public void displayBarChart() {
        int[] frequency = new int[11];

        for (Student s : students) {
            frequency[s.getGrade() / 10]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (i == 10)
                System.out.print("100: ");
            else
                System.out.print(i * 10 + "-" + (i * 10 + 9) + ": ");

            for (int star = 0; star < frequency[i]; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
