package shapes;

public class Square extends Quadrilateral{

    // ------------------------------------------------------ Constructor:
    public Square(double side) {
        super(side, side);
    }

    // ------------------------------------------------------ Setters: (Override)
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    // ------------------------------------------------------ Getters: (Override)
    @Override
    public double getPerimeter() {
        return ((int)Math.pow(super.length, 2));
    }

    @Override
    public double getArea() {
        return 4 * super.length;
    }


    //   // Without super keyword we can do it like this:
//    public Square(int side) {
//        this.length = side;
//        this.width = side;
//    }
//
//    // With super keyword this is all we need:
//    public Square(int side) {
//        super(side, side);
//    }
//
//    // Overriding getArea() and getPerimeter() Getter methods:
//    @Override
//    public int getArea() {
//        return 4 * super.length; // tested with different numbers and it worked
//    }
//
//    @Override
//    public int getPerimeter() {
//        return ((int)Math.pow(super.length, 2));
//    }
//

}
