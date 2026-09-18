# Project Design Diagrams

## 1. System Architecture Diagram

```mermaid
flowchart TD
    U[User] --> M[Main.java]

    M --> SS[StudentService]
    M --> MS[MarksService]
    M --> AS[AttendanceService]
    M --> RS[ReportService]

    SS --> S[Student Model]
    MS --> MK[Marks Model]
    AS --> A[Attendance Model]

    RS --> S
    RS --> MK
    RS --> A
    RS --> FM[FileManager]

    FM --> F[(Data File)]
```

---

## 2. Project Module Diagram

```mermaid
flowchart LR
    Main[Main.java]

    Model[Model Layer]
    Service[Service Layer]
    Utility[Utility Layer]
    Test[Testing]

    Main --> Service

    Model --> Student[Student.java]
    Model --> Marks[Marks.java]
    Model --> Attendance[Attendance.java]

    Service --> StudentService[StudentService.java]
    Service --> MarksService[MarksService.java]
    Service --> AttendanceService[AttendanceService.java]
    Service --> ReportService[ReportService.java]

    Utility --> FileManager[FileManager.java]

    Test --> TestRunner[TestRunner.java]

    StudentService --> Student
    MarksService --> Marks
    AttendanceService --> Attendance
    ReportService --> Student
    ReportService --> Marks
    ReportService --> Attendance
    ReportService --> FileManager
```

---

## 3. Student Management Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Enter Student ID]
    B --> C{Student Exists?}

    C -->|Yes| D[Display Student Details]
    C -->|No| E[Student Not Found]

    D --> F[Update or View Student Information]
    E --> G[Return to Main Menu]

    F --> G
    G --> H[End]
```

---

## 4. Marks Management Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Enter Student ID]
    B --> C[Enter Java Marks]
    C --> D[Enter DSA Marks]
    D --> E[Enter DBMS Marks]

    E --> F{Marks Valid?}

    F -->|No| G[Display Error]
    G --> C

    F -->|Yes| H[Calculate Total Marks]
    H --> I[Calculate Percentage]
    I --> J[Calculate Grade]
    J --> K[Display Result]
    K --> L[End]
```

---

## 5. Attendance Management Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Enter Student ID]
    B --> C[Enter Total Classes]
    C --> D[Enter Attended Classes]

    D --> E{Attendance Data Valid?}

    E -->|No| F[Display Error]
    F --> C

    E -->|Yes| G[Calculate Attendance Percentage]
    G --> H{Attendance >= 75%?}

    H -->|Yes| I[Eligible]
    H -->|No| J[Not Eligible]

    I --> K[Display Attendance Result]
    J --> K

    K --> L[End]
```

---

## 6. Report Generation Flowchart

```mermaid
flowchart TD
    A[Start] --> B[Enter Student ID]
    B --> C[Retrieve Student Details]
    C --> D[Retrieve Marks]
    D --> E[Retrieve Attendance]

    E --> F[Calculate / Retrieve Percentage]
    F --> G[Calculate / Retrieve Grade]
    G --> H[Check Attendance Eligibility]

    H --> I[Generate Consolidated Report]
    I --> J[Display Report]
    J --> K[End]
```

---

## 7. Testing Flowchart

```mermaid
flowchart TD
    A[Start TestRunner] --> B[Run Total Marks Test]
    B --> C[Run Percentage Test]
    C --> D[Run Grade Calculation Test]
    D --> E[Run Attendance Percentage Test]
    E --> F[Run Attendance Eligibility Test]

    F --> G{All Tests Passed?}

    G -->|Yes| H[All Tests Completed Successfully]
    G -->|No| I[Display Failed Tests]

    H --> J[End]
    I --> J
```

---

## 8. Overall System Flow

```mermaid
flowchart TD
    A[Start Application] --> B[Display Main Menu]

    B --> C{Select Operation}

    C -->|1. Student Management| D[Student Management]
    C -->|2. Marks Management| E[Marks Management]
    C -->|3. Attendance Management| F[Attendance Management]
    C -->|4. Generate Report| G[Report Generation]
    C -->|5. Save Data| H[File Management]
    C -->|6. Search Student| I[Search Student]
    C -->|7. Exit| J[Exit Application]

    D --> B
    E --> B
    F --> B
    G --> B
    H --> B
    I --> B

    J --> K[Thank You]
    K --> L[End]
```

---

## 9. Project Class Relationship

```mermaid
classDiagram
    class Student {
        -int studentId
        -String name
        -String branch
    }

    class Marks {
        -double javaMarks
        -double dsaMarks
        -double dbmsMarks
        +calculateTotal()
        +calculatePercentage()
        +calculateGrade()
    }

    class Attendance {
        -int totalClasses
        -int attendedClasses
        +calculatePercentage()
        +isEligible()
    }

    class StudentService {
        +addStudent()
        +searchStudent()
        +updateStudent()
    }

    class MarksService {
        +addMarks()
        +calculateMarks()
    }

    class AttendanceService {
        +addAttendance()
        +calculateAttendance()
        +checkEligibility()
    }

    class ReportService {
        +generateReport()
    }

    class FileManager {
        +saveData()
        +loadData()
    }

    StudentService --> Student
    MarksService --> Marks
    AttendanceService --> Attendance
    ReportService --> Student
    ReportService --> Marks
    ReportService --> Attendance
    ReportService --> FileManager
```

---

## 10. Test Results

The automated tests were executed using the Java test runner.

| Test | Result |
|---|---|
| Total Marks | PASS |
| Percentage | PASS |
| Grade Calculation | PASS |
| Attendance Percentage | PASS |
| Attendance Eligibility | PASS |

**All tests completed successfully!**
