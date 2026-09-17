package service;

import model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {

        System.out.println("\n===== STUDENTS =====");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student findStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id)
                return student;
        }

        return null;
    }

    public int getStudentCount() {
        return students.size();
    }
}