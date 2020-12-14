package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle(5, 4);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());

        Rectangle shape2 = new Square(5);
        System.out.println(shape2.getArea());
        System.out.println(shape2.getPerimeter());

        Square shape3 = new Square(6);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());

    }
}