package designPattern;

import java.util.ArrayList;

public class Student{

	private String name;                   
	private boolean avgSelect;             
	private ArrayList<Double> assignments;  
	private ArrayList<Double> exams;       

	public Student(String name) {
		this.name = name;
		assignments = new ArrayList<Double>();
		exams = new ArrayList<Double>();
	}

	public String getName() {
		return name;
	}

	public void addAssignmentScore(double as) {
		assignments.add(as);
	}

	public void addExamScore(double es) {
		exams.add(es);
	}

	public double getAverage() {
		double averageGrade = -1; 
		if (!avgSelect) {
			StandardAverage grade = new StandardAverage(assignments, exams);
			averageGrade = grade.calculateAverage();
		} else {
			if (assignments.size() >= 2) {
				DropAssignAverage grade = new DropAssignAverage(assignments, exams);
				averageGrade = grade.calculateAverage();
			} else {
				System.out.println("Cannot drop lowest! Must have at least" +
						"2 assignments posted.");
			}
		}

		return averageGrade;
	}

	public void setDropLowestAssign(boolean avgSelect) {
		this.avgSelect = avgSelect;
	}
}