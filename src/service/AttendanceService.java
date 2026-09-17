package service;

import model.Attendance;
import java.util.ArrayList;
import java.util.List;

public class AttendanceService {

    private List<Attendance> attendanceList =
            new ArrayList<>();

    public void addAttendance(Attendance attendance) {
        attendanceList.add(attendance);
    }

    public Attendance findAttendance(int studentId) {

        for (Attendance attendance : attendanceList) {

            if (attendance.getStudentId() == studentId)
                return attendance;
        }

        return null;
    }
}