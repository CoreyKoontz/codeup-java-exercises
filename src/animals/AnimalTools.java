package animals;

import java.util.Scanner;

public class AnimalTools {

    // TODO-Take in user input that decides whether they want details
    //  about a dog or wolf

    public static void getCanineDetails(){

        Canine canine;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 'dog' or 'wolf' to know its details: ");

        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("dog")){
            canine = new Dog("Bork! Bork!", "Large", "Canis Lupus Familiaris",
                    "German Shepherd Dog", "Black and Tan");
        } else {
            canine = new Wolf("Hoooowwwwwwlll!", "Medium", "Canis Lupus Occidentalis",
                    "Northwestern Wolf", false, "North America");

        }
        canine.printDetails();

        System.out.println("Would you like more details on a canine? (yes/y)");

        String response = scanner.nextLine().toLowerCase();

        if (response.equals("yes") || response.equals("y")){
            getCanineDetails();
        } else {
            animalPicker();
        }
    }

    public static void getFelineDetails() {

        Feline feline;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 'cat' or 'tiger' to know its details: ");

        String input = sc.nextLine();

        if (input.equalsIgnoreCase("cat")) {
            feline = new Cat(12, "Persian Cat", "Cat Food", "Meow", "White/Grey");
        } else {
            feline = new Tiger(660,"Siberian Tiger", "elk, deer, wild boar, lynx and bear", "Roar", true, "Asia" );
        }

        feline.printDetails();

        System.out.println("Would you like more details on a feline? (yes/y)");

        String response = sc.nextLine().toLowerCase();

        if (response.equals("yes") || response.equals("y")){
            getFelineDetails();
        } else {
            animalPicker();
        }
    }

    public static void animalPicker() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to know about canines or felines?\n" +
                "Enter 'canines' or 'felines': ");

        String result = sc.nextLine();

        if (result.equalsIgnoreCase("canines")) {
            getCanineDetails();
        } else if (result.equalsIgnoreCase("felines")){
            getFelineDetails();
        } else {
            System.out.println("Invalid input. Try again.");
            animalPicker();
        }

    }

}
