import java.util.Random;

public class ServerNameGenerator {

     static String[] adjectives = {
            "blue",
            "bad",
            "better",
            "clever",
            "clean",
            "delightful",
            "cloudy",
            "colorful",
            "dizzy",
            "curious"
    };

    static String[] nouns = {
            "advertisement",
            "afternoon",
            "airport",
            "animal",
            "apple",
            "balloon",
            "banana",
            "bird",
            "camera",
            "candle",
    };

    // Method for generating a random int that can be used for selecting
    // a random index number in the randomString method.
    public static int randomInt(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    // Method for retuning a random element of an array of strings:
    public static String randomString (String[] stringArr) {
        int randomIndex = randomInt(0, stringArr.length); // Generating a random index
        return stringArr[randomIndex];
    }



    public static void main(String[] args) {

        System.out.println(
                "Here is your dedicated server name:\n"
                + randomString(adjectives)
                + "-"
                + randomString(nouns)
        );

        // Had to make the String arrays static in order for this to work.
        // Not clear why
    }

}
