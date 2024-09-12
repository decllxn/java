package Cornerstones_of_OOP.Encapsulation;

// The fusion of underlying data with a set of operations that define the
// data type is encapsulation
// The internale representation of the data is encapsulated (hidden)
// but can be manipulated by the specified operations

// The meaning of Encapsulation, is to make sure that sensitive data is hidden from users
// To acieve this you must declare class variables/attributes as private
// And provide public get and set methods to access and update the value of a private variable

// The get method returns the variable value
// The set method sets the value

public class Encapsulation {
    public static void main(String[] args) {
        Person myGirl = new Person();
        // Ste the value of the name variable to "Stacy"
        myGirl.setName("Stacy");
        System.out.println(myGirl.getName());
    }
}

class Person {
    // Private = restricted access
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

// Why Encapsulation?
// Better control of class attributes and methods
// Class attributes can be made read-only, if you only use the get method
// Class attributes can be made write only, if you only use the set method
