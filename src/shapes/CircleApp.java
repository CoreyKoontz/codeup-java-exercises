package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter the radius of a circle");
        double radius = input.getDouble();
        Circle circle = new Circle(radius);
        System.out.println("The area is: \n" + circle.getArea());
        System.out.println("The circumference is: \n" + circle.getCircumference());

    }

}
