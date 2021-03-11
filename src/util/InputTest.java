package util;

import java.util.Scanner;

public class InputTest {

    private Scanner sc;

    // Constructor:
    public InputTest(){
        this.sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Input input = new Input();

        // getString method:
        String userInput = input.getString();
        System.out.println(userInput);
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
//        //  getInt Method:
//        System.out.println("Enter an Integer:");
//        int userInput = input.getInt();
//        System.out.println("Your integer is: " + userInput);
//
//        //  gitInt(min, max)
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
