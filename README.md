# Student Grade & Attendance Management System

## 1. Overview

The Student Grade & Attendance Management System is a Java-based
console application designed to manage student information,
academic marks, attendance and performance reports.

The system provides a simple menu-driven interface for managing
student academic records and automatically calculating grades and
attendance eligibility.

## 2. Problem Statement

Managing student marks and attendance manually can be time-consuming
and may result in calculation and record-keeping errors.

This project provides a simple centralized Java application for
managing student information, academic marks, attendance and
performance reports.

## 3. Objectives

- Manage student information efficiently.
- Record academic marks.
- Automatically calculate total marks and percentage.
- Automatically calculate student grades.
- Record and calculate attendance.
- Check attendance eligibility.
- Generate consolidated student performance reports.
- Apply Object-Oriented Programming concepts.
- Implement input validation and error handling.
- Demonstrate modular software development.

## 4. Features

- Student management
- Student search by ID
- Marks management
- Automatic total calculation
- Automatic percentage calculation
- Automatic grade calculation
- Attendance management
- Attendance percentage calculation
- Attendance eligibility checking
- Student performance report
- File-based data saving
- Input validation
- Error handling
- Automated basic testing

## 5. Functional Modules

### Student Management

Stores student ID, name and branch information.

### Marks Management

Stores marks for Java, DSA and DBMS and calculates total marks,
percentage and grade.

### Attendance Management

Stores total classes and attended classes, calculates attendance
percentage and checks the 75% eligibility requirement.

### Report Generation

Combines student information, marks and attendance into a
consolidated student report.

### Data Management

Provides simple file-based data saving using Java File I/O.

## 6. Technologies Used

- Java
- Object-Oriented Programming
- Java Collections Framework
- ArrayList
- File Handling
- Exception Handling
- Visual Studio Code
- GitHub

## 7. Project Structure

```text
StudentGradeAttendanceSystem/
│
├── src/
│   ├── Main.java
│   │
│   ├── model/
│   │   ├── Student.java
│   │   ├── Marks.java
│   │   └── Attendance.java
│   │
│   ├── service/
│   │   ├── StudentService.java
│   │   ├── MarksService.java
│   │   ├── AttendanceService.java
│   │   └── ReportService.java
│   │
│   └── util/
│       └── FileManager.java
│
├── test/
│   └── TestRunner.java
│
├── README.md
└── statement.md
