import java.util.Scanner;

public class bob {

    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to talk to a lackadaisical teenager? Yes or No");
        String userPerm = sc.nextLine();

        if (userPerm.equalsIgnoreCase("yes")) {
            System.out.println("Meet Bob");
            String userInp = sc.nextLine();
            String lastChar = userInp
                    .trim()
                    .substring(userInp.length() - 1); // gets the last character in the line

            if (lastChar.equals("?")) {
                System.out.println("sure");
            }
            if (lastChar.equals("!")) {
                System.out.println("Whoa, chill out!");

            }
            if (lastChar.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
        } else {
            System.out.println("Probably for the best");
        }

    }

}
