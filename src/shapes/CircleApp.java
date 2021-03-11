package shapes;

import util.Input; // Importing from the Input class we already created so that we can use its objects
                   // Make sure the Input class isn't broken/ commented out or it will not work

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input(); // Define the Input object
        System.out.println("Enter the radius of a circle"); // Prompt user
        double radius = input.getDouble(); // Get user input
        Circle circle = new Circle(radius); // extract the value of the radius from the user input
        System.out.println("The area is: \n" + circle.getArea());
        System.out.println("The circumference is: \n" + circle.getCircumference());

    }

}
