import java.util.Scanner;
public class ControlFlowExercise {

    public static void main(String[] args) {

        //-------- Loop Basics -----------------------------------------

//       int i = 5;
//       while (i <= 15) {
//           System.out.print(i);
//           i++;
//       }

//
//        double i = 2;
//            do {
//                System.out.println((int) i);
//                i = Math.pow(i, 2);
//            } while (i < 1000000);


//          for (int i = 5; i <= 15; i++) {
//              System.out.println(i);
//          }

//            for (double i = 2; i < 1000000; i = Math.pow(i, 2)) {
//                System.out.println( (int) i );
//            }


        //-------- Fizzbuzz --------------------------------------------------------
//
//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }
//            if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }
//            else {
//                System.out.println(i);
//            }
//        }

        //-------- Table of Powers --------------------------------------------------

        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter an Integer:");
//        int userInt = sc.nextInt();
//        System.out.println(" number | square | cubed ");
//        System.out.println(" ------ | ------ | ----- ");
//        for (int i = 1; i <= userInt; i++) {
//            System.out.println(" " + i + "      |" + " " + ((int)Math.pow(i, 2)) + "     |" + " " + ((int)Math.pow(i, 3)));
//        }
        //Need to add the continue option

        //-------- Grades into letter grades -------------------------------------------

        System.out.println("Enter a numerical grade from 0 to 100");
        int userGrade = sc.nextInt();

        System.out.println("Would you like to know your letter grade? Yes or No");
        String userCont = sc.next();

        if (userCont.equalsIgnoreCase("yes")) {

            if (userGrade >= 88) {
                System.out.println("You got an A");
            }
            if (userGrade >= 80 && userGrade < 87) {
                System.out.println("You got a B");
            }
            if (userGrade >= 67 && userGrade < 79) {
                System.out.println("You got a C");
            }
            if (userGrade >= 60 && userGrade < 66) {
                System.out.println("you got a D");
            }
            if (userGrade <= 59) {
                System.out.println("you got an F");
            }

        } else {
            System.out.println("Maybe next time");
        }

            //----------- Lecture Notes -------------------------------------------------

            // ==================== Slide 3

            // no >== ,or <==, or === because only value comparisons are available
            // truthy and falsy values don't exist in Java


            // ==================== Slide 5

            // && will only check second value if first is true
            // & will check both
            // this can be used to check what would otherwise result in a syntax error
            // same comparison process for || and |

            // x will only increment in second condition if first condition is true using &&
//                int x = 2;
//                int y = 3;
//
//                if (false && ++x == y) {                // - With the && both sides have to be true,
//                    System.out.println("Equal");        //   so the second value isn't even ran.
//                } else {                                // - If we us & both sides are evaluated no
//                    System.out.println("Not equal");    //   matter what the code will run and because
//                }                                       //   of this the value of x will change.
//                System.out.println(x);


            // ==================== Slide 7

            // DO NOT COMPARE STRINGS WITH == !!!!
            // Strings are not primitive values

            // System.out.println("bob" == "bob");  // This will look like its comparing strings but its not.
            // It is actually comparing objects.
            // Instead use equals()

//                Scanner sc = new Scanner(System.in);
//                String cat1 = sc.nextLine();
//                String cat2 = "cat";
//                System.out.println(cat1);
//                System.out.println(cat2);
//                System.out.println(cat1 == cat2);

            // do use equals(),

//    boolean stringValuesAreEqual = "Test".equals("Tes");            // this would be false unless we change it to "Test"
//    System.out.printf("The result is: %s", stringValuesAreEqual);


            // or use equalsIgnoreCase()  // This will ignore the letter case

//String hello = "hello";
//System.out.println(hello.equalsIgnoreCase("HeLlO"));

            // does not equal // Use a bang (!)

//String tech = "tech";
//System.out.println(!tech.equalsIgnoreCase("tool"));


            // ==================== Slides 8 - 16

            // basically the same as JS :)

            // Some thing to keep in mind are the for loops. not using var or let
            //      for(int i = 0; ...


//            String caseSwitch = "Fred";
//            switch (caseSwitch) {
//                case "bob":
//                    System.out.println("Case 1");
//                    break;
//                case "fred":
//                    System.out.println("Case 2");
//                    break;
//                default :
//                    System.out.println("Default case");
//                    break;
//            }


        }

    }


