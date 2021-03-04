
import java.util.Scanner;

public class ConsoleExercises {

    // Exercise 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f", pi);

    // Exercise 2
        // 1.
//        System.out.println("Enter an integer:");
//        int userInt = sc.nextInt();
//        System.out.println(userInt);
        // If the user does not enter an integer we get an error

        // 2.
//        System.out.println("Enter 3 words:");
//        String firstWord = sc.next();
//        String secondWord = sc.next();
//        String thirdWord = sc.next();
//        System.out.printf("1. %s\n2. %s\n3. %s", firstWord, secondWord, thirdWord);

        // 3./ 4.
//        System.out.println("Enter a sentence:");
//        String userSentence = sc.nextLine();
//        System.out.println(userSentence);

    // Exercise 3
        // 1
        System.out.println("What is the length of the codeUp classroom?");
        String length = sc.nextLine();
        System.out.println("What is the width of the codeUp classroom?");
        String width = sc.nextLine();
        double lengthInt = Double.parseDouble(length);
        double widthInt = Double.parseDouble(width);
        double area = lengthInt * widthInt;
        double perimeter = ((lengthInt * 2) + (widthInt * 2));
        System.out.printf("The area of the codeup classroom is %.2f and the perimeter is %.2f", area, perimeter);





//------------- Lecture Notes --------------------------------------------------------------

        // ================================== print() and println()

        // this:
//            System.out.println("here");
//            System.out.println("there");

        // is equivalent to this:
//            System.out.print("here\n");
//            System.out.print("there\n");

        // without the newline characters, print outputs this:
//            System.out.print("here");
//            System.out.print("there");

        // to concatenate, just like JS:
//            System.out.println("Hello" + " " + "World");

        // ================================== printf() / .format()

        // Print a formatted string using the following... printf(formatString, data)

        // same output as print():
//            System.out.printf("Hello");
//            System.out.printf("World!");

        // creating a string variable:
//            String bigBall = "World";
//            System.out.printf("Hello %s", bigBall);
//            System.out.printf("Hello %S", bigBall); // all caps
        // This is a little similar to string templates in js
//              String firstN = "Corey";
//              String lastN = "Koontz";
//              System.out.printf("%s %s", firstN, lastN);

        // multiple variables:
//            int three = 3;
//            String typeOfPetGroup = "cats";
//            System.out.printf("I have %d %s.", three, typeOfPetGroup);

        // currency:
//            int currencyPennies = 1431;
//            System.out.printf("I'll sell you swamp land for $%.2f an acre!", currencyPennies / 100.00);
            // the .2 is to give you 2 decimal places

//            int age = 23;
//            String name = "Fred";
//            String state = "Texas";
//            System.out.printf("%s is from %s and is %d years old", name, state, age);
        // Fred is from Texas and is 23 years old.


        // ================================== USER INPUT

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your first name:");
//        String userFname = sc.next();
//        System.out.println("please enter your last name");
//        String userLname = sc.next();
//        System.out.printf("%s %s", userFname, userLname);

      //--- MINI Exercise ---------------------------------
      // todo:    use the scanner to take in the name of the month you were born and print it back out
        //            - remember to first prompt the user for the input

//        System.out.println("What month were you born in?");
//        String userMonth = sc.next();
//        System.out.println(userMonth);

        // user input with numbers
//        System.out.println("Please inter your age");
//        int age = sc.nextInt();
//        System.out.println(age);

        // .next() captures each input separated by a string:
        // It will assume that the white space between the inputs is the separator
//            System.out.print("Please enter your first, middle, and last name: ");
//            String firstName = sc.next();
//            String lastName = sc.next();
//            String what = sc.next();
//
//            System.out.println(firstName);
//            System.out.println(lastName);
//            System.out.println(what);

        // .nextInt() captures the first valid int value:
//            System.out.print("Please enter your age: ");
//            int age = sc.nextInt();
//            System.out.println(age);

        // .nextLine():
//            System.out.print("Favorite quote: ");
//            String quote = sc.nextLine();
//            System.out.println(quote);

        // Quirk of using next() then nextLine()...
        // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        // https://coderanch.com/wiki/676482/Scanner-nextLine-gotcha
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Please enter your favorite number: ");
//            int num = sc.nextInt();
//            System.out.println(num);
//            System.out.print("Please enter your favorite words: ");
//            String words = sc.nextLine();
//            System.out.println(words);


        //----- MINI Exercise ------------------------------------------------
        /* TODO: use the scanner to take in your birthday as an integer and then name of the month you were born and print it back out
            - remember to first prompt the user for the birthday day of the month and store as an integer
            - next take in name of the month with .nextLine()
            - print out the result
            - use a fix to prevent the month name input from being skipped
         */

//        System.out.println("What day of the month were you born?");
//        int userDay = sc.nextInt();
//        System.out.println("What month were you born?");
//        sc.nextLine();
//        String userMonth = sc.nextLine();
//        System.out.printf("You were born on %s %d.", userMonth, userDay);

    }
}
