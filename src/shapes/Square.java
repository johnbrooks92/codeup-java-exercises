package shapes;

public class Square extends Rectangle {

    public Square(int s) {
        super(s, s);
    }

    @Override
    public int getArea() {
        System.out.println("Calculating Area:");
        return this.width * this.length;
    }

    @Override
    public int getPerimeter() {
        System.out.println("Calculating Perimeter:");
        return this.length * 4;
    }
}