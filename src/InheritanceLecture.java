public class InheritanceLecture {
}


//-- Pre-Lecture Research Questions
//What is inheritance?
// - Can share variables and methods between parent and child class in Java

//What is the difference between a subclass and a super class?
// - Subclass == Child class / Super Class == Parent Class

//Can a class extend from multiple classes?
// - no

// Can a class be both a parent of another class and child of yet another class?
// - Yes

// What is method overriding?
// - Overriding is like cloning the functionality of the methods on the superclass by creating the same method within the subclass.
// - The new method (in the subclass) must have the same name, return type and parameters
//   as the original method (in the superclass)

// Can a subclass overload methods of it’s parent class?
// - Yes
// - Usually, method overloading happens inside a single class, but a method can also be
//   treated as overloaded in the subclass of that class — because the subclass inherits
//   one version of the method from the parent class and then can have another overloaded
//   version in its class definition.

// What is the difference between private and protected visibility?

// - The private keyword means that fields marked as private cannot
//   be referenced outside of the class that defines them. This includes subclasses.
// - Protected visibility gives us the ability to make a field visible to only a
//   class and its subclasses and not visible to classes that use instances of these classes.
// - Protected

// What are two uses of the “super” keyword in a subclass?
// - The super keyword allows us to access a Super Class's methods
// and constructors from within a subclass.
// - We can use it to call a parent constructor
// - Call the parent implementation of an overrided method

//What is Polymorphism?
// Different implementations of a common code structure

//Can a subclass instance, when stored in a variable of it’s parent type, use methods unique to the subclass?
// - No unless we cast the type

//Aside from defining constants, what are some additional uses of the final keyword?
// 1. prevent a parameter from being reassigned
// 2. prevent a class from being extended


//TODO---------------- Lecture Notes: Inheritance and Polymorphism --------------------------------

// Inheritance:

