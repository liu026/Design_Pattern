package designPattern;

import java.text.DecimalFormat;

public class Driver {
    
	public static void main(String[] args) {

        Student student = new Student("Daniel Mu");
        student.addAssignmentScore(95);
        student.addAssignmentScore(88);
        student.addAssignmentScore(79);
        student.addExamScore(96);
        student.addExamScore(90);

        DecimalFormat df = new DecimalFormat("0.0");
        // algorithm A:
        System.out.println(student.getName() + "  " +
                           df.format(student.getAverage()));

        // algorithm B:
        student.setDropLowestAssign(true);
        System.out.println(student.getName() + "  " +
                           df.format(student.getAverage()));
        // algorithm A:
        student.setDropLowestAssign(false);
        
        //GradeTracker
        GradeTracker track = new GradeTracker(student);
        System.out.println("grade: " + track.getLetterGrade());
        student.addExamScore(11);
        System.out.println("Add a exam score.");
        System.out.println("new grade: " + track.getLetterGrade());
        
        //second student
        Student pl = new Student("Peter Liu");
        pl.addAssignmentScore(88);
        pl.addAssignmentScore(95);
        pl.addAssignmentScore(92);
        pl.addExamScore(88);
        pl.addExamScore(96);
      
        //new roster
        Roster aa = new Roster("Advanced Algorithm","CS5300");
        aa.addStudent(student);
        aa.addStudent(pl);

        System.out.println("Advanced Algorithm Grades:");
        AvgDispenser it = aa.getDispenser();
        while (!it.done()) {
            System.out.println("average "  +
                               df.format(it.getNextAvg()));
        }
    }
}
        