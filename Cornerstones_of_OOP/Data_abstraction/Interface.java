package Cornerstones_of_OOP.Data_abstraction;

// Abstraction can also be achieved with interface
// An interface is a completely 'abstract class' that is used to
// group related methods with empty bodies

public class Interface {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}


interface Animal {
    // Interface method (does not have a body)
    public void animalSound();
    public void sleep();
}

// to access the interface methods, the interface must be 'implemented'
// Kinda like inherited by another class with the implements key word
// The body of the interface method is provided by the 'implememt' class

class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: Oink");
    }
    public void sleep() {
        System.out.println("The pig is sleeping");
    }
}
