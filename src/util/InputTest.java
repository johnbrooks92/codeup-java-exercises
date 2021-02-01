package util;

public class InputTest {

    public static void main(String[] args) {

        Input runInput = new Input();

        System.out.println(runInput.getString());
        System.out.println(runInput.yesNo("Would you like to view grades for another student?"));
        System.out.println(runInput.getInt(1, 10));
        System.out.println(runInput.getInt());
        System.out.println(runInput.getDouble(1, 10));
        System.out.println(runInput.getDouble());

    }

}
