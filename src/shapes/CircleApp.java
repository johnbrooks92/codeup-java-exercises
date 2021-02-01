package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        circleTracker();
    }

    public static void circleTracker() {
        Input input = new Input();
        int count = 0;
        do {
            double userRadius = input.getDouble();
            Circle circle = new Circle(userRadius);
            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());
            System.out.println("Would you lie to try again?");
            input.yesNo("Would you like to view grades for another student?");
            count++;
        } while (input.yesNo("Would you like to view grades for another student?"));
        System.out.println(count + " Circles created");
    }
}
