import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println(userInput);
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately $%1.0f%n", pi);



        System.out.println("Please enter your 3 favorite pokemon:");
        String firstPokemon = userInput.next();
        String secondPokemon = userInput.next();
        String thirdPokemon = userInput.next();
        System.out.println(firstPokemon);
        System.out.println(secondPokemon);
        System.out.println(thirdPokemon);




    }

}
