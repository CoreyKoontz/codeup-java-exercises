import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        initializedGame();
    }

    public static void initializedGame(){
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 100) + 1;
        System.out.println("Guess a number between 1 and 100: ");

        playGame(scanner, randomNumber);
    }


    public static void playGame(Scanner scanner, int randomNumber) {

//        System.out.println("Guess a number between 1 and 100: ");

        int userGuess = scanner.nextInt();

        if (userGuess < 1 || userGuess > 100) {
            System.out.println("Your guess is out of range, try again.");
            playGame(scanner, randomNumber);
        } else {

            String response = checkGuess(userGuess, randomNumber);

            if (response.equals("You guessed the correct number!")) {
                System.out.println(response);

            } else {
                System.out.println(response);
                playGame(scanner, randomNumber);
            }
        }
    }

    public static String checkGuess(int guess, int targetNum) {
        if (guess == targetNum) {
            return "You guessed the correct number!";
        }else if (guess > targetNum) {
            return "Pick a lower number";
        }else if (guess < targetNum) {
            return "Pick a higher number";
        }
        return "jlk";
    }


}
