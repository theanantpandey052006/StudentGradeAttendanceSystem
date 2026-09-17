package model;

public class Marks {

    private int studentId;
    private double javaMarks;
    private double dsaMarks;
    private double dbmsMarks;

    public Marks(int studentId, double javaMarks,
                 double dsaMarks, double dbmsMarks) {

        this.studentId = studentId;
        this.javaMarks = javaMarks;
        this.dsaMarks = dsaMarks;
        this.dbmsMarks = dbmsMarks;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getJavaMarks() {
        return javaMarks;
    }

    public double getDsaMarks() {
        return dsaMarks;
    }

    public double getDbmsMarks() {
        return dbmsMarks;
    }

    public double getTotal() {
        return javaMarks + dsaMarks + dbmsMarks;
    }

    public double getPercentage() {
        return getTotal() / 3;
    }

    public String getGrade() {

        double percentage = getPercentage();

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }
}