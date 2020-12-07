import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class HighLow {

    public static void main (String[] arg) {
        System.out.println(Intro());
        System.out.println(LowHigh(83, 0));
    }
    public static String Intro() {
        System.out.println("SATURN'S SOLAR SHOWDOWN");
        System.out.println("Saturn: Hello and welcome back to your regularly scheduled programming!");
        System.out.println("Saturn: I am your host, and STILL undefeated champion until further notice...");
        System.out.println("Saturn: SATURN!!!!!");
        System.out.println("Saturn: Until now no one has ever guessed my random number selections.");
        System.out.println("Saturn: Will you be the first? ");
        System.out.println("Saturn: As a team of 7, you'll each get 1 chance to be the first person to guess the number I choose!");
        System.out.println("Saturn: While 7 chances may seem like a shot in the dark amongst a field of 1-100, you will receive hints!");
        System.out.println("Saturn: The hints will guide you in the direction of the correct number.");
        System.out.println("Saturn: Heed them wisely and best of luck!");
        System.out.println("Saturn: Our next 7-man squad will be Team Jupiter. Jupiter send up your 7.");
        System.out.println("*Jupiter sends up 7 students from the crowd. \"Price Is Right\"-level hype ensues*");
        return "";
    }
    public static String LowHigh(int randomNum, int count){
        System.out.println("Saturn: We welcome our next contestant. What is your name contestant?");
        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.nextLine();
        System.out.println("Saturn: Okay, welcome aboard " + name + " and best of luck to you today!");
        System.out.println("Saturn: " + name + ", what number will you go with? You have used " + count + " out of Jupiter's 7 turns.");
        int userInput = Integer.parseInt(myScanner.nextLine());
        if(count>=6){

            if (userInput > randomNum) {
                count++;
                System.out.println("Saturn: Not quite, " + name + ". This was guess number " + count + " out of 7.");
                System.out.println("Saturn: The correct number is lower!");
                return "Saturn: You've lost! What else did you expect? I'm the GOAT look at these rings! You see what I did there? Rings? Tune into next week's edition of Saturn's Solar Showdown!";
            } else if (userInput < randomNum) {
                count++;
                System.out.println("Saturn: Not quite, " + name + ". This was guess number " + count + " out of 7.");
                System.out.println("Saturn: The correct number is higher!");
                return "Saturn: You've lost! What else did you expect? I'm the GOAT look at these rings! You see what I did there? Rings? Tune into next week's edition of Saturn's Solar Showdown!";
            } else if (userInput == randomNum) {
                count = count + 1;
                System.out.println("Saturn: No Way...");
                System.out.println("Saturn: I can't believe it...");
                System.out.println("Saturn: You've defeated me...");
                System.out.println("Saturn: No Way...");
                return "Saturn: You truly are 1 in a 100! Congratulations, to the winner " + name +" and the rest of Jupiter on making history!";
            }

        }else if (userInput > 0 && userInput < 101) {

            if (userInput > randomNum) {
                count++;
                System.out.println("Not quite, " + name + ". This was guess number " + count + " out of 7.");
                System.out.println("\"The correct number is lower!\"");
                return LowHigh(randomNum, count++);
            } else if (userInput < randomNum) {
                count++;
                System.out.println("Not quite, " + name + ". This was guess number " + count + " out of 7.");
                System.out.println("The correct number is higher!");
                return LowHigh(randomNum, count++);
            } else if (userInput == randomNum) {
                count = count + 1;
                System.out.println("Saturn: No Way...");
                System.out.println("Saturn: I can't believe it...");
                System.out.println("Saturn: You've defeated me...");
                System.out.println("Saturn: No Way...");
                return "Saturn: You truly are 1 in a 100! Congratulations, to the winner " + name +" and the rest of Jupiter on making history!";
            }

        }else {
            System.out.println( "Does not compute. Critical error. Try again.");
            return LowHigh(randomNum, count);
        }
        return "";
    }

}