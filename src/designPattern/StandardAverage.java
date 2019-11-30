package designPattern;

import java.util.ArrayList;

public class StandardAverage extends Average{

    public StandardAverage(ArrayList<Double> assignments, ArrayList<Double> exams){
        super(assignments, exams);
    }

    public double calculateAverage(){
        double average;
        average = (EXAM_WEIGHTED * (totalExamsScore()/exams.size())) +
                (ASSIGN_WEIGHTED * (totalAssignScore()/assignments.size()));
        return average;
    }
}

