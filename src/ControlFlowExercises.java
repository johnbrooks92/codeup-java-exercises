import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Loop Practice

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        for(int i = 5; i <= 15; i++) {
//            System.out.println("i is " + i);
//        }

//        int n = 100;
//        System.out.print("Even Numbers from 0 to "+n+" are: ");
//        for (int i = 0; i <= n; i++) {
//            //if number%2 == 0 it means its an even number
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }

//        for(int i = 0; i <= 100; i++) { // <--+
//            if(i % 2 == 1) { //              |
//                continue; // ----------------+
//            }
//            System.out.println(i);
//        }



//        Fizz Buzz Solution

//        for (int i = 1; i <= 100; i++)
//        {
//            if (((i % 3) == 0) && ((i % 3) == 0)) // Is it a multiple of 3 & 5?
//                System.out.println("fizzbuzz");
//            else if ((i % 3) == 0) // Is it a multiple of 3?
//                System.out.println("fizz");
//            else if ((i % 5) == 0) // Is it a multiple of 5?
//                System.out.println("buzz");
//            else
//                System.out.println(i); // Not a multiple of 3 or 5
//        }


//          Table of Numbers

        String resetTable = "Y";

        while (resetTable.equalsIgnoreCase("y")) {

            System.out.println("Provide a number: ");
            int userNum = Integer.parseInt(input.nextLine());

            System.out.println("Here is your table:");
            System.out.println("\n number | squared | cubed \n ------ | ------- | -----");

            for (int num = 1; num <= userNum; num++) {

                System.out.println("  " + num + "     | " + (num * num) + "       | " + (num * num * num));
            }

            System.out.println("Do you want to try another integer table? Y/N ");
            resetTable = input.nextLine();
        }

        System.out.println("Fine, I didn't want you to anyways.");




        //        Grading System


        do {
            System.out.println("Input a number grade between 1 and 100");
            int grade = Integer.parseInt(input.nextLine());

            if (grade > 97) {
                System.out.println("A+");
            } else if (grade > 93) {
                System.out.println("A");
            } else if (grade > 90) {
                System.out.println("A-");
            } else if (grade > 87) {
                System.out.println("B+");
            } else if (grade > 83) {
                System.out.println("B");
            } else if (grade > 80) {
                System.out.println("B-");
            } else if (grade > 77) {
                System.out.println("C+");
            } else if (grade > 73) {
                System.out.println("C");
            } else if (grade > 70) {
                System.out.println("C-");
            } else if (grade > 67) {
                System.out.println("D+");
            } else if (grade > 63) {
                System.out.println("D");
            } else if (grade > 60) {
                System.out.println("D-");
            } else {
                System.out.println("F");
            }

            System.out.println("Would you like to try again? y/n");

        }while (input.nextLine().equalsIgnoreCase("y"));

    }
}
