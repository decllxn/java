package Cornerstones_of_OOP.Data_abstraction;

// Java does not support multiple inheritance
// A class can only inherit from one superclass
// It can be achieved with interfaces
// A class can implement multiple interfaces

public class MultipleInterfaces {
    public static void main (String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}

interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

// A class implementing multiple interfaces
class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("This is the first Interface");
    }
    public void myOtherMethod() {
        System.out.println("This is my Second Interface");
    }
}