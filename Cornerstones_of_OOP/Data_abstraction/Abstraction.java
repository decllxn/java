package Cornerstones_of_OOP.Data_abstraction;

public class Abstraction {
    public static void main(String[] args) {
        // Create an object of Pig
        Pig myPig = new Pig();
        myPig.animalsound();
        myPig.sleep();
    }
}

// This is the oldest cornerstone of OOP
// Data abstraction associates an underlying datatype with a set
// of oerations that may be performed on the data type
// Data abstraction is the process of hiding certain details and showing
// Only essential information to the user

// The Abstract class is a restricted class that cannot be used to create
// Objects (To access it, it must be inherited from another class)

// The Abstract method - Can only be used in an abstract class, and it does not have a body
// The body is provided by the subclass it inherited from

// N.B The Abstract keyword is a non-access modifier, used for classes and methods

// Abstract class
abstract class Animal {
    // Abstract method -(Does not have a body)
    public abstract void animalsound();

    // Regular method
    public void sleep () {
        System.out.println("Zzz...");
    }
}

// Subclass (inherits from Animal)
class Pig extends Animal {
    public void animalsound() {
        // The body of animal provided here
        System.out.println("The pig says: Oink Oink");
    }
}




