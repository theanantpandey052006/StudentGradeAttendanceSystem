import model.Student;
import model.Marks;
import model.Attendance;

import service.StudentService;
import service.MarksService;
import service.AttendanceService;
import service.ReportService;

import util.FileManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentService studentService =
                new StudentService();

        MarksService marksService =
                new MarksService();

        AttendanceService attendanceService =
                new AttendanceService();

        ReportService reportService =
                new ReportService();

        // Sample students
        studentService.addStudent(
                new Student(101, "Rahul", "CSE"));

        studentService.addStudent(
                new Student(102, "Priya", "ECE"));

        while (true) {

            System.out.println(
                    "\n====================================");

            System.out.println(
                    " STUDENT GRADE & ATTENDANCE SYSTEM");

            System.out.println(
                    "====================================");

            System.out.println("1. View Students");
            System.out.println("2. Search Student");
            System.out.println("3. Enter Marks");
            System.out.println("4. Enter Attendance");
            System.out.println("5. View Student Report");
            System.out.println("6. Save Data");
            System.out.println("7. Exit");

            System.out.print("\nEnter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    studentService.displayStudents();
                    break;

                case 2:

                    System.out.print(
                            "Enter Student ID: ");

                    int searchId =
                            scanner.nextInt();

                    Student found =
                            studentService
                                    .findStudent(searchId);

                    if (found != null)
                        System.out.println(found);
                    else
                        System.out.println(
                                "Student not found.");

                    break;

                case 3:

                    System.out.print(
                            "Enter Student ID: ");

                    int markId =
                            scanner.nextInt();

                    System.out.print(
                            "Enter Java Marks: ");

                    double javaMarks =
                            scanner.nextDouble();

                    System.out.print(
                            "Enter DSA Marks: ");

                    double dsaMarks =
                            scanner.nextDouble();

                    System.out.print(
                            "Enter DBMS Marks: ");

                    double dbmsMarks =
                            scanner.nextDouble();

                    if (javaMarks < 0 ||
                            javaMarks > 100 ||
                            dsaMarks < 0 ||
                            dsaMarks > 100 ||
                            dbmsMarks < 0 ||
                            dbmsMarks > 100) {

                        System.out.println(
                                "Invalid marks.");

                        break;
                    }

                    marksService.addMarks(
                            new Marks(
                                    markId,
                                    javaMarks,
                                    dsaMarks,
                                    dbmsMarks));

                    System.out.println(
                            "Marks added successfully.");

                    break;

                case 4:

                    System.out.print(
                            "Enter Student ID: ");

                    int attendanceId =
                            scanner.nextInt();

                    System.out.print(
                            "Total Classes: ");

                    int total =
                            scanner.nextInt();

                    System.out.print(
                            "Classes Attended: ");

                    int attended =
                            scanner.nextInt();

                    if (total <= 0 ||
                            attended < 0 ||
                            attended > total) {

                        System.out.println(
                                "Invalid attendance.");

                        break;
                    }

                    attendanceService.addAttendance(
                            new Attendance(
                                    attendanceId,
                                    total,
                                    attended));

                    System.out.println(
                            "Attendance added.");

                    break;

                case 5:

                    System.out.print(
                            "Enter Student ID: ");

                    int reportId =
                            scanner.nextInt();

                    Student student =
                            studentService
                                    .findStudent(reportId);

                    Marks marks =
                            marksService
                                    .findMarks(reportId);

                    Attendance attendance =
                            attendanceService
                                    .findAttendance(
                                            reportId);

                    if (student == null)
                        System.out.println(
                                "Student not found.");

                    else if (marks == null)
                        System.out.println(
                                "Marks not found.");

                    else if (attendance == null)
                        System.out.println(
                                "Attendance not found.");

                    else
                        reportService.generateReport(
                                student,
                                marks,
                                attendance);

                    break;

                case 6:

                    FileManager.save(
                            "Student Grade and Attendance System\n"
                            + "Total Students: "
                            + studentService
                            .getStudentCount());

                    break;

                case 7:

                    System.out.println(
                            "Thank you!");

                    scanner.close();
                    return;

                default:

                    System.out.println(
                            "Invalid choice.");
            }
        }
    }
}