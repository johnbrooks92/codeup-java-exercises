package grades;

import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    public static void main(String[] args){

        Student john = new Student("john");
        Student johnny = new Student("johnny");
        Student jon = new Student("jon");
        Student jonathan = new Student("jonathan");

        john.addGrade(92);
        john.addGrade(79);
        john.addGrade(93);

        jon.addGrade(86);
        jon.addGrade(82);
        jon.addGrade(95);

        johnny.addGrade(88);
        johnny.addGrade(86);
        johnny.addGrade(82);

        jonathan.addGrade(91);
        jonathan.addGrade(89);
        jonathan.addGrade(87);

        HashMap<String, Student> students = new HashMap<>();

        students.put("johnone", john);
        students.put("johnnytwo", johnny);
        students.put("jonthree", jon);
        students.put("jonathanfour", jonathan);

        studentsCLI(students);

    }

    public static void studentsCLI(HashMap<String, Student> hm){
        System.out.println("Welcome!");
        Boolean userContinue;
        Input input = new Input();

        do {
            String yourStudent = "";
            System.out.println();
            System.out.println("Please choose the student whose grades you would like to assess: ");
            Boolean validEntry;

            do {
                System.out.println();
                String chosenStudent = input.getString(githubUsernames(hm));
                if (!hm.containsKey(chosenStudent)) {
                    System.out.println("Sorry, that is not a valid entry. Please choose a different student");
                    validEntry = false;
                } else {
                    yourStudent = chosenStudent;
                    validEntry = true;
                }
            } while (!validEntry);

            printGrades(hm, yourStudent);

            userContinue = input.yesNo("Would you like to view grades for another student?");

        }   while(userContinue);

        System.out.println();
        System.out.println("Goodbye!");

    }

    public static String githubUsernames(HashMap<String, Student> hm) {
        String bucket = "|";
        for (Object key : hm.keySet()) {
            bucket+=" " + key + " |";
        }
        return bucket;
    }

    public static void printGrades(HashMap<String, Student> hm, String yourStudent){
        System.out.println();
        System.out.println("Here are the grades for " + hm.get(yourStudent).getName() +" :");
        System.out.println();
        for(double grade : hm.get(yourStudent).getGrades()){
            System.out.println(grade);
        }
        System.out.println();
        System.out.println("Average: " + hm.get(yourStudent).getGradeAverage());
        System.out.println();
    }

}