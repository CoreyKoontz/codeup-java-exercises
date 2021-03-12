//package movies;
//
//import util.Input;
//
//import java.util.Arrays;
//
//public class MoviesApplication {
//
//    public static void main(String[] args) {
//
//        System.out.println("What would you like to do?\n" +
//                "0 - exit\n" +
//                "1 - view all movies\n" +
//                "2 - view movies in the animated category\n" +
//                "3 - view movies in the drama category\n" +
//                "4 - view movies in the horror category\n" +
//                "5 - view movies in the scifi category\n" +
//                "Enter your choice: ");
//
//        Input user = new Input();
//
//        int userChoice = user.getInt(0, 5);
//
//
//
//        switch (userChoice) {
//            case 0:
//                System.out.println("Goodbye");
//                break;
//            case 1:
//                System.out.println("Viewing all movies:\n");
//                for (Movie movie : MoviesArray)
//                System.out.println(Arrays.toString(Movie.movie));
//
////        }
//
//    }
//
//}
