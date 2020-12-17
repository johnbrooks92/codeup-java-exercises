package grades;

import java.util.*;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double bucket = 0;
        for(int grade : grades){
            bucket+=grade;
        }
        return bucket/(grades.size());
    }

    public static void main(String[] args){

        Student john = new Student("John");

        Student johnny = new Student("Johnny");

        Student jon = new Student("Jon");

        Student jonathan = new Student("Jonathan");

    }
}