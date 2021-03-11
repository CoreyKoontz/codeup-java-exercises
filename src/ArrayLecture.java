//import java.util.Arrays;
//
//public class ArrayLecture {
//
//    public static void main(String[] args) {
//
////        // Creating arrays:
////
////        //String array
////        String[] stringArray;
////
////        stringArray = new String[2];
////
////        stringArray[0] = "Corey";
////        stringArray[1] = "Koontz";
////
////        System.out.println(stringArray); // Will give you a reference code
////        System.out.println(Arrays.toString(stringArray));
////
////        // *** Array length is immutable ***
////        stringArray[3]= "Michael"; // Will not work/ Out of bounds
////
////        // Change an elements value:
////        stringArray[1] = "Micheal";
////        System.out.println(Arrays.toString(stringArray));
//
////        System.out.println(Arrays.toString(getByteArray()));
//
//        fillArray(getByteArray());
//
//
//    }
//
//    // If we print this to the console without assigning what will it return?
//    public static byte[] getByteArray(){
//        return new byte[5];
//    }
//
//    public static void fillArray(byte[] arr) {
//        System.out.println(Arrays.toString(arr));
//
//        Arrays.fill(arr, 0, 1, (byte) 1); // addint he 0 and 1 will fill only the first element
//        // .fill will populate every element in the array  // if you dont include the indexes it will fill all elements
//        System.out.println(Arrays.toString(arr));
//    }
//
//
//    public static void fillArray() {
//        int[] intArr = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(intArr));
//    }
//
//    //Build two arrays and compare them:
//    public static void compareStringArrays(){
//        String[] arr1 = fillStringArray(getStringA)
//    }
//}
