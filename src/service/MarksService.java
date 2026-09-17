package service;

import model.Marks;
import java.util.ArrayList;
import java.util.List;

public class MarksService {

    private List<Marks> marksList = new ArrayList<>();

    public void addMarks(Marks marks) {
        marksList.add(marks);
    }

    public Marks findMarks(int studentId) {

        for (Marks marks : marksList) {

            if (marks.getStudentId() == studentId)
                return marks;
        }

        return null;
    }
}