package part1.model;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<Student> students = new ArrayList<>();

    public Journal() {
    }

    public Journal(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }

    public void setStudents(int i, Student student) {
        this.students.add(i, student);
    }

    @Override
    public String toString() {
        return "Journal{" +
                "students=" + students +
                '}';
    }
}
