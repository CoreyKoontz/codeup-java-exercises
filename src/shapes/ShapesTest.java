package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Quadrilateral myShape;

        // New instance of a rectangle:
        myShape = new Rectangle(23, 53);
        System.out.println("Box1 Perimeter: " + myShape.getPerimeter());
        System.out.println("Box1 Area: " + myShape.getArea());

        // New instance of a square:
        myShape = new Square(45);
        System.out.println("Box2 Perimeter: " + myShape.getPerimeter());
        System.out.println("Box2 Area: " + myShape.getArea());

//        System.out.println(myShape.getWidth()); // Cannot resolve because the constructor that assigns
                                                  // is in the abstract Quadrilateral class


    }
}
