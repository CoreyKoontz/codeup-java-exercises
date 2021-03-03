public class SyntaxTypesVariables {

    public static void main(String[] args) {

        //Statements:
        {
            String sentence = "Hi, my name is";
            System.out.println(sentence);
        }
        // Code Blocks
        {
            String sentence = "Hi, my name is";
            System.out.println(/*sentence*/); // inline code
        }
        byte bite = 127;
        System.out.println(
                ((Object) bite)
                        .getClass()
                        .getName());

        short shrt = 32000;
        System.out.println(
                ((Object) shrt)
                        .getClass()
                        .getName());

//        byte bite1 = 111;
//        byte bite2 = 1;
//        var output = bite2 + bite1;
//        System.out.println(
//                ((Object) bite)
//                        .getClass()
//                        .getName());

        int maxVal = 2147483647;
        System.out.println(maxVal + 1);

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue + (maxValue + 3));


    }

}
