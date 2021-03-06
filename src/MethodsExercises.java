import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        System.out.println(addition(5, 10));
//        System.out.println(subtraction(5, 10));
//        System.out.println(multiplication(5, 10));
//        System.out.println(division(5, 10));
//        System.out.println(modulus(5, 10));
//        getInteger(1, 10);
//        getUserNum();


    }

//----------- Method Exercises ---------------------------------


// 1.
//    public static int addition (int x, int y) {
//        return x + y;
//    }
//
//    public static int subtraction (int x, int y) {
//        return x - y;
//    }
//
//    public static int multiplication (int x, int y) {       // return (x / (1 / y)) does not work. Why?
//
//
//    }
//
//    public static int division (int x, int y) {
//        return x / y;
//    }
//
//    public static int modulus (int x, int y) {
//        return x % y;
//    }
//
// 2.
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10");
//        int userNum = sc.nextInt();
//        if ((userNum < min) || (userNum > max)) {
//            getInteger(min, max);  //--------------------> Recursion instead of while loop
//            userNum = sc.nextInt();
//        }
//        System.out.printf("Yes, %d is in range", userNum);
//        return userNum;
//    }

    // DRY: Don't repeat yourself

//    public static boolean isBetween(int min, int max, int check) {
//        return (min <= check && max >= check);
//    }
//
//    // DRY: Don't repeat yourself
//
//    public static int getRangeInput(int min, int max, Scanner input) {
//        System.out.println("enter an number between " + min + " and " + max + ":");
//        return input.nextInt();
//    }



//    // 3.
//    public static void getUserNum() {
//        Scanner sc = new Scanner(System.in);
//        int userInput = getRangeInput(1, 16, sc);
//        System.out.println(Factorial(userInput));
//    }
//
//    public static int Factorial(int userInput) {
//        if ( userInput == 0) {
//            return 0;
//        } else {
//            int currentVal = (userInput * Factorial(userInput - 1));
//            System.out.printf("%d! = %d\n", userInput, currentVal);
//            return currentVal;
//        }
//
//    }

    // 4.
//    public static void getNumberOfSides() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of sides for a pair of dice:");
//        int userInput = sc.nextInt();
//    }
//
//    public static boolean rollDice() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Roll the dice? Yes or No.");
//        boolean diceRolled = (sc.hasNextLine().equals("yes"));
//    }

//----------- Method Notes -------------------------------------

    // --------- Access Modifiers --------------

//    public static String tryGetSalutation(String name) {
//
//        if((name == null) || (name.equals(""))) { // ** This is a Check
//        return "No name provided";
//        } else {
//            return getSalutation(name, "Hello, ");
//        }
//    }
//
//    public static String getSalutation(String name, String greeting) {
//        return greeting + name.toUpperCase();
//    }
//
//
//    // Static vs Instance
//
//    public static int doTheMathStatic(){
//        return 1 + 2;
//    }
//
//    public int doTheMathInstance() {
//        return 1 + 2;
//    }
//
//
//    // *** Returning vs Void ***
//
//    public static String getGreeting () {
//        return "Hi";
//    }
//
//    public static void printGreeting() {
//        System.out.println();
//    }
//

    /* TODO:
     *   -Write a public static method which returns an integer
     *   -The method should take in *two parameters* and *return* the product of multiplying them
     *   -Print the output to the console by calling the method, passing in params, and logging its output
     *   BONUS: Use the Scanner class to get the numbers from the user input
     * */


//    public static void main(String[] args) {
////        getX();
////        getY();
////        productOf(x, y);
//        printProduct();
//
//
//    }
//
//
//    public static int getX() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is the value of x?");
//        int x = sc.nextInt();
//        return x;
//    }
//    public static int getY() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Whats the value of y?");
//        int y = sc.nextInt();
//        return y;
//    }
//    public static int productOf(int x, int y) {
//        return x * y;
//    }
//    public static void printProduct() {
//        System.out.println(productOf(getX(), getY()));
//    }


    // *** Method Overloading ***

//    public static int doMath() {
//        return 1 + 1;
//    }
//
//    // !!!!!!!! ALL we are changing is parameters !!!!!!!!
//
//    public static int doMath(int num1) {
//        return num1 + (1 + 1);
//    }
//
//    public static int doMath(int num1, int num2) {
//        return num1 + num2;
//    }

    // ---- Overloading Exercise ----------------------------

    /* TODO: Write a set of overloaded public static void methods which can take in 1-3 names and print them to the console
     *   -Call each of the methods, passing in the names for each
     *   -Minus 1000pts if you don't use an oxford comma on the 3 param version
     *   BONUS: Use the Scanner class to get the names from user input
     * Bonus: create a logic method that
     *  */
