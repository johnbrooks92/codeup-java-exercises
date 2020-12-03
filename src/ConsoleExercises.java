import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println(userInput);
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately $%1.0f%n", pi);



//        System.out.println("Please enter your 3 favorite pokemon:");
//        String firstPokemon = userInput.next();
//        String secondPokemon = userInput.next();
//        String thirdPokemon = userInput.next();
//        System.out.println(firstPokemon);
//        System.out.println(secondPokemon);
//        System.out.println(thirdPokemon);

//
//        System.out.println("Where is Waldo?");
//        String location = userInput.nextLine();
//        System.out.println(location);

        System.out.println("Enter the length of the Jupiter classroom");
        String userLength = userInput.nextLine();
        System.out.println("Enter the width of the Jupiter classroom");
        String userWidth = userInput.nextLine();
        int lengthInput = Integer.parseInt(userLength);
        int widthInput = Integer.parseInt(userWidth);
        int roomArea = lengthInput * widthInput;
        int roomPerimeter = (2*lengthInput) + (2*widthInput);

        System.out.printf("The area of the classroom is %d.%n", roomArea);
        System.out.printf("The perimeter of the classroom is %d.%n", roomPerimeter);


    }

}
