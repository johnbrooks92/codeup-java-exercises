import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("talk to Bob: ");
        String response = input.nextLine();

        if (response.endsWith("?")) {
            System.out.println("Sure.");
        } else if (response.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (response.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}