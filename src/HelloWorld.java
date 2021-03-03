public class HelloWorld {

    public static void main (String[] args) {
//        System.out.print("Hello, ");
//        System.out.print("World!");

// 1.
//        int myFavoriteNumber = 7;
//        System.out.println(myFavoriteNumber);
        // Prints on the same line as "Hello, World!" for some reason
// 2.
//        String myString = "this is a string";
//        System.out.println(myString);
// 3.
//        myString = "this is a change";
//        System.out.println(myString);
// 4.
//         char myString = 's';
         //Will not allow me to change the value of myString to a char value
// 5.
        // float myString = 3.14159;
        // Will not allow this, saying that mySting has already been declared
// 6.
//         long myNumber;
        // System.out.println(myNumber);
        // Will not allow because myNumber hasn't been initialized
// 7.
//         myNumber = 3.14;
        // This won't work because the type should be float with an F at the end of 3.14
// 8.
//        myNumber = 123L;
//        System.out.println(myNumber);
        //
// 9.
//        float myNumber = 3.14F;
        // Why is this defaulting to a double when we are specifying float???

// 10.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        // this is post-incrementing the value

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        // this is pre-incrementing the value

// 11.
//        var class = 5;
        // class is a reserved word

// 12.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(theNumberThree);
        // Returns:
        //Exception in thread "main" java.lang.ClassCastException:
        // class java.lang.String cannot be cast to class java.lang.Integer
        // (java.lang.String and java.lang.Integer are in module java.base of
        // loader 'bootstrap') at HelloWorld.main(HelloWorld.java:56)

// 13.
//        int x = 4;
//        x+=5;
//        System.out.println(x);

//        int x = 4;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);

// 14.
//        byte tooBig = 127;
//        System.out.println(tooBig+1);



    }

}








// TODO:    What is the difference between compiled and interpreted
//          languages? Static and dynamic? Which is Java, which is JavaScript?
         // -Compiled code is expressed in the instructions of the target machine (machine language).
         //  Interpreted is not directly executed by the target machine, but instead read and executed
         //  by another program who in turn communicates the instructions to the target machine.
         // -Static performs type checking at compile time while dynamic does it at run time
// TODO:    What does a compiler do?
         // Compiles the source code (.java) indo bytecode (.class)
// TODO:    What is a virtual machine?
         // Changes your bytecode into machine code and instructs the machine at a low level
// TODO:    What is the difference between bytecode and source code files?
         // Source code is what the developer writes (human readable)
         // Bytecode is written in hexadecimal code that is not human readable
// TODO:    Do you need the JDK or the JRE to play Minecraft?
         // JRE
// TODO:    Why would you use an IDE?
         // For auto-compiling and for syntax correction
// TODO:    What is the purpose of the out directory?
         // The out directory stores all your compiled class files
// TODO:    Why does Java have multiple number data types? Why use one over the other?
         // I think its for performance reasons and file size control
// TODO:    Is a string a primitive type in Java?
         // No
// TODO:    What is the difference between explicit and implicit casting? What are specific examples?
         // Explicit is when you are going from lower precision to higher precision and it will not
         // work unless you specify it in your code.
         // Implicit is going from Higher precision to lower precision and it will happen implicitly
// TODO:    What are some differences between char and String types?
         // 'char' "String"
// TODO:    What happens if you store a number in a variable greater than the data type’s constraints?
         // it will not work unless you use explicit casting
