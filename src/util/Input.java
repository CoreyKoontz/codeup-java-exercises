package util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {

    private Scanner sc; // creating a private scanner object

    // Constructor: sets the value of scanner to an instance of the Scanner class
    public Input (){
        this.sc = new Scanner(System.in);
        // -Instead of passing the scanner object we are going to
        //  instantiate inside of the the constructor.
        // -This will set the value of the scanner everytime we
        //  instantiate an Input class.
    }

    // Returns a string from the user.
    public String getString() {
        System.out.println("Enter a string:");
        return sc.nextLine();
    }

    public boolean yesOrNo() {
        String input = sc.next(); // grabbing input from the user
        return (input.equalsIgnoreCase("y"));
        // Returning false if anything other than "y/Y" is entered
    }

    // Doing
    public int getInt() {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Input invalid. Try again.");
            sc.nextLine(); // Clearing the invalid input
            return getInt(); // Recursion
        }
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            System.out.println("Your integer is within range.");
            return userInt;
        } else {
            System.out.println("Out of Range. Enter a number between " + min + " and " + max);
            sc.nextLine(); // Clearing the invalid input
            return getInt(min, max); // Recursion
        }
    }

    public double getDouble() {
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("invalid input. Try again.");
            sc.nextLine(); // Clearing the invalid input
            return getInt(); // Recursion
        }
    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            System.out.println("Your double is within range.");
            return userDouble;
        } else {
            System.out.println("Out of Range. Enter a double between " + min + " and " + max + ":");
            sc.nextLine(); // Clearing the invalid input
            return getDouble(min, max); // Recursion
        }
    }

    public static void main(String[] args) {

        Input input = new Input(); // Creating an instance of our Input class

//       // getString method: retrieving a string from the user
//        String userInput = input.getString();
//        System.out.println(userInput);
//
//        // yesOrNo Method:
//        System.out.println("Enter Y for true and N for false");
//        boolean userInput = input.yesOrNo();
//        if (userInput) {
//            System.out.println("Your input returned true");
//        } else {
//            System.out.println("Your input returned false");
//        }
//
//       //  getInt Method:
//        System.out.println("Enter an Integer:");
//        int userInput = input.getInt();
//        System.out.println("Your integer is: " + userInput);
//
//       //  gitInt(min, max)
//        System.out.println("Enter a number between 1 and 10:");
//        int userInput = input.getInt(1, 10);
//
//        // getDouble method
//        System.out.println("Enter a double");
//        double userInput = input.getDouble();
//        System.out.println("your Double is: " + userInput);
//
//        //gitDouble(min, max)
//        System.out.println("Enter a double between 1.5 and 10.5:");
//        double userInput = input.getDouble(1.5, 10.5);


    }


}
