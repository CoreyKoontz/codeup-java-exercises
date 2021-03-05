import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args) {

//------- Exercise 1 ----------------------------

//        String theWall = "We don't need no education \nWe don't need no thought control";
//        System.out.println(theWall);

//        String message = "Check \"this\" out! \"s inside of \"s!";
//        System.out.println(message);

//        String windows = "In windows, the main drive is usually C:\\";
//        System.out.println(windows);

//        String backslash ="I can do backslashes \\, double backslashes \\\\, \nand the amazing tripple backslash \\\\\\!";
//        System.out.println(backslash);

//------- Exercise 2 -----------------------------

        class bob {
            public void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Talk to bob");
//                String userInp =


            }
        }

//--------- String Notes --------------------------------------------------------------------

//        .equals(String anotherString)

//        String one = "2";
//        String two = "2";
//        System.out.println(one.equals(two));


//        .equalsIgnoreCase(String anotherString)

//        String greeting = "howdy";
//        System.out.println(greeting.equalsIgnoreCase("HoWDy"));


//        .startsWith(String prefix)

//        String title = "Dr. Doctor";
//        boolean isADoctor = title.toLowerCase().startsWith("dr");
//        System.out.println(isADoctor);


//        .endsWith(String suffix)

//        String travisParkAddress = "311 E Travis St, San Antonio, TX 78205";
//        String codeUpZip = "78205";
//        boolean sameZipAsCodeup = travisParkAddress.endsWith(codeUpZip);
//
//        System.out.println(sameZipAsCodeup);


//        .charAt(int index)
        // consider that this method returns a char type and not a String type

//        boolean firstLetterCapitalized = false;
//        String word = "test";
//
//        char firstLetter = word.charAt(0);
//
//        if (firstLetter == Character.toUpperCase(firstLetter)) {
//            firstLetterCapitalized = true;
//        }
////
//        System.out.println(firstLetterCapitalized);


//        .indexOf(String subString)

//        String cat = "cat";
//        System.out.println(cat.indexOf("at"));  //*** If the indexOf returns a -1, there was no match ***


//        .lastIndexOf(String subString)

//        String good = "Good";
//        System.out.println(good.indexOf("o"));


//        .length()

//        String longestWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
//        System.out.println(longestWord.length());


//        .replace(char oldChar, char newChar) // *** This returns a copy *** Replaces every matching instance ***

//        String search = "tiny cats looking cute";
//        String parsedSearch = search.replace("cats", "dogs");
//        System.out.println(parsedSearch);
//
//        System.out.println(search);


//        .substring(int beginIndex[, int endIndex])

//        String name = "Justin Bob Reich";
//        String firstName = name.substring(0, name.indexOf(" "));
//        String newStr = name.replace(" ", ",");
//        System.out.println(newStr);
//
//        String lastName = name.substring(name.lastIndexOf(" ") + 1);
//        System.out.println(firstName);
//        System.out.println(lastName);

//        String name = "Justin Reich";
//        String firstName = name.substring(0, name.indexOf(" "));
//        System.out.println(firstName);
//        String lastName = name.substring(firstName.length() + 1);
//        System.out.println(lastName);



//        .toLowerCase()
//        .toUpperCase()

//        String hello = "hELlo";
//        System.out.println(hello.toUpperCase());
//        System.out.println(hello.toLowerCase());
//        System.out.println(hello);


//        .trim()

//        String input = "   bob      smith \n\n  ";
//        String trimmedInput = input.trim();
//        System.out.println(trimmedInput);
//
//        System.out.print("|" + input + "|");


//         convert word to pig latin word (assume word doesn't begin with a vowel or end in ay)

        //String word1 = "cat";
        //String pigLatinWord = word1
        //    .trim()
        //    .toLowerCase()
        //    .substring(1)
        //    .concat(word1.substring(0, 1).toLowerCase())
        //    .concat("ay");
        //System.out.println(pigLatinWord);




    }

}
