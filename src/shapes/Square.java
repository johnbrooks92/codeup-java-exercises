package shapes;

    public class Square extends Quadrilateral {


        public Square(double side) {
            super(side, side);
        }

        @Override
        public double getArea() {
            System.out.println("The area of this square is:");
            return this.length * this.length;
        }

        @Override
        public double getPerimeter() {
            System.out.println("The perimeter of this square is:");
            return this.length * 4;
        }

        @Override
        public void setLength(double length) {
            this.length = length;
        }

        @Override
        public void setWidth(double width) {
            this.width = width;
        }
    }