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
    RS --> FM[FileManager]<img width="3335" height="1667" alt="mermaid-diagram" src="https://github.com/user-attachments/assets/d181cf82-9df3-47b2-9f28-3b2282b75770" />
<img width="2624" height="1422" alt="mermaid-diagram (3)" src="https://github.com/user-attachments/assets/86c7f471-7dcf-4d2d-8497-8e59adfc0777" />
<img width="2448" height="1218" alt="mermaid-diagram (2)" src="https://github.com/user-attachments/assets/cb1567f9-14c3-47a9-bcb6-95d1c4f0ccad" />
<img width="979" height="1552" alt="mermaid-diagram (1)" src="https://github.com/user-attachments/assets/a6eae27d-27ef-4b15-a2c5-23e94245c57e" />
![Uploading mermaid-diagram.png…]()
