import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class ConsoleAdventure {

    public static void main(String[] arg) {
        System.out.println("Narrator: Welcome to a new adventure!");
        System.out.println("Today you'll be experiencing as many adventures as you decide!");
        System.out.println("After each stage of your adventure, you will be prompted with a portal.");
        System.out.println("Either decide to take the portal and enter another universe to continue your adventure");
        System.out.println("Or stay in your current universe and see out your stay!");
        System.out.println("As Captain Planet used to say, \"The Power Is Yours!\"");
        System.out.println(PhaseUno(0));
    }

    public static String PhaseUno(int count) {
        System.out.println("Select a number from 1-5 to randomly select your universe.");
        Scanner advScanner = new Scanner(System.in);
        int startSelect = Integer.parseInt(advScanner.nextLine());
        if (count >= 4) {
            if (startSelect == 1) {
                count++;
                System.out.println("????: Aw Jeez! What are you doing over here? I really hope this wasn't our fault.");
                System.out.println("????: So, what's your name?");
                String name = advScanner.nextLine();
                System.out.println(name + "? Nice to meet you, " + name + ". I'm Morty and I'm on an adventure with my grandpa, Rick.");
            } else if (startSelect == 2) {
                count++;
                System.out.println("????: Whoa! How did you get here? Was that some kind of magic or something?");
                System.out.println("????: Anyways, who are you?");
                String name2 = advScanner.nextLine();
                System.out.println(name2 + "? That's a beautiful name, " + name2 + ". I'm Sly Cooper and these are my pals, Bentley and Murray.");
            } else if (startSelect == 3) {
                count++;
                System.out.println("????: Hey! Who do you think you are just barging in like that?");
                System.out.println("????: Forget it, what's your name anyways?");
                String name3 = advScanner.nextLine();
                System.out.println("????: " + name3 + "? Welcome aboard, " + name3 + ". Ny name is Ash. I'm a Pokemon Trainer from Pallet Town.");
            } else if (startSelect == 4) {
                count++;
                System.out.println("????: Hey, punk! Who the hell do you think you are?!");
                System.out.println("????: Whatever, just don't let it happen again.");
                System.out.println("????: Could your rude ass at least give me your name?");
                String name4 = advScanner.nextLine();
                System.out.println(name4 + "? Thats a stupid name! I'm Yusuke and I'm this planet's Spirit Detective.");
            } else {
                count++;
                System.out.println("????: Wow, that was quite the entrance. I've seen some things in my years, but that was something.");
                System.out.println("????: Well, for crash landing through my roof, you owe me your name at the least. What is it?");
                String name4 = advScanner.nextLine();
                System.out.println(name4 + "? I foresee great adventures for you, " + name4 + ". Allow me to introduce myself, my name is Master Roshi. Welcome to Kame House.");
            }
        } else if (startSelect > 0 && startSelect < 6) {
            if (startSelect == 1) {
                count++;
                System.out.println("????: Aw Jeez! What are you doing over here? I really hope this wasn't our fault.");
                System.out.println("????: So, what's your name?");
                String name = advScanner.nextLine();
                System.out.println(name + "? Nice to meet you, " + name + ". I'm Morty and I'm on an adventure with my grandpa, Rick. Things are about to get real schwifty!");
            } else if (startSelect == 2) {
                count++;
                System.out.println("????: Whoa! How did you get here? Was that some kind of magic or something?");
                System.out.println("????: Anyways, who are you?");
                String name2 = advScanner.nextLine();
                System.out.println(name2 + "? That's a beautiful name, " + name2 + ". I'm Sly Cooper and these are my pals, Bentley and Murray.");
            } else if (startSelect == 3) {
                count++;
                System.out.println("????: Hey! Who do you think you are just barging in like that?");
                System.out.println("????: Forget it, what's your name anyways?");
                String name3 = advScanner.nextLine();
                System.out.println("????: " + name3 + "? Welcome aboard, " + name3 + ". Ny name is Ash. I'm a Pokemon Trainer from Pallet Town.");
            } else if (startSelect == 4) {
                count++;
                System.out.println("????: Hey, punk! Who the hell do you think you are?!");
                System.out.println("????: Whatever, just don't let it happen again.");
                System.out.println("????: Could your rude ass at least give me your name?");
                String name4 = advScanner.nextLine();
                System.out.println(name4 + "? Thats a stupid name! I'm Yusuke and I'm this planet's Spirit Detective.");
            } else {
                count++;
                System.out.println("????: Wow, that was quite the entrance. I've seen some things in my years, but that was something.");
                System.out.println("????: Well, for crash landing through my roof, you owe me your name at the least. What is it?");
                String name4 = advScanner.nextLine();
                System.out.println(name4 + "? I foresee great adventures for you, " + name4 + ". Allow me to introduce myself, my name is Master Roshi. Welcome to Kame House.");
            }
            return "";
        }
        return"";
    }
}

