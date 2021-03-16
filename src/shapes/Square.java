package shapes;

public class Square extends Rectangle{

//   // Without super keyword we can do it like this:
//    public Square(int side) {
//        this.length = side;
//        this.width = side;
//    }

    // With super keyword this is all we need:
    public Square(int side) {
        super(side, side);
    }

    // Overriding getArea() and getPerimeter() Getter methods:
    @Override
    public int getArea() {
        return 4 * super.length; // tested with different numbers and it worked
    }

    @Override
    public int getPerimeter() {
        return ((int)Math.pow(super.length, 2));
    }


}
