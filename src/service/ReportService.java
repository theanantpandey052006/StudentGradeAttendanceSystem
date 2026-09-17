package service;

import model.Student;
import model.Marks;
import model.Attendance;

public class ReportService {

    public void generateReport(
            Student student,
            Marks marks,
            Attendance attendance) {

        System.out.println("\n================================");
        System.out.println("        STUDENT REPORT");
        System.out.println("================================");

        System.out.println("ID       : " + student.getId());
        System.out.println("Name     : " + student.getName());
        System.out.println("Branch   : " + student.getBranch());

        System.out.println("\n----- MARKS -----");

        System.out.println("Java     : " + marks.getJavaMarks());
        System.out.println("DSA      : " + marks.getDsaMarks());
        System.out.println("DBMS     : " + marks.getDbmsMarks());

        System.out.println("Total    : " + marks.getTotal());
        System.out.println("Percentage : " + marks.getPercentage());
        System.out.println("Grade    : " + marks.getGrade());

        System.out.println("\n----- ATTENDANCE -----");

        System.out.println(
                "Attendance : "
                        + attendance.getPercentage()
                        + "%");

        System.out.println(
                "Eligibility : "
                        + (attendance.isEligible()
                        ? "Eligible"
                        : "Not Eligible"));

        System.out.println("================================");
    }
}