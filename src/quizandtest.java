import java.util.Scanner;

public class quizandtest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        userInteractionFactorial(sc);
    }
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Not a number!");
            return getInteger(min, max);
        }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInteger(min, max);
        }
    }
        public static long calculateFactorial(int num) {
            int output = 1;
            for (int i = 1; i <= num; i += 1) {
                output *= i;
            }
            return output;
        }
//
//
        public static void userInteractionFactorial(Scanner sc) {
            boolean willContinue;
            String userChoice;
            do {
                System.out.println("Please enter an integer from 1 to 12");
                int userInt = getInteger(1, 12);
                System.out.println(calculateFactorial(userInt));
                do {
                    System.out.println("Do you wish to continue? [y/n]: ");
                    userChoice = sc.next().trim();
                } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

                willContinue = userChoice.equalsIgnoreCase("y");
            } while (willContinue);
        }

}
