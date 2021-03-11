package util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {

    private Scanner sc;

    // Constructor:
    public Input (){
        this.sc = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter a string:");
        return sc.nextLine();
    }

    public boolean yesOrNo() {
        String input = sc.next();
        return (input.equalsIgnoreCase("y"));
    }

    public int getInt() {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Input invalid. Try again.");
            sc.nextLine(); // Clearing the invalid input
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            System.out.println("Your integer is within range.");
            return userInt;
        } else {
            System.out.println("Out of Range. Enter a number between " + min + " and " + max);
            sc.nextLine();
            return getInt(min, max);
        }
    }

    public double getDouble() {
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("invalid input. Try again.");
            sc.nextLine();
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            System.out.println("Your double is within range.");
            return userDouble;
        } else {
            System.out.println("Out of Range. Enter a double between " + min + " and " + max + ":");
            sc.nextLine();
            return getDouble(min, max);
        }
    }

    public static void main(String[] args) {

        Input input = new Input();

       // getString method:
        String userInput = input.getString();
        System.out.println(userInput);

        // yesOrNo Method:
        System.out.println("Enter Y for true and N for false");
        boolean userInput = input.yesOrNo();
        if (userInput) {
            System.out.println("Your input returned true");
        } else {
            System.out.println("Your input returned false");
        }

       //  getInt Method:
        System.out.println("Enter an Integer:");
        int userInput = input.getInt();
        System.out.println("Your integer is: " + userInput);

       //  gitInt(min, max)
        System.out.println("Enter a number between 1 and 10:");
        int userInput = input.getInt(1, 10);

        // getDouble method
        System.out.println("Enter a double");
        double userInput = input.getDouble();
        System.out.println("your Double is: " + userInput);

        //gitDouble(min, max)
        System.out.println("Enter a double between 1.5 and 10.5:");
        double userInput = input.getDouble(1.5, 10.5);






    }


}
