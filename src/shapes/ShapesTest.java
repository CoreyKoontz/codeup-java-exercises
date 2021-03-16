package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        // New instance of a rectangle:
        var box1 = new Rectangle(4, 5);
        System.out.println("Box1 Perimeter: " + box1.getPerimeter());
        System.out.println("Box1 Area: " + box1.getArea());

        // New instance of a square:
        var box2 = new Square(5);
        System.out.println("Box2 Perimeter: " + box2.getPerimeter());
        System.out.println("Box2 Area: " + box2.getArea());




    }
}
