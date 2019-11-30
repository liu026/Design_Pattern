package designPattern;

import java.util.*;

public class Roster {
    
    private String courseName;             
    private String courseNumber;           
    private ArrayList<Student> students;  
    
    public Roster(String name, String number) {
        this.courseName = name;
        this.courseNumber = number;
        students = new ArrayList<Student>();
    }
  
    public String getCourseName() {
        return courseName;
    }
    
    public void addStudent (Student student) {
        students.add(student);
    }

    public AvgDispenser getDispenser() {

        return new AvgDispenser() {

            ListIterator<Student> rosterIterator = students.listIterator();

            @Override
            public double getNextAvg() {
                return rosterIterator.next().getAverage();
            }
     
            @Override
            public boolean done() {
                return !rosterIterator.hasNext();
            }
        };
    }

}
