package model;

public class Attendance {

    private int studentId;
    private int totalClasses;
    private int attendedClasses;

    public Attendance(int studentId,
                      int totalClasses,
                      int attendedClasses) {

        this.studentId = studentId;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getPercentage() {

        if (totalClasses == 0)
            return 0;

        return attendedClasses * 100.0 / totalClasses;
    }

    public boolean isEligible() {
        return getPercentage() >= 75;
    }
}