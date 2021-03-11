//public class Person {
//
//
//    // 1. Object Basics
//
//    private String name;
//
//    public String getName(){
//        return this.name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void sayHello(){
//        System.out.printf("%nHello %s", this.name);
//    }
//
//    //Constructor:
//    public Person (String name) {
////        System.out.println("The constructor is working");
//        this.name = name;
//    }
//
//    public static void main(String[] args) {
//        Person p1 = new Person("Jim");
//        p1.sayHello();
//        p1.setName("Pam");
//        p1.sayHello();
//        System.out.println(p1.getName());
//

        // 1. Understanding References:

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        // This will return true
//        System.out.println(person1 == person2);
//        // This will return false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        // This is just creating an alias, not a new object
//        System.out.println(person1 == person2);
//        // Will return true because it is the same object

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        // Creating alias
//        System.out.println(person1.getName());
//        // Prints "John"
//        System.out.println(person2.getName());
//        // Prints "John"
//        person2.setName("Jane");
//        // Changes person2 name to "Jane" which in turn changes person1 name to "Jane" as well.
//        System.out.println(person1.getName());
//        // "Jane"
//        System.out.println(person2.getName());
//        // "Jane"

//    }








//}






// TODO ------------- OPP PRE-LECTURE QUESTIONS ----------------------------

//  What is the difference between static and instance methods/variables?

//  - Instance variables are created when an object is created with the use
//    of the keyword 'new' and destroyed when the object is destroyed.
//  - Static variables are created when the program starts and destroyed
//    when the program stops. They are accessible without creating an instance of the class.

//  What is an instance and what is instantiation?

//  - Instantiation is the creation of an instance

//  What is an object in Java?

//  - An object is an instance of a class
//  - Objects have properties and methods, and are
//    instantiated, i.e. created, with the new keyword.

//  What is a class in Java?

//  - A class is used to define a custom type in Java.
//  - A template for objects that will be created based on it.

//  What is the difference between a class and an object?

//  - A class is the template for the object and the object
//    is the instance of the class itself where programmers use variables
//    and methods.  A class is used to bind data as well as methods together
//    as a single unit. Object acts like a variable of the class.

//  What is a constructor?

//  - A constructor is a special method that is called when an object is created.
//  - A constructor has the same name as the class and does not define a return type.
//  - A common use case for constructors is to set, or provide default values
//    for, an object's properties.
//  - Can be overloaded *

//  What are some uses of the ‘final’ keyword?

// - In Java, the final keyword can be used while declaring an entity.
//   Using the final keyword means that the value can't be modified in
//   the future. This entity can be - but is not limited to - a variable,
//   a class or a method.

//  What are some uses of the ‘this’ keyword?
//
//  What are visibility modifiers?
//
//  Why use private visibility?


