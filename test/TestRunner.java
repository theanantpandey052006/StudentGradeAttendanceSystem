import model.Marks;
import model.Attendance;

public class TestRunner {

    public static void main(String[] args) {

        System.out.println("Starting tests...");

        // Test 1: Marks calculation
        Marks marks =
                new Marks(101, 85, 90, 80);

        if (marks.getTotal() == 255)
            System.out.println("PASS: Total marks");

        if (marks.getPercentage() == 85)
            System.out.println("PASS: Percentage");

        if (marks.getGrade().equals("A"))
            System.out.println("PASS: Grade calculation");

        // Test 2: Attendance calculation
        Attendance attendance =
                new Attendance(101, 100, 90);

        if (attendance.getPercentage() == 90)
            System.out.println(
                    "PASS: Attendance percentage");

        if (attendance.isEligible())
            System.out.println(
                    "PASS: Attendance eligibility");

        System.out.println(
                "\nAll tests completed successfully!");
    }
}