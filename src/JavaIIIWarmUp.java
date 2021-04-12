public class JavaIIIWarmUp {


    public static boolean sameFirstAndLast(String name) {
        String trimmedName = name.trim();
        char firstChar = Character.toLowerCase(trimmedName.charAt(0));
        char lastChar = Character.toLowerCase(trimmedName.charAt(trimmedName.length() -1));

        return 
                firstChar == lastChar;
       

    }

    public static void main(String[] args) {

    }
}
