import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    public static void main (String[] arg) {

        Scanner myScanner = new Scanner(System.in);
        int x, y, sum, difference, product, quotient, modulus, userInput;
        System.out.println("Please enter two numbers.");
        x = myScanner.nextInt();
        y = myScanner.nextInt();
        sum = Addition(x, y);
        difference = Subtraction(x, y);
        product = Multiplication(x, y);
        quotient = Division(x, y);
        modulus = Remainder(x, y);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + modulus);
        System.out.println("Enter the \"1\" key to continue ");
        userInput = myScanner.nextInt();
        System.out.println(factorial(userInput));
        System.out.println("Enter any key between \"1\" and \"100\" ");
        userInput = myScanner.nextInt();
        System.out.println(dice(userInput));

    }


    public static int Addition(int x, int y) {
        return x + y;
    }

    public static int Subtraction(int x, int y) {
        return x - y;
    }

    public static int Multiplication(int x, int y) {
        return x * y;
    }

    public static int Division(int x, int y) {
        if (y == 0) {
            System.out.println("Infinity");
        }
        return x / y;
    }

    public static int Remainder(int x, int y) {
        return x % y;
    }


    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key between \"1\" and \"10\": ");
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        }
        System.out.println("Invalid input. Try again.");
        return getInteger(min, max);
    }
    public static long factorial(int fact){
        long userInput = getInteger(1,10);
        for (long i = 1; i <= userInput; i++){
            fact *= i;
        }
        return fact;
    }

    public static String dice(int sides){
        Random random = new Random();
        int roll1 = random.nextInt(sides) + 1;
        int roll2 = random.nextInt(sides) + 1;
        return "Your first roll was " + roll1 + " and your second roll was " + roll2;
    }
}
