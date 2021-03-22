package util;

import java.util.Scanner;

public class InputTest {

    // ------------------------------------------------------ Fields/Properties:

    private Scanner sc;


    // ------------------------------------------------------ Constructor:

    // Creates a new instance of the Scanner class every time it is called
    public InputTest(){
        this.sc = new Scanner(System.in);
    }


    // ------------------------------------------------------ Main Method:

    public static void main(String[] args) {
        Input input = new Input();// <-Creates an Instance of an
                                  //   Input object when 'input' is called.

//        // getString method:
//        // Will return string value no matter what is entered.
//        System.out.println("getString() TEST\nEnter a string:");
//        String getStringInput = input.getString();
//        System.out.println("PASS\nString entered: " + getStringInput);
//
//
//        // yesNo Method:
//        System.out.println("yesNo() TEST\nEnter Y for true and N for false: ");
//        boolean yesNoInput = input.yesNo();
//        if (yesNoInput) {
//            System.out.println("PASS\nYour input returned true");
//        } else {
//            System.out.println("PASS\nYour input returned false");
//        }
//
//
//        //  getInt Method:
//        System.out.println("getInt Test\nEnter an Integer:");
//        int getIntInput = input.getInt();
//        System.out.println("PASS\nYour integer is: " + getIntInput);


        // gitInt(min, max) Method:
        System.out.println("getInt(min, max) TEST\nEnter a number between 1 and 10:");
        int gitIntInput = input.getInt(1, 10);


        // getDouble method
        System.out.println("Enter a double");
        double userInput = input.getDouble();
        System.out.println("your Double is: " + userInput);
//
//        //gitDouble(min, max)
//        System.out.println("Enter a double between 1.5 and 10.5:");
//        double userInput = input.getDouble(1.5, 10.5);

    }

}
