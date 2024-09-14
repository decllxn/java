package Hashmaps;

import java.util.HashMap;  // Import the HashMap class

public class More {
    // Key and values in a HashMap are actually objects
    // Remember that a string in Java is an object (not a primitive type)
    public static void main(String[] args) {
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        // Loop through the keys and print each key and its corresponding value
        for (String i : people.keySet()) {
            System.out.println("Key: " + i + " value: " + people.get(i));
        }
    }
}
