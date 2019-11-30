package designPattern;

public class GradeTracker implements GradeTrackerInterface {

    private Student student;
    private double studentAvg;

    public GradeTracker(){}

    public GradeTracker(Student student){this.student=student;}

    @Override
    public char getLetterGrade() {
        char letterGrade;
        studentAvg = student.getAverage();
        if (studentAvg >= 90.0) {
            letterGrade = 'A';
        } else if (studentAvg <= 89.9 && studentAvg >= 80.0) {
            letterGrade = 'B';
        } else if (studentAvg <= 79.9 && studentAvg >= 70.0) {
            letterGrade = 'C';
        } else if (studentAvg <= 69.9 && studentAvg >= 60.0) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        return letterGrade;
    }
}
