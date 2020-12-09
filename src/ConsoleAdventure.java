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
                System.out.println("???: " + name + "? Nice to meet you, " + name + ".");
                System.out.println("Morty: I'm Morty and I'm on an adventure with my grandpa, Rick.");
                System.out.println("Rick: Welcome along, hope you're **BELCH** ready to get schwifty.");
            } else if (startSelect == 2) {
                count++;
                System.out.println("????: Whoa! How did you get here? Was that some kind of magic or something?");
                System.out.println("????: Anyways, who are you?");
                String name2 = advScanner.nextLine();
                System.out.println("???: " + name2 + "? That's a beautiful name, " + name2 + ".");
                System.out.println("Sly: I'm Sly Cooper and these are my pals, Bentley and Murray.");
                System.out.println("Bentley: Nice to meet you. I'm the brains of this operation.");
                System.out.println("Murray: And I'm the brawn and getaway driver! And together...");
                System.out.println("Sly: ... we may seem a motley crew. However, we are the most illustrious band of master thieves ever. Hop in!");
            } else if (startSelect == 3) {
                count++;
                System.out.println("????: Hey! Who do you think you are just barging in like that?");
                System.out.println("????: Forget it, what's your name anyways?");
                String name3 = advScanner.nextLine();
                System.out.println("???: " + name3 + "? Welcome aboard, " + name3 + ".");
                System.out.println("Ash: My name is Ash. I'm a Pokemon Trainer from Pallet Town. Meet my best friend, Pikachu!");
                System.out.println("Pikachu: PIKAAA!!!!");
            } else if (startSelect == 4) {
                count++;
                System.out.println("????: Hey, punk! Who the hell do you think you are?!");
                System.out.println("????: Whatever, just don't let it happen again.");
                System.out.println("????: Could your rude ass at least give me your name?");
                String name4 = advScanner.nextLine();
                System.out.println("???? :" + name4 + "? Thats a stupid name!");
                System.out.println("Yusuke: I'm Yusuke and I'm this planet's Spirit Detective. Might mistake you for a demon and you'll be eating a Spirit Gun sandwich next time!");
            } else {
                count++;
                System.out.println("????: Wow, that was quite the entrance. I've seen some things in my years, but that was something.");
                System.out.println("????: Well, for crash landing through my roof, you owe me your name at the least. What is it?");
                String name4 = advScanner.nextLine();
                System.out.println("???? :" + name4 + "? I foresee great adventures for you, " + name4 + ".");
                System.out.println("Roshi : I go by Turtle Hermit or Master Roshi, whichever you prefer. Welcome to Kame House.");
            }
        } else if (startSelect > 0 && startSelect < 6) {
            if (startSelect == 1) {
                count++;
                System.out.println("????: Aw Jeez! What are you doing over here? I really hope this wasn't our fault.");
                System.out.println("????: So, what's your name?");
                String name = advScanner.nextLine();
                System.out.println("???: " + name + "? Nice to meet you, " + name + ".");
                System.out.println("Morty: I'm Morty and I'm on an adventure with my grandpa, Rick.");
                System.out.println("Rick: Welcome along, hope you're **BELCH** ready to get schwifty.");
            } else if (startSelect == 2) {
                count++;
                System.out.println("????: Whoa! How did you get here? Was that some kind of magic or something?");
                System.out.println("????: Anyways, who are you?");
                String name2 = advScanner.nextLine();
                System.out.println("???: " + name2 + "? That's a beautiful name, " + name2 + ".");
                System.out.println("Sly: I'm Sly Cooper and these are my pals, Bentley and Murray.");
                System.out.println("Bentley: Nice to meet you. I'm the brains of this operation.");
                System.out.println("Murray: And I'm the brawn and getaway driver! And together...");
                System.out.println("Sly: ... we may seem a motley crew. However, we are the most illustrious band of master thieves ever. Hop in!");
            } else if (startSelect == 3) {
                count++;
                System.out.println("????: Hey! Who do you think you are just barging in like that?");
                System.out.println("????: Forget it, what's your name anyways?");
                String name3 = advScanner.nextLine();
                System.out.println("???: " + name3 + "? Welcome aboard, " + name3 + ".");
                System.out.println("Ash: My name is Ash. I'm a Pokemon Trainer from Pallet Town. Meet my best friend, Pikachu!");
                System.out.println("Pikachu: PIKAAA!!!!");
            } else if (startSelect == 4) {
                count++;
                System.out.println("????: Hey, punk! Who the hell do you think you are?!");
                System.out.println("????: Whatever, just don't let it happen again.");
                System.out.println("????: Could your rude ass at least give me your name?");
                String name4 = advScanner.nextLine();
                System.out.println("???? :" + name4 + "? That's a stupid name!");
                System.out.println("Yusuke: I'm Yusuke and I'm this planet's Spirit Detective. Might mistake you for a demon and you'll be eating a Spirit Gun sandwich next time!");
            } else {
                count++;
                System.out.println("????: Wow, that was quite the entrance. I've seen some things in my years, but that was something.");
                System.out.println("????: Well, for crash landing through my roof, you owe me your name at the least. What is it?");
                String name4 = advScanner.nextLine();
                System.out.println("???? :" + name4 + "? I foresee great adventures for you, " + name4 + ".");
                System.out.println("Roshi : I go by Turtle Hermit or Master Roshi, whichever you prefer. Welcome to Kame House.");
            }
            return "";
        }
        return "";
    }
}