//    Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        takeNames("jim", "mike", "pam");
//
//    }
//
//
//        public static void takeNames (String name1){
//            System.out.printf("Hello, %s.", name1);
//        }
//        public static void takeNames (String name1, String name2){
//            System.out.printf("Hello, %s and %s.", name1, name2);
//
//        }
//        public static void takeNames (String name1, String name2, String name3){
//            System.out.printf("Hello, %s, %s, and %s.", name1, name2, name3);
//
//        }

//------ Extra Exercises -----------------------------------------------------


//    public static void main(String[] args) {
////        firstChar("hello");
////        secondChar("hello");
////        lastChar("hello");
////        secondToLastChar("hello");
////        userWantsToContinue();
////        isEven(4);
////        countOdds(2,25);
////        isVowel('e');
////        hasVowels("does this have vowels");
////        printName("Corey", 10);
//        System.out.println(sum(10));
//
//    }


//    // Write a method named firstChar() that takes a string as an input and returns the first letter as a character data type.
//    public static char firstChar(String input) {
//        return (input.charAt(0));
//    }
//
//    //Write a method named secondChar() that takes a string as an input and returns the second letter as a character data type.
//    public static char secondChar(String input) {
//        return (input.charAt(1));
//    }
//
//    //Write a method named lastChar() that takes a string as an input and returns the last letter as a character data type.
//    public static char lastChar(String input) {
//        return (input.charAt(input.length() - 1));
//    }
//
//    //Write a method named secondToLastChar() that takes a string as an input and returns the second to letter as a character data type.
//    public static char secondToLastChar(String input) {
//        return (input.charAt(input.length() - 2));
//    }
//
//    //Write a method named userWantsToContinue(). This method should prompt the user if they want to continue and then return a boolean value if the user inputs "y" or "yes".
//    public static boolean userWantsToContinue() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Yes or No");
//        String userInput = sc.next();
//        boolean userCon = false;
//        if (userInput.equalsIgnoreCase("yes")) {
//            userCon = true;
//            System.out.println("user wants to continue");
//        }
//        return userCon;
//    }
//
//
//    //Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.
//    public static boolean isEven(int num) {
//        boolean even = false;
//        if (num % 2 == 0) {
//            even = true;
//            System.out.println("even");
//        }
//        return even;
//    }
//
//    //Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.
//    public static boolean isOdd(int num) {
//        boolean odd = false;
//        if (num % 2 != 0) {
//            odd = true;
//            System.out.println("odd");
//        }
//        return odd;
//    }
//
//    //Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.
//    public static int countOdds(int start, int end) {
//        int oddCount = 0;
//        for (int i = start; i < end; i++) {
//            if (i % 2 != 0) {
//                oddCount++;
//            }
//        }
//        System.out.println(oddCount);
//        return oddCount;
//
//    }
//    //Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.
//    public static int countEvens(int start, int end) {
//        int evenCount = 0;
//        for (int i = start; i < end; i++) {
//            if (i % 2 == 0) {
//                evenCount++;
//            }
//        }
//        System.out.println(evenCount);
//        return evenCount;
//    }
//    //Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y".
//    public static boolean isVowel(Character input) {
//        boolean vowel = false;
//        if (input == 'a'||input == 'e'||input == 'i'||input == 'o'||input == 'u'||
//            input == 'A'||input == 'E'||input == 'I'||input == 'O'||input == 'U'){
//            vowel = true;
////            System.out.println("Is vowel");
//        } else {
//            vowel = false;
////            System.out.println("Is not a vowel)";
//        }
//        return vowel;
//    }
//    //Write a method named hasVowels() that accepts a string of any length and returns a boolean if there are any vowels in that string.
//    public static boolean hasVowels(String input) {
//        boolean anyVowels = false;
//        for (Character i = input.charAt(0); i < input.length(); i++) {
//            if (isVowel(i)) {
//                anyVowels = true;
//                System.out.println("this string has vowels");
//            }
//            else {
//                anyVowels = false;
//                System.out.println("there are no vowels in this string");
//            }
//        }
//        return anyVowels;
//    }
    //Write a method named countVowels() that accepts a string of any length and returns an integer count of the number of vowels in the provided input String.
    //Write a solution to FizzBuzz using recursion instead of a loop.
    //Write a method named isPrime() that that accepts in an integer number and returns a boolean if the number is evenly divisible only by either 1 or the number itself.
    //Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.


//--- Recursion ----------------------
    // - Recursion is calling a method inside of itself
    // - Must have some kind of condition to stop the recursive method.

//    public static void printName (String name, int numTimesToRun) {
//
//        if (numTimesToRun > 0) {
//            System.out.println(name);
//            printName(name, numTimesToRun -1); // Setting the condition to stop the recursive method
//        }
//    }
//
//    // create a method that adds a number to the next number below it
//    public static int sum (int k) {
//        if (k > 0) {
//            return k + sum(k - 1);
//        } else {
//            return 0;
//        }
//    }






}