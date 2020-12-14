import java.lang.reflect.Array;
import java.util.Arrays;

public class ServerNameGenerator {
    private static final String[] adjective = {"aggressive", "ambitious", "eager", "austere","",
            "spry", "whimsical", "minty", "lopsided", "insubstantial", "jovial"};
    private static final String[] noun = {"ninja", "saiyan", "jedi", "sith", "trainer",
            "athlete", "developer", "emerald", "greyscale", "hero", "titan"};
    public static String randomString(String[] nounAdj) {
        double randomNum = Math.floor(Math.random() * nounAdj.length);
        return nounAdj[(int) randomNum];
    }
    public static void main(String[] args) {
        System.out.printf("Your random server name is:\n%s-%s", randomString(adjective), randomString(noun));
    }
}